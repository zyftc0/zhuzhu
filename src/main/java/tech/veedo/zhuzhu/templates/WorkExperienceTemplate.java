package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.WorkExperience;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;
import java.util.List;

public class WorkExperienceTemplate {

    private static WorkExperienceTemplate wet = WorkExperienceTemplate.init();

    private static WorkExperienceTemplate init() {
        if (wet == null) wet = new WorkExperienceTemplate();
        return wet;
    }

    public static String generateXmlStr(List<WorkExperience> workExperiences) {
        StringBuffer sb = new StringBuffer();
        sb.append(part1);
        workExperiences.forEach(workExperience -> {
            HashMap<String, Object> params = MyUtils.Object2HashMap(workExperience);
            sb.append(wet.dynamicGenerate(wet.workExperience, params))
                    .append(wet.dynamicGenerate(wet.companyInfo, params))
                    .append(part2)
                    .append(wet.dynamicGenerate(wet.leader, params))
                    .append(wet.dynamicGenerate(wet.subCount, params))
                    .append(wet.dynamicGenerate(wet.jobContent, params))
                    .append(wet.dynamicGenerate(wet.performance, params))
                    .append(wet.dynamicGenerate(wet.reason, params));
        });



        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String part1 =
            "        <w:p w14:paraId=\"WORKEXPTITLE\" w14:textId=\"77777777\" w:rsidR=\"00E71030\" w:rsidRPr=\"0082265F\" w:rsidRDefault=\"002851BF\" w:rsidP=\"00F94A24\">\n" +
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
                    "                <w:t xml:space=\"preserve\">SUMMARY OF </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"006A1162\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:u w:val=\"single\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">WORK </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidRPr=\"005778D5\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:u w:val=\"single\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>EXPERIENCE</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String workExperience =
            "        <w:p w14:paraId=\"WORKEXPERIENCE\" w14:textId=\"2448D3CB\" w:rsidR=\"00872833\" w:rsidRPr=\"008F5525\" w:rsidRDefault=\"00E04915\" w:rsidP=\"00CC4B1C\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#startJobDate#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00872833\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>-</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#endJobDate#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00872833\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">             </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#companyName#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"008F5525\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">              </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#companyPost#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String companyInfo =
            "        <w:p w14:paraId=\"COMPANYINFO\" w14:textId=\"1050D33C\" w:rsidR=\"008F5525\" w:rsidRDefault=\"00E04915\" w:rsidP=\"008F5525\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:widowControl/>\n" +
                    "                <w:shd w:val=\"clear\" w:color=\"auto\" w:fill=\"FFFFFF\"/>\n" +
                    "                <w:spacing w:line=\"390\" w:lineRule=\"atLeast\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"微软雅黑\" w:eastAsia=\"微软雅黑\" w:hAnsi=\"微软雅黑\"/>\n" +
                    "                    <w:i/>\n" +
                    "                    <w:color w:val=\"000000\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"微软雅黑\" w:eastAsia=\"微软雅黑\" w:hAnsi=\"微软雅黑\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:i/>\n" +
                    "                    <w:color w:val=\"000000\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#companyInfomation#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeStart w:id=\"9\"/>\n" +
                    "        </w:p>";

    private static final String part2 = "<w:commentRangeEnd w:id=\"9\"/>";

    private static final String leader =
            "        <w:p w14:paraId=\"LEADER\" w14:textId=\"1119B703\" w:rsidR=\"00C31DF8\" w:rsidRPr=\"00C31DF8\" w:rsidRDefault=\"00397C81\" w:rsidP=\"008F5525\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:widowControl/>\n" +
                    "                <w:shd w:val=\"clear\" w:color=\"auto\" w:fill=\"FFFFFF\"/>\n" +
                    "                <w:spacing w:line=\"390\" w:lineRule=\"atLeast\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"9\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeStart w:id=\"10\"/>\n" +
                    "            <w:r w:rsidR=\"00C31DF8\" w:rsidRPr=\"00C31DF8\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>汇报对象：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"10\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"10\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00E04915\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#leader#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String subCount =
            "        <w:p w14:paraId=\"SUBCOUNT\" w14:textId=\"56011C07\" w:rsidR=\"00C31DF8\" w:rsidRPr=\"00C31DF8\" w:rsidRDefault=\"00C31DF8\" w:rsidP=\"008F5525\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:widowControl/>\n" +
                    "                <w:shd w:val=\"clear\" w:color=\"auto\" w:fill=\"FFFFFF\"/>\n" +
                    "                <w:spacing w:line=\"390\" w:lineRule=\"atLeast\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"11\"/>\n" +
                    "            <w:r w:rsidRPr=\"00C31DF8\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>直接下属：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"11\"/>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"11\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00E04915\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#subordinateCount#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String jobContent =
            "        <w:p w14:paraId=\"JOBCONTENT\" w14:textId=\"3B66F051\" w:rsidR=\"008F5525\" w:rsidRDefault=\"00872833\" w:rsidP=\"002305F5\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"1\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"12\"/>\n" +
                    "            <w:r w:rsidRPr=\"008F5525\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>工作内容：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"12\"/>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"12\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00E04915\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#jobContent#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String performance =
            "        <w:p w14:paraId=\"PERFORMANCE\" w14:textId=\"5CC0EF9B\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00397C81\" w:rsidP=\"002305F5\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"1\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"13\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>工作业绩：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"13\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"13\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00E04915\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#performance#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

    private static final String reason =
            "        <w:p w14:paraId=\"REASON\" w14:textId=\"6850A040\" w:rsidR=\"007F2B12\" w:rsidRPr=\"007F2B12\" w:rsidRDefault=\"00872833\" w:rsidP=\"007F2B12\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"1\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"14\"/>\n" +
                    "            <w:r w:rsidRPr=\"008F5525\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>看机会原因：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"14\"/>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"14\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00E04915\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#reason#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>";

}
