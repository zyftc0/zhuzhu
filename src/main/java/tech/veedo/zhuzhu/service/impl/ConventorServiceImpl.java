package tech.veedo.zhuzhu.service.impl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import tech.veedo.zhuzhu.entity.*;
import tech.veedo.zhuzhu.service.ConventorService;
import tech.veedo.zhuzhu.utils.MyUtils;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

@Service
public class ConventorServiceImpl implements ConventorService {

    @Value("${template.path}")
    private String templatePath;

    public static void main(String[] args) throws IOException, TemplateException {
        HashMap<String, Object> total = new HashMap<>();
        {
            Title title = new Title()
                    .setPost("八十万禁军教头")
                    .setPostLocation("汴梁");
            PersonalInformation pi = new PersonalInformation()
                    .setName("盖伦")
                    .setGender(0)
                    .setBirthyear("1993")
                    .setHomeAddress("德玛西亚")
                    .setMaritalStatus(1);
            Compensation compensation = new Compensation()
                    .setCompensation("234W");

            List<EducationBackground> educationBackgrounds = new ArrayList<>();
            EducationBackground e1 = new EducationBackground()
                    .setStartEduDate("2018.01")
                    .setEndEduDate("2018.10")
                    .setSchool("东北林业大学")
                    .setMajor("软件工程")
                    .setEducation("学士");
            EducationBackground e2 = new EducationBackground()
                    .setStartEduDate("2019.01")
                    .setEndEduDate("2019.06")
                    .setSchool("东北林业大学2")
                    .setMajor("软件a 程")
                    .setEducation("学 3 士");
            educationBackgrounds.add(e1);
            educationBackgrounds.add(e2);

            List<WorkExperience> workExperiences = new ArrayList<>();
            WorkExperience w1 = new WorkExperience()
                    .setStartJobDate("2020.01")
                    .setEndJobDate("2020.10")
                    .setCompanyName("zhongtiejian")
                    .setCompanyPost("总裁")
                    .setCompanyInfomation("this is chaofhnahjioejfio \n ada ")
                    .setLeader("董事长")
                    .setSubordinateCount("19")
                    .setJobContent("我二姨不知道干啥")
                    .setPerformance("你谬比就完事了")
                    .setReason("不想干了");
            workExperiences.add(w1);

            List<ProjectExperience> projectExperiences = new ArrayList<>();
            ProjectExperience p1 = new ProjectExperience()
                    .setStartProjDate("2020.02")
                    .setEndProjDate("2020.09")
                    .setProjectName("wooo")
                    .setProjectPost("军团长")
                    .setProjectContent("带兵打仗")
                    .setProjectDuty("不知道")
                    .setProjectPerformance("赢了");
            projectExperiences.add(p1);

            List<Remark> remarks = new ArrayList<>();
            Remark r1 = new Remark()
                    .setRemark("啊啊");
            remarks.add(r1);

            HashMap<String, Object> titleMap = MyUtils.Object2HashMap(title);
            HashMap<String, Object> piMap = MyUtils.Object2HashMap(pi);
            HashMap<String, Object> compensationMap = MyUtils.Object2HashMap(compensation);
            HashMap<String, Object> eduMap = MyUtils.List2HashMap(educationBackgrounds);
            HashMap<String, Object> workMap = MyUtils.List2HashMap(workExperiences);
            HashMap<String, Object> projectMap = MyUtils.List2HashMap(projectExperiences);
            HashMap<String, Object> remarkMap = MyUtils.List2HashMap(remarks);
            total.putAll(titleMap);
            total.putAll(piMap);
            total.putAll(compensationMap);
            total.putAll(eduMap);
            total.putAll(workMap);
            total.putAll(projectMap);
            total.putAll(remarkMap);
        }


        // 模板文件路径：
        String templateFilePath = "classpath:templates/";
        String templateDocxName = "document.docx";
        String templateXmlName = "document.xml";

        // 目标文件存放路径
//        String outDirPath = "/Users/ifzhang/Downloads/";  // mac
        String outDirPath = "D:/";  // windows
        String tmpXmlName = "temp.xml";
        String finalDocxName = "final.docx";

        {
            File templateXmlPath = ResourceUtils.getFile(templateFilePath);
            Configuration configuration = new Configuration(new Version("2.3.0"));
            configuration.setDefaultEncoding("UTF-8");
            // 加载模板数据（从文件路径中获取文件，其他方式，可百度查找）
            configuration.setDirectoryForTemplateLoading(templateXmlPath);
            // 获取模板实例
            Template template = configuration.getTemplate(templateXmlName);
            template.setOutputEncoding("UTF-8");

            //将模板和数据模型合并生成文件
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outDirPath + tmpXmlName)),"UTF-8"));
            //生成xmldocx文件
            template.process(total, out);
            out.flush();
            out.close();
        }

        File file = new File(outDirPath + tmpXmlName);
        File docxFile = ResourceUtils.getFile(templateFilePath + templateDocxName);
        ZipFile zipFile = new ZipFile(docxFile);
        Enumeration<? extends ZipEntry> zipEntrys = zipFile.entries();
        ZipOutputStream zipout = new ZipOutputStream(new FileOutputStream(outDirPath + finalDocxName));
        int len;
        byte[] buffer = new byte[1024];
        while (zipEntrys.hasMoreElements()) {
            ZipEntry next = zipEntrys.nextElement();
            InputStream is = zipFile.getInputStream(next);
            // 把输入流的文件传到输出流中 如果是word/document.xml由我们输入
            zipout.putNextEntry(new ZipEntry(next.toString()));
            if ("word/document.xml".equals(next.toString())) {
                InputStream in = new FileInputStream(file);
                while ((len = in.read(buffer)) != -1) {
                    zipout.write(buffer, 0, len);
                }
                in.close();
            } else {
                while ((len = is.read(buffer)) != -1) {
                    zipout.write(buffer, 0, len);
                }
                is.close();
            }
        }
        zipout.close();
    }

}
