package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.CandidateReport;

import java.util.concurrent.atomic.AtomicInteger;

public class DocumentTemplate {

    private static DocumentTemplate dt = DocumentTemplate.init();

    private static DocumentTemplate init() {
        if (dt == null) dt = new DocumentTemplate();
        return dt;
    }

    public static String generateXMLStr(CandidateReport report) {
        AtomicInteger count = new AtomicInteger(0);
        StringBuffer sb = new StringBuffer(xmlhead);
//        sb.append(document1)
//                .append(TitleTemplate.generateXmlStr(report.getTitle()))
//                .append(PersonalInfoTemplate.generateXmlStr(report.getPersonalInformation()))
//                .append(CompensationTemplate.generateXmlStr(report.getCompensation()))
//                .append(EduBackgroundTemplate.generateXmlStr(report.getEducationBackgrounds()))
//                .append(document499)
//                .append(document500)
//                .append(WorkExperienceTemplate.generateXmlStr(report.getWorkExperiences()))
//                .append(document550)
//                .append(ProjectExperienceTemplate.generateXmlStr(report.getProjectExperiences()))
//                .append(document650)
//                .append(RemarkTemplate.generateXmlStr(report.getRemarks()))
//                .append(document999);

        sb.append(documentOpen);
        sb.append(bodyOpen);

        sb.append(WorkExperienceTemplate.generateXmlStr(report.getWorkExperiences(), count));
        sb.append(ProjectExperienceTemplate.generateXmlStr(report.getProjectExperiences(), count));
        sb.append(RemarkTemplate.generateXmlStr(report.getRemarks()));
        sb.append(tail);
        sb.append(bodyClose);
        sb.append(documentClose);
        return sb.toString();
    }

    private static final String xmlhead = "<?xml version='1.0' encoding='UTF-8' standalone='yes'?>";

    private static final String documentOpen =
            "<w:document xmlns:w='http://schemas.openxmlformats.org/wordprocessingml/2006/main' " +
                    "xmlns:wpc='http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas' " +
                    "xmlns:cx='http://schemas.microsoft.com/office/drawing/2014/chartex' " +
                    "xmlns:cx1='http://schemas.microsoft.com/office/drawing/2015/9/8/chartex' " +
                    "xmlns:cx2='http://schemas.microsoft.com/office/drawing/2015/10/21/chartex' " +
                    "xmlns:cx3='http://schemas.microsoft.com/office/drawing/2016/5/9/chartex' " +
                    "xmlns:cx4='http://schemas.microsoft.com/office/drawing/2016/5/10/chartex' " +
                    "xmlns:cx5='http://schemas.microsoft.com/office/drawing/2016/5/11/chartex' " +
                    "xmlns:cx6='http://schemas.microsoft.com/office/drawing/2016/5/12/chartex' " +
                    "xmlns:cx7='http://schemas.microsoft.com/office/drawing/2016/5/13/chartex' " +
                    "xmlns:cx8='http://schemas.microsoft.com/office/drawing/2016/5/14/chartex' " +
                    "xmlns:mc='http://schemas.openxmlformats.org/markup-compatibility/2006' " +
                    "xmlns:aink='http://schemas.microsoft.com/office/drawing/2016/ink' " +
                    "xmlns:am3d='http://schemas.microsoft.com/office/drawing/2017/model3d' " +
                    "xmlns:o='urn:schemas-microsoft-com:office:office' " +
                    "xmlns:r='http://schemas.openxmlformats.org/officeDocument/2006/relationships' " +
                    "xmlns:m='http://schemas.openxmlformats.org/officeDocument/2006/math' " +
                    "xmlns:v='urn:schemas-microsoft-com:vml' " +
                    "xmlns:wp14='http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing' " +
                    "xmlns:wp='http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing' " +
                    "xmlns:w10='urn:schemas-microsoft-com:office:word' " +
                    "xmlns:w14='http://schemas.microsoft.com/office/word/2010/wordml' " +
                    "xmlns:w15='http://schemas.microsoft.com/office/word/2012/wordml' " +
                    "xmlns:w16cid='http://schemas.microsoft.com/office/word/2016/wordml/cid' " +
                    "xmlns:w16se='http://schemas.microsoft.com/office/word/2015/wordml/symex' " +
                    "xmlns:wpg='http://schemas.microsoft.com/office/word/2010/wordprocessingGroup' " +
                    "xmlns:wpi='http://schemas.microsoft.com/office/word/2010/wordprocessingInk' " +
                    "xmlns:wne='http://schemas.microsoft.com/office/word/2006/wordml' " +
                    "xmlns:wps='http://schemas.microsoft.com/office/word/2010/wordprocessingShape' " +
                    "mc:Ignorable='w14 w15 w16se w16cid wp14'>";

    private static final String bodyOpen = "<w:body>";

    private static final String tail =
            "<w:sectPr w:rsidR='000452C0' w:rsidRPr='000452C0' w:rsidSect='00B76183'>" +
                    "<w:headerReference w:type='default' r:id='rId11'/>" +
                    "<w:footerReference w:type='even' r:id='rId12'/>" +
                    "<w:footerReference w:type='default' r:id='rId13'/>" +
                    "<w:pgSz w:w='12240' w:h='15840'/>" +
                    "<w:pgMar w:top='810' w:right='1608' w:bottom='900' w:left='1701' w:header='720' w:footer='720' w:gutter='0'/>" +
                    "<w:cols w:space='720'/>" +
                    "</w:sectPr>";

    private static final String bodyClose = "</w:body>";

    private static final String documentClose = "</w:document>";
    
}
