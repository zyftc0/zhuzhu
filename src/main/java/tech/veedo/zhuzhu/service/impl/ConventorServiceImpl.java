package tech.veedo.zhuzhu.service.impl;

import org.docx4j.Docx4J;
import org.docx4j.TraversalUtil;
import org.docx4j.XmlUtils;
import org.docx4j.finders.ClassFinder;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import tech.veedo.zhuzhu.entity.*;
import tech.veedo.zhuzhu.parts.TitlePart;
import tech.veedo.zhuzhu.service.ConventorService;
import tech.veedo.zhuzhu.sets.ColorSet;
import tech.veedo.zhuzhu.sets.RFontsSet;
import tech.veedo.zhuzhu.utils.MyUtils;

import javax.xml.bind.JAXBException;
import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ConventorServiceImpl implements ConventorService {

    @Value("${template.path}")
    private String templatePath;



    public static void main(String[] args) throws IOException, Docx4JException, JAXBException {
        CandidateReport report = new CandidateReport();
        {
            Title title = new Title()
                    .setPost("八十万禁军教头")
                    .setPostLocation("汴梁");
            PersonalInformation pi = new PersonalInformation()
                    .setName("盖伦20190626")
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
                    .setCompanyInfomation("this is chaofhnahjioejfio ada ")
                    .setLeader("董事长")
                    .setSubordinateCount("19")
                    .setJobContent("我二姨不知道干啥")
                    .setPerformance("你谬比就完事了")
                    .setReason("不想干了");
            workExperiences.add(w1);
            WorkExperience w2 = new WorkExperience()
                    .setStartJobDate("2020.01")
                    .setEndJobDate("2020.10")
                    .setCompanyName("zhongtiejian")
                    .setCompanyPost("总裁")
                    .setCompanyInfomation("this is chaofhnahjioejfio ada ")
                    .setLeader("董事长")
                    .setSubordinateCount("19")
                    .setJobContent("我二姨不知道干啥")
                    .setPerformance("你谬比123就完事了")
                    .setReason("不想干了");
            workExperiences.add(w2);

            List<ProjectExperience> projectExperiences = new ArrayList<>();
            ProjectExperience p1 = new ProjectExperience()
                    .setStartProjDate("2020.02")
                    .setEndProjDate("2020.09")
                    .setProjectName("wooo")
                    .setProjectPost("军团长1")
                    .setProjectContent("带兵打仗")
                    .setProjectDuty("不知道")
                    .setProjectPerformance("赢了");
            projectExperiences.add(p1);
            ProjectExperience p2 = new ProjectExperience()
                    .setStartProjDate("2020.02")
                    .setEndProjDate("2020.09")
                    .setProjectName("wooo")
                    .setProjectPost("军团长321")
                    .setProjectContent("带兵打仗")
                    .setProjectDuty("不知321道")
                    .setProjectPerformance("赢了");
            projectExperiences.add(p2);

            List<Remark> remarks = new ArrayList<>();
            Remark r1 = new Remark()
                    .setRemark("啊啊");
            remarks.add(r1);
            Remark r2 = new Remark()
                    .setRemark("我是沐浴着党的阳光，在党的教育下成长起来的。在成长的历程中，我的父母家人对我的世界观、人生观和价值观的树立，起到了非常重要的作用，在我很小的时候，他们就带着我观看革命影片，给我讲述革命先烈的英雄事迹，让红色的种子从小就在我的心中生根发芽，让党的光辉形象伴随");
            remarks.add(r2);

            report.setTitle(title)
                    .setPersonalInformation(pi)
                    .setCompensation(compensation)
                    .setEducationBackgrounds(educationBackgrounds)
                    .setWorkExperiences(workExperiences)
                    .setProjectExperiences(projectExperiences)
                    .setRemarks(remarks);
        }

        // 原始模板文件路径：
        String oriTemplateDir = "classpath:templates/";
        String oriTemplateDocx = "document.docx";
        String oriTemplateXml = "document.xml";
        // 生成的中转路径
        String tmpDir = "C:/Users/50689/Desktop/IO/tmp/";
        String tmpXml = "document.xml";
        // 目标文件存放路径
        String outDirPath = "/Users/ifzhang/Downloads/";  // mac
//        String outDirPath = "C:/Users/50689/Desktop/IO/";  // windows
        String finalDocxName = "final"+System.currentTimeMillis()+".docx";

        // create a new package
//        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
//        // get the main part w:document
//        MainDocumentPart body = wordMLPackage.getMainDocumentPart();
//
//        List<P> titlePs = TitlePart.generate(report.getTitle());
//        titlePs.forEach(p -> body.addObject(p));

        WordprocessingMLPackage wordMLPackage = Docx4J.load(ResourceUtils.getFile(oriTemplateDir + oriTemplateDocx));
        MainDocumentPart body = wordMLPackage.getMainDocumentPart();

        ClassFinder classFinder = new ClassFinder(P.class);
        new TraversalUtil(body.getContent(), classFinder);
        List<Object> results = classFinder.results;


        {
            // remark
            Integer remarkIndex = results.size()-1;
            P remarkP = (P) results.get(remarkIndex);

            List<HashMap<String, String>> remarkMaps = report.getRemarks().stream()
                    .map(remark -> MyUtils.Object2HashMap(remark))
                    .collect(Collectors.toList());
            String remarkStr = XmlUtils.marshaltoString(remarkP);

            remarkMaps.forEach(map -> {
                try {
                    P newRemark = (P) XmlUtils.unmarshallFromTemplate(remarkStr, map);
                    body.getContent().add(newRemark);
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            });

            body.getContent().remove(remarkP);
        }

        {
            // project
        }

        {
            // work
        }

        {
            // edu
            Integer[] eduIndexs = {13};

            StringBuffer sb = new StringBuffer();
            Arrays.stream(eduIndexs).forEach(i -> {
                P p = (P) results.get(i);
                sb.append(XmlUtils.marshaltoString(p));
                body.getContent().remove(p);
            });

            String eduStr = sb.toString();

            List<HashMap<String, String>> eduMaps = report.getEducationBackgrounds().stream()
                    .map(educationBackground -> MyUtils.Object2HashMap(educationBackground))
                    .collect(Collectors.toList());

            Stream.iterate(0, i -> i+1).limit(eduMaps.size()).forEach(i -> {
                HashMap<String, String> map = eduMaps.get(i);
                try {
                    P newEdu = (P) XmlUtils.unmarshallFromTemplate(eduStr, map);
                    body.getContent().add(eduIndexs[0]+i, newEdu);
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            });

        }

        {
            // title personalInfomation compensation
            HashMap<String, String> totalMap = new HashMap<>();
            totalMap.putAll(MyUtils.Object2HashMap(report.getTitle()));
            totalMap.putAll(MyUtils.Object2HashMap(report.getPersonalInformation()));
            totalMap.putAll(MyUtils.Object2HashMap(report.getCompensation()));
            body.variableReplace(totalMap);
        }

        {
            File file = new File(outDirPath + finalDocxName);
            if (!file.exists()) file.createNewFile();
            wordMLPackage.save(file);
        }







//        // 1.获取xml，并根据获取的对象，生成临时xml
//        {
//            String doctmp = DocumentTemplate.generateXMLStr(report);
//            Document doc = DocumentHelper.parseText(doctmp);
//
//            OutputFormat of = new OutputFormat();
//            of.setEncoding("UTF-8");
//            of.setNewlines(true);
//            of.setIndent(true);
//            of.setIndent("    ");
//
//            XMLWriter writer = new XMLWriter(of);
//
//            File file = new File(tmpDir + tmpXml);
//            if (!file.exists()) file.createNewFile();
//            writer.setOutputStream(new FileOutputStream(file));
//            writer.write(doc);
//            writer.flush();
//            writer.close();
//        }

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

//        {
//            // 临时xml文件
//            File file = new File(tmpDir + tmpXml);
//            // 获取docx原始模板文件
//            File oriDocx = ResourceUtils.getFile(oriTemplateDir + oriTemplateDocx);
//            ZipFile zipFile = new ZipFile(oriDocx);
//
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
