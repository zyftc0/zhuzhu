package tech.veedo.zhuzhu.service.impl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXWriter;
import org.dom4j.io.XMLWriter;
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

    public static void main(String[] args) throws IOException, TemplateException, DocumentException {
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
                    .setSchool("东北打麻将大学2")
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

        // 原始模板文件路径：
        String oriTemplateDir = "classpath:templates/";
        String oriTemplateDocx = "document.docx";
        String oriTemplateXml = "document.xml";
        // 生成的中转路径
        String tmpDir = "C:/Users/50689/Desktop/IO/tmp/";
        String tmpXml = "document.xml";
        // 目标文件存放路径
//        String outDirPath = "/Users/ifzhang/Downloads/";  // mac
        String outDirPath = "C:/Users/50689/Desktop/IO/";  // windows
        String finalDocxName = "final"+System.currentTimeMillis()+".docx";

        // 1.获取xml，并根据获取的对象，生成临时xml
        {
            // 创建SAXReader的对象reader
            SAXReader reader = new SAXReader();
            // 通过reader对象的read方法加载xml文件,获取docuemnt对象。
            Document document = reader.read(ResourceUtils.getFile(oriTemplateDir + oriTemplateXml));


            Node EDUCATIONBACKGROUND = document.selectSingleNode("p[@paraId='EDUCATIONBACKGROUND']");



            // 通过document对象获取根节点
            Element root = document.getRootElement();
            Element body = root.element("body");

            {
                List<Element> elements = body.elements("p");
                elements.forEach(element -> System.out.println(element.attributeValue("paraId")));

            }


//            List<Element> ps = body.elements();
//            Element EDUCATIONBACKGROUND = ps.stream()
//                    .filter(p -> p.attributeValue("paraId").equals("EDUCATIONBACKGROUND"))
//                    .findAny().orElse(null);
//
//            Element EDU1 = ps.stream()
//                    .filter(p -> p.attributeValue("paraId").equals("EDU1"))
//                    .findAny().orElse(null);
//
//
//            educationBackgrounds.forEach(educationBackground -> {
//
////                DocumentHelper.createElement()
//                EDUCATIONBACKGROUND.appendContent(EDU1);
//            });
//
//            System.out.println(document.asXML());
//
//            OutputFormat of = new OutputFormat();
//            of.setEncoding("UTF-8");
//            of.setNewlines(true);
//            of.setIndent(true);
//            of.setIndent("    ");
//
//            XMLWriter writer = new XMLWriter(of);
//
//            File file = new File(templateFilePath + real);
//            if (!file.exists()) file.createNewFile();
//            writer.setOutputStream(new FileOutputStream(file));
//            writer.write(document);
//            writer.flush();
//            writer.close();
        }

//        {
//            // 模板路径
//            File oriTemplatePath = ResourceUtils.getFile(oriTemplateDir);
//
//            Configuration configuration = new Configuration(new Version("2.3.0"));
//            configuration.setDefaultEncoding("UTF-8");
//            // 加载模板数据（从文件路径中获取文件，其他方式，可百度查找）
//            configuration.setDirectoryForTemplateLoading(oriTemplatePath);
//            // 获取模板实例
//            Template template = configuration.getTemplate(oriTemplateXml);
//            template.setOutputEncoding("UTF-8");
//
//            //将模板和数据模型合并生成文件
//            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(tmpDir + tmpXml)),"UTF-8"));
//            //生成临时xml模板文件
//            template.process(total, out);
//            out.flush();
//            out.close();
//        }
//
//        {
//            // 临时xml文件
//            File file = new File(tmpDir + tmpXml);
//            // 获取docx文件
//            File oriDocx = ResourceUtils.getFile(oriTemplateDir + oriTemplateDocx);
//
//            ZipFile zipFile = new ZipFile(oriDocx);
//            Enumeration<? extends ZipEntry> zipEntrys = zipFile.entries();
//            ZipOutputStream zipout = new ZipOutputStream(new FileOutputStream(outDirPath + finalDocxName));
//            int len;
//            byte[] buffer = new byte[1024];
//            while (zipEntrys.hasMoreElements()) {
//                ZipEntry next = zipEntrys.nextElement();
//                InputStream is = zipFile.getInputStream(next);
//                // 把输入流的文件传到输出流中 如果是word/document.xml由我们输入
//                zipout.putNextEntry(new ZipEntry(next.toString()));
//                if ("word/document.xml".equals(next.toString())) {
//                    InputStream in = new FileInputStream(file);
//                    while ((len = in.read(buffer)) != -1) {
//                        zipout.write(buffer, 0, len);
//                    }
//                    in.close();
//                } else {
//                    while ((len = is.read(buffer)) != -1) {
//                        zipout.write(buffer, 0, len);
//                    }
//                    is.close();
//                }
//            }
//            zipout.close();
//        }
    }

}
