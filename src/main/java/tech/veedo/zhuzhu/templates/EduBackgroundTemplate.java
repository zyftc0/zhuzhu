package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.EducationBackground;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;
import java.util.List;

public class EduBackgroundTemplate {

    private static EduBackgroundTemplate ebt = EduBackgroundTemplate.init();

    private static EduBackgroundTemplate init() {
        if (ebt == null) ebt = new EduBackgroundTemplate();
        return ebt;
    }

    public static String generateXmlStr(List<EducationBackground> educationBackgrounds) {
        StringBuffer sb = new StringBuffer();
        sb.append(part1);
        educationBackgrounds.forEach(educationBackground ->
                sb.append(ebt.dynamicGenerate(edu, MyUtils.Object2HashMap(educationBackground))));
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String part1 =
            "        <w:p w14:paraId=\"EDUCATIONBACKGROUND\" w14:textId=\"77777777\" w:rsidR=\"002851BF\" w:rsidRPr=\"001904FE\" w:rsidRDefault=\"002851BF\" w:rsidP=\"001904FE\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:color w:val=\"000000\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:u w:val=\"single\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:r w:rsidRPr=\"005778D5\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:color w:val=\"000000\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:u w:val=\"single\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>EDUCATION BACKGROUND</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String edu =
            "        <w:p w14:paraId=\"EDU0\" w14:textId=\"5EBE548F\" w:rsidR=\"005C110C\" w:rsidRDefault=\"000452C0\" w:rsidP=\"005C110C\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:widowControl/>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:jc w:val=\"left\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#startEduDate#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeStart w:id=\"8\"/>\n" +
                    "            <w:r w:rsidR=\"00D10117\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>-</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#endEduDate#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"001904FE\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">      </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"007B119E\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\"> </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"005C110C\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">  </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#school#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"005C110C\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">     </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#major#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"005C110C\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">             </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00E04915\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#education#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

}
