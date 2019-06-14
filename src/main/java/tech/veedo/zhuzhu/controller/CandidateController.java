package tech.veedo.zhuzhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.veedo.zhuzhu.entity.CandidateReport;
import tech.veedo.zhuzhu.service.ConventorService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private ConventorService conventorService;

    @GetMapping("/generatereport")
    public void generateReport(CandidateReport report) {

    }

}
