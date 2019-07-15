package tech.veedo.zhuzhu.service.impl;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeUtility;
import lombok.extern.slf4j.Slf4j;
import org.docx4j.Docx4J;
import org.docx4j.TraversalUtil;
import org.docx4j.XmlUtils;
import org.docx4j.finders.ClassFinder;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.*;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ResourceUtils;
import tech.veedo.zhuzhu.entity.*;
import tech.veedo.zhuzhu.service.ConventorService;
import tech.veedo.zhuzhu.utils.MyUtils;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.*;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Service
public class ConventorServiceImpl implements ConventorService {

    @Override
    public CandidateReport getDataFormat() {
        CandidateReport report = new CandidateReport();
        {
            report.setCompany("德玛西亚");
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
        return report;
    }

    @Override
    public void generateReport(HttpServletResponse response, CandidateReport report) throws IOException, Docx4JException, JAXBException {
        // 原始模板文件路径：
        String oriTemplateDir = "classpath:templates/";
        String oriTemplateDocx = "document.docx";

        String finalDocxName = report.getPersonalInformation().getName()
                +"-"
                +report.getCompany()
                +"-"
                +report.getTitle().getPost()
                +"-"
                +report.getTitle().getPostLocation()
                +"-"
                +"科锐国际"
                +"-"
                +format.format(LocalDate.now())
                +".docx";

        WordprocessingMLPackage wordMLPackage = Docx4J.load(ResourceUtils.getFile(oriTemplateDir + oriTemplateDocx));
        MainDocumentPart body = wordMLPackage.getMainDocumentPart();

        ClassFinder classFinder = new ClassFinder(P.class);
        new TraversalUtil(body.getContent(), classFinder);
        List<Object> results = classFinder.results;

        // remark
        {
            P remarkP = (P) results.get(results.size()-1);
            body.getContent().remove(remarkP);

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
        }

        // project
        {
            Integer[] proIndexs = {25, 26, 27, 28, 29};
            List<HashMap<String, String>> proMaps = report.getProjectExperiences().stream()
                    .map(projectExperience -> MyUtils.Object2HashMap(projectExperience))
                    .collect(Collectors.toList());
            generateListPart(body, results, proIndexs, proMaps, true);
        }

        // work
        {
            Integer[] workIndexs = {16, 17, 18, 19, 21, 22};

            List<HashMap<String, String>> workMaps = report.getWorkExperiences().stream()
                    .map(workExperience -> MyUtils.Object2HashMap(workExperience))
                    .collect(Collectors.toList());
            generateListPart(body, results, workIndexs, workMaps, true);
        }

        // edu
        {
            Integer[] eduIndexs = {13};

            List<HashMap<String, String>> eduMaps = report.getEducationBackgrounds().stream()
                    .map(educationBackground -> MyUtils.Object2HashMap(educationBackground))
                    .collect(Collectors.toList());

            generateListPart(body, results, eduIndexs, eduMaps, false);
        }

        // title personalInfomation compensation
        {
            HashMap<String, String> totalMap = new HashMap<>();
            totalMap.putAll(MyUtils.Object2HashMap(report.getTitle()));
            totalMap.putAll(MyUtils.Object2HashMap(report.getPersonalInformation()));
            totalMap.putAll(MyUtils.Object2HashMap(report.getCompensation()));
            body.variableReplace(totalMap);
        }

        // save
        {
            File file = new File(MyUtils.getOutDirPath() + finalDocxName);
            if (!file.exists()) file.createNewFile();
            wordMLPackage.save(file);
        }

        // download
        {
            OutputStream os = response.getOutputStream();//获取输出流
            response.reset();
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(finalDocxName, "UTF-8"));
            response.setHeader("Access-Control-Expose-Headers", URLEncoder.encode(finalDocxName, "UTF-8"));
            response.setCharacterEncoding("utf-8");

            wordMLPackage.save(os);

            os.flush();
            os.close();
        }
    }

    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM");

    private static void generateListPart(MainDocumentPart body, List<Object> results, Integer[] indexs, List<HashMap<String, String>> maps, boolean enter) {
        if (CollectionUtils.isEmpty(maps)) {
            body.getContent().remove(indexs[0]-1);
        } else {
            List<String> strs = new ArrayList<>();
            Arrays.stream(indexs).forEach(i -> {
                P p = (P) results.get(i);
                strs.add(XmlUtils.marshaltoString(p));
                body.getContent().remove(p);
            });

            List<P> ps = new ArrayList<>();
            Stream.iterate(0, i -> i+1).limit(maps.size()).forEach(i -> {
                HashMap<String, String> map = maps.get(i);

                strs.forEach(str -> {
                    try {
                        P newPro = (P) XmlUtils.unmarshallFromTemplate(str, map);
                        ps.add(newPro);
                    } catch (JAXBException e) {
                        log.error(e.getMessage());
                    }
                });
                if (enter) ps.add(new P());
            });
            if (enter) ps.remove(ps.size()-1);
            body.getContent().addAll(indexs[0], ps);
        }
    }

}
