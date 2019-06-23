package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.Title;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;

public class TitleTemplate {

    private static TitleTemplate tt = TitleTemplate.init();

    private static TitleTemplate init() {
        if (tt == null) tt = new TitleTemplate();
        return tt;
    }

    public static String generateXmlStr(Title title) {
        return tt.dynamicGenerate(tt.title, MyUtils.Object2HashMap(title));
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> titleMap) {
        return StringUtils.format(title, titleMap);
    }

    private static final String title =
            "       <w:p w14:paraId=\"TITLE\" w14:textId=\"77777777\" w:rsidR=\"00E27EC2\" w:rsidRPr=\"002B2EEC\" w:rsidRDefault=\"002851BF\" w:rsidP=\"002B2EEC\">\n" +
            "            <w:pPr>\n" +
            "                <w:pStyle w:val=\"a5\"/>\n" +
            "                <w:ind w:firstLineChars=\"1000\" w:firstLine=\"2108\"/>\n" +
            "                <w:jc w:val=\"both\"/>\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:eastAsia=\"宋体\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:color w:val=\"000000\"/>\n" +
            "                    <w:sz w:val=\"21\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                </w:rPr>\n" +
            "            </w:pPr>\n" +
            "            <w:commentRangeStart w:id=\"0\"/>\n" +
            "            <w:r w:rsidRPr=\"00332820\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:color w:val=\"000000\"/>\n" +
            "                    <w:sz w:val=\"21\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>Recommend Position:</w:t>\n" +
            "            </w:r>\n" +
            "            <w:commentRangeEnd w:id=\"0\"/>\n" +
            "            <w:r w:rsidR=\"00397C81\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rStyle w:val=\"af9\"/>\n" +
            "                    <w:rFonts w:eastAsia=\"宋体\"/>\n" +
            "                    <w:b w:val=\"0\"/>\n" +
            "                    <w:kern w:val=\"2\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:commentReference w:id=\"0\"/>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidRPr=\"00332820\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:color w:val=\"000000\"/>\n" +
            "                    <w:sz w:val=\"21\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t xml:space=\"preserve\"> </w:t>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidR=\"000452C0\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:eastAsia=\"宋体\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
            "                    <w:color w:val=\"000000\"/>\n" +
            "                    <w:sz w:val=\"21\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>#w#o#post#r#d#</w:t>\n" +
            "            </w:r>\n" +
            "            <w:commentRangeStart w:id=\"1\"/>\n" +
            "            <w:r w:rsidRPr=\"00332820\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:eastAsia=\"宋体\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:color w:val=\"000000\"/>\n" +
            "                    <w:sz w:val=\"21\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>-</w:t>\n" +
            "            </w:r>\n" +
            "            <w:commentRangeEnd w:id=\"1\"/>\n" +
            "            <w:r w:rsidR=\"000452C0\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:eastAsia=\"宋体\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
            "                    <w:color w:val=\"000000\"/>\n" +
            "                    <w:sz w:val=\"21\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>#w#o#postLocation#r#d#</w:t>\n" +
            "            </w:r>\n" +
            "        </w:p>\n";

}
