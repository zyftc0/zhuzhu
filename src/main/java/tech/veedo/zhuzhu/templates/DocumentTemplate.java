package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.CandidateReport;

public class DocumentTemplate {

    private static DocumentTemplate dt = DocumentTemplate.init();

    private static DocumentTemplate init() {
        if (dt == null) dt = new DocumentTemplate();
        return dt;
    }

    public static String generateXMLStr(CandidateReport report) {
        StringBuffer sb = new StringBuffer();
        sb.append(dt.document1);
        sb.append(TitleTemplate.generateXmlStr(report.getTitle()));
        sb.append(dt.document999);
        System.out.println(sb.toString());
        return sb.toString();
    }

    String document1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
            "<w:document xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" " +
                "xmlns:wpc=\"http://schemas.microsoft.com/office/word/2010/wordprocessingCanvas\" " +
                "xmlns:cx=\"http://schemas.microsoft.com/office/drawing/2014/chartex\" " +
                "xmlns:cx1=\"http://schemas.microsoft.com/office/drawing/2015/9/8/chartex\" " +
                "xmlns:cx2=\"http://schemas.microsoft.com/office/drawing/2015/10/21/chartex\" " +
                "xmlns:cx3=\"http://schemas.microsoft.com/office/drawing/2016/5/9/chartex\" " +
                "xmlns:cx4=\"http://schemas.microsoft.com/office/drawing/2016/5/10/chartex\" " +
                "xmlns:cx5=\"http://schemas.microsoft.com/office/drawing/2016/5/11/chartex\" " +
                "xmlns:cx6=\"http://schemas.microsoft.com/office/drawing/2016/5/12/chartex\" " +
                "xmlns:cx7=\"http://schemas.microsoft.com/office/drawing/2016/5/13/chartex\" " +
                "xmlns:cx8=\"http://schemas.microsoft.com/office/drawing/2016/5/14/chartex\" " +
                "xmlns:mc=\"http://schemas.openxmlformats.org/markup-compatibility/2006\" " +
                "xmlns:aink=\"http://schemas.microsoft.com/office/drawing/2016/ink\" " +
                "xmlns:am3d=\"http://schemas.microsoft.com/office/drawing/2017/model3d\" " +
                "xmlns:o=\"urn:schemas-microsoft-com:office:office\" " +
                "xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\" " +
                "xmlns:m=\"http://schemas.openxmlformats.org/officeDocument/2006/math\" " +
                "xmlns:v=\"urn:schemas-microsoft-com:vml\" " +
                "xmlns:wp14=\"http://schemas.microsoft.com/office/word/2010/wordprocessingDrawing\" " +
                "xmlns:wp=\"http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing\" " +
                "xmlns:w10=\"urn:schemas-microsoft-com:office:word\" " +
                "xmlns:w14=\"http://schemas.microsoft.com/office/word/2010/wordml\" " +
                "xmlns:w15=\"http://schemas.microsoft.com/office/word/2012/wordml\" " +
                "xmlns:w16cid=\"http://schemas.microsoft.com/office/word/2016/wordml/cid\" " +
                "xmlns:w16se=\"http://schemas.microsoft.com/office/word/2015/wordml/symex\" " +
                "xmlns:wpg=\"http://schemas.microsoft.com/office/word/2010/wordprocessingGroup\" " +
                "xmlns:wpi=\"http://schemas.microsoft.com/office/word/2010/wordprocessingInk\" " +
                "xmlns:wne=\"http://schemas.microsoft.com/office/word/2006/wordml\" " +
                "xmlns:wps=\"http://schemas.microsoft.com/office/word/2010/wordprocessingShape\" " +
                "mc:Ignorable=\"w14 w15 w16se w16cid wp14\">" +
                "<w:body>" +
                "        <w:p w14:paraId=\"46AC8459\" w14:textId=\"77777777\" w:rsidR=\"002851BF\" w:rsidRDefault=\"002851BF\" w:rsidP=\"00F94A24\">\n" +
                "            <w:pPr>\n" +
                "                <w:pStyle w:val=\"a5\"/>\n" +
                "                <w:ind w:firstLineChars=\"1364\" w:firstLine=\"2876\"/>\n" +
                "                <w:jc w:val=\"both\"/>\n" +
                "                <w:rPr>\n" +
                "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                "                    <w:color w:val=\"000000\"/>\n" +
                "                    <w:sz w:val=\"21\"/>\n" +
                "                    <w:szCs w:val=\"21\"/>\n" +
                "                </w:rPr>\n" +
                "            </w:pPr>\n" +
                "            <w:r w:rsidRPr=\"005778D5\">\n" +
                "                <w:rPr>\n" +
                "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                "                    <w:color w:val=\"000000\"/>\n" +
                "                    <w:sz w:val=\"21\"/>\n" +
                "                    <w:szCs w:val=\"21\"/>\n" +
                "                </w:rPr>\n" +
                "                <w:t>CANDIDATE REPORT</w:t>\n" +
                "            </w:r>\n" +
                "        </w:p>\n";


    String document999 =
                "</w:body>\n" +
            "</w:document>";
}
