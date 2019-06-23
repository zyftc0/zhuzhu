package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.PersonalInformation;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;

public class PersonalInfoTemplate {

    private static PersonalInfoTemplate pit = PersonalInfoTemplate.init();

    private static PersonalInfoTemplate init() {
        if (pit == null) pit = new PersonalInfoTemplate();
        return pit;
    }

    public static String generateXmlStr(PersonalInformation pi) {
        HashMap<String, Object> params = MyUtils.Object2HashMap(pi);
        StringBuffer sb = new StringBuffer();
        sb.append(part1);
        sb.append(pit.dynamicGenerate(pit.name, params));
        sb.append(pit.dynamicGenerate(pit.gender, params));
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String part1 =
            "        <w:p w14:paraId=\"2B655744\" w14:textId=\"77777777\" w:rsidR=\"002851BF\" w:rsidRPr=\"005778D5\" w:rsidRDefault=\"002851BF\" w:rsidP=\"00F94A24\">\n" +
            "            <w:pPr>\n" +
            "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:b/>\n" +
            "                    <w:bCs/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:u w:val=\"single\"/>\n" +
            "                </w:rPr>\n" +
            "            </w:pPr>\n" +
            "            <w:r w:rsidRPr=\"005778D5\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:b/>\n" +
            "                    <w:bCs/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:u w:val=\"single\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>PERSONAL INFORMATION</w:t>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidR=\"005452F7\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
            "                    <w:b/>\n" +
            "                    <w:bCs/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:u w:val=\"single\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t xml:space=\"preserve\"> </w:t>\n" +
            "            </w:r>\n" +
            "        </w:p>";

    private static final String name =
            "        <w:p w14:paraId=\"NAME\" w14:textId=\"77777777\" w:rsidR=\"00350D09\" w:rsidRPr=\"00350D09\" w:rsidRDefault=\"000930D4\" w:rsidP=\"00F94A24\">\n" +
            "            <w:pPr>\n" +
            "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:lang w:val=\"en-GB\"/>\n" +
            "                </w:rPr>\n" +
            "            </w:pPr>\n" +
            "            <w:commentRangeStart w:id=\"2\"/>\n" +
            "            <w:r>\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:b/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:lang w:val=\"en-GB\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>Name</w:t>\n" +
            "            </w:r>\n" +
            "            <w:r>\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
            "                    <w:b/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:lang w:val=\"en-GB\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>:</w:t>\n" +
            "            </w:r>\n" +
            "            <w:commentRangeEnd w:id=\"2\"/>\n" +
            "            <w:r w:rsidR=\"00397C81\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rStyle w:val=\"af9\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:commentReference w:id=\"2\"/>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidR=\"000452C0\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:lang w:val=\"en-GB\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t>#w#o#name#r#d#</w:t>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidR=\"0076173A\" w:rsidRPr=\"0076173A\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:hint=\"eastAsia\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t xml:space=\"preserve\"> </w:t>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidR=\"002851BF\" w:rsidRPr=\"000930D4\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:lang w:val=\"en-GB\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t xml:space=\"preserve\"> </w:t>\n" +
            "            </w:r>\n" +
            "            <w:r w:rsidR=\"005452F7\">\n" +
            "                <w:rPr>\n" +
            "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
            "                    <w:szCs w:val=\"21\"/>\n" +
            "                    <w:lang w:val=\"en-GB\"/>\n" +
            "                </w:rPr>\n" +
            "                <w:t xml:space=\"preserve\">                                         </w:t>\n" +
            "            </w:r>\n" +
            "        </w:p>";

    private static final String gender =
            "        <w:p w14:paraId=\"GENDER\" w14:textId=\"77777777\" w:rsidR=\"002851BF\" w:rsidRPr=\"004B307F\" w:rsidRDefault=\"002851BF\" w:rsidP=\"00F94A24\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:lang w:val=\"en-GB\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"3\"/>\n" +
                    "            <w:r w:rsidRPr=\"004B307F\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:lang w:val=\"en-GB\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>Gender:</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"3\"/>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"3\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"000452C0\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:lang w:val=\"en-GB\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#gender#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00350D09\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:lang w:val=\"en-GB\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">                                              </w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";
}