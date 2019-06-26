package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.Compensation;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;

public class CompensationTemplate {

    private static CompensationTemplate ct = CompensationTemplate.init();

    private static CompensationTemplate init() {
        if (ct == null) ct = new CompensationTemplate();
        return ct;
    }

    public static String generateXmlStr(Compensation compensation) {
        StringBuffer sb = new StringBuffer();
        sb.append(ct.dynamicGenerate(ct.compensation, MyUtils.Object2HashMap(compensation)));
        sb.append(part1);
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String compensation =
            "        <w:p w14:paraId=\"COMPENSATION\" w14:textId=\"77777777\" w:rsidR=\"004D3CF8\" w:rsidRDefault=\"002A6C22\" w:rsidP=\"0054234B\">" +
            "            <w:pPr>" +
            "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>" +
            "                <w:rPr>" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>" +
            "                    <w:b/>" +
            "                    <w:bCs/>" +
            "                    <w:szCs w:val=\"21\"/>" +
            "                </w:rPr>" +
            "            </w:pPr>" +
            "            <w:commentRangeStart w:id=\"7\"/>" +
            "            <w:r>" +
            "                <w:rPr>" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>" +
            "                    <w:b/>" +
            "                    <w:bCs/>" +
            "                    <w:szCs w:val=\"21\"/>" +
            "                </w:rPr>" +
            "                <w:t>目前薪资：税前综合年薪</w:t>" +
            "            </w:r>" +
            "            <w:commentRangeEnd w:id=\"7\"/>" +
            "            <w:r w:rsidR=\"00397C81\">" +
            "                <w:rPr>" +
            "                    <w:rStyle w:val=\"af9\"/>" +
            "                </w:rPr>" +
            "                <w:commentReference w:id=\"7\"/>" +
            "            </w:r>" +
            "            <w:r w:rsidR=\"000452C0\">" +
            "                <w:rPr>" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>" +
            "                    <w:b/>" +
            "                    <w:bCs/>" +
            "                    <w:szCs w:val=\"21\"/>" +
            "                </w:rPr>" +
            "                <w:t>#w#o#compensation#r#d#</w:t>" +
            "            </w:r>" +
            "            <w:r>" +
            "                <w:rPr>" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>" +
            "                    <w:b/>" +
            "                    <w:bCs/>" +
            "                    <w:szCs w:val=\"21\"/>" +
            "                </w:rPr>" +
            "                <w:t>左右</w:t>" +
            "            </w:r>" +
            "        </w:p>";

    private static final String part1 =
            "        <w:p w14:paraId=\"16FF0DAC\" w14:textId=\"77777777\" w:rsidR=\"002A6C22\" w:rsidRPr=\"002A6C22\" w:rsidRDefault=\"002A6C22\" w:rsidP=\"0054234B\">" +
            "            <w:pPr>" +
            "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>" +
            "                <w:rPr>" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>" +
            "                    <w:b/>" +
            "                    <w:bCs/>" +
            "                    <w:szCs w:val=\"21\"/>" +
            "                </w:rPr>" +
            "            </w:pPr>" +
            "        </w:p>";

}
