package tech.veedo.zhuzhu.controller;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.veedo.zhuzhu.entity.CandidateReport;
import tech.veedo.zhuzhu.service.ConventorService;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private ConventorService conventorService;

    @GetMapping("/dataformat")
    public CandidateReport getDataFormat() {
        return conventorService.getDataFormat();
    }

    @PostMapping("/generatereport")
    public void generateReport(@RequestBody CandidateReport report, HttpServletResponse response) throws JAXBException, IOException, Docx4JException {
        conventorService.generateReport(response, report);
    }

    @GetMapping("/download/{filename}")
    public void downloadFile(@PathVariable String filename, HttpServletResponse response) throws IOException {
//        conventorService.downloadFile(response, filename);
    }

}
