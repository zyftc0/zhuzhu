package tech.veedo.zhuzhu.service.impl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tech.veedo.zhuzhu.entity.CandidateReport;
import tech.veedo.zhuzhu.entity.Compensation;
import tech.veedo.zhuzhu.entity.PersonalInformation;
import tech.veedo.zhuzhu.service.ConventorService;
import tech.veedo.zhuzhu.utils.MyUtils;

import java.io.*;
import java.util.HashMap;

@Service
public class ConventorServiceImpl implements ConventorService {

    @Value("${template.path}")
    private String templatePath;

    public static void main(String[] args) throws IOException, TemplateException {
        PersonalInformation pi = new PersonalInformation()
                .setName("盖伦")
                .setGender(0)
                .setBirthyear("1993")
                .setHomeAddress("德玛西亚")
                .setMaritalStatus(1);
        Compensation compensation = new Compensation()
                .setCompensation("234W");
        CandidateReport report = new CandidateReport()
                .setPersonalInformation(pi)
                .setCompensation(compensation);

        // 模板文件路径：
        String templetFilePath = "classpath:templates/template.xml";
        // 目标文件存放路径
        String targetFilePath = "D:/测试模板(xml格式).doc";
        HashMap<String, Object> total = new HashMap<>();
        HashMap<String, Object> piMap = MyUtils.Object2HashMap(pi);
        HashMap<String, Object> compensationMap = MyUtils.Object2HashMap(compensation);
        total.putAll(piMap);
        total.putAll(compensationMap);

        xml2XmlDoc(piMap, templetFilePath, targetFilePath);
    }

    /**
     * 将xml模板转换为后缀为doc文件，本质仍是属于xml
     * @param dataMap	需要填充到模板的数据
     * @param templetFilePath	模板文件路径
     * @param targetFilePath	目标文件保存路径
     * @throws IOException
     * @throws TemplateException
     */
    public static void xml2XmlDoc(HashMap<String, Object> dataMap, String templetFilePath, String targetFilePath) throws IOException, TemplateException {
        // 将模板文件路径拆分为文件夹路径和文件名称
//        String tempLetDir = templetFilePath.substring(0,templetFilePath.lastIndexOf("/"));
        // 注意：templetFilePath.lastIndexOf("/")中，有的文件分隔符为：\ 要注意文件路径的分隔符
        String templetName = templetFilePath.substring(templetFilePath.lastIndexOf("/")+1);
        // 将目标文件保存路径拆分为文件夹路径和文件名称
        String targetDir = targetFilePath.substring(0,targetFilePath.lastIndexOf("/"));
        String targetName = targetFilePath.substring(targetFilePath.lastIndexOf("/")+1);

        // 如果目标文件目录不存在，则需要创建
        File file = new File(targetDir);
        if(!file.exists()){
            file.mkdirs();
        }

        Version version = new Version("2.3.0");
        Configuration configuration = new Configuration(version);
        configuration.setDefaultEncoding("UTF-8");
        // 加载模板数据（从文件路径中获取文件，其他方式，可百度查找）
        configuration.setDirectoryForTemplateLoading(new File(templetFilePath));
        // 获取模板实例
        Template template = configuration.getTemplate(templetName);
        File outFile = new File(targetDir + File.separator + targetName);
        //将模板和数据模型合并生成文件
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8"));

        //生成文件
        template.process(dataMap, out);
        out.flush();
        out.close();
    }

}
