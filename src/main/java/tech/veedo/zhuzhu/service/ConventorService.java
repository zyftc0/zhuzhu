package tech.veedo.zhuzhu.service;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import tech.veedo.zhuzhu.entity.CandidateReport;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface ConventorService {

    CandidateReport getDataFormat();

    void generateReport(HttpServletResponse response, CandidateReport report) throws IOException, Docx4JException, JAXBException;

//    void downloadFile(HttpServletResponse response, String finalDocxName) throws IOException;

}
