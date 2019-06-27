package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.WorkExperience;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class WorkExperienceTemplate {

    private static WorkExperienceTemplate wet = WorkExperienceTemplate.init();

    private static WorkExperienceTemplate init() {
        if (wet == null) wet = new WorkExperienceTemplate();
        return wet;
    }

    public static String generateXmlStr(List<WorkExperience> workExperiences, AtomicInteger count) {
        StringBuffer sb = new StringBuffer(StringUtils.format(workTitle, "paraId", MyUtils.getWordIdStringRandom()));
        Stream.iterate(0, integer -> integer + 1).limit(workExperiences.size()).forEach(i -> {
            HashMap<String, Object> params = MyUtils.Object2HashMap(workExperiences.get(i));
            sb
                    .append(wet.dynamicGenerate(StringUtils.format(workPart1, "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(wet.dynamicGenerate(StringUtils.format(StringUtils.format(workPart2, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
//                    .append(wet.dynamicGenerate(StringUtils.format(StringUtils.format(workPart4, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
//                    .append(wet.dynamicGenerate(StringUtils.format(StringUtils.format(workPart5, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(wet.dynamicGenerate(StringUtils.format(StringUtils.format(workPart6, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(wet.dynamicGenerate(StringUtils.format(StringUtils.format(workPart7, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(wet.dynamicGenerate(StringUtils.format(StringUtils.format(workPart8, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
            ;
            if (i+1!=workExperiences.size()) {
                sb.append(StringUtils.format(workEnter, "paraId", MyUtils.getWordIdStringRandom()));
            }
        });
        sb.append(StringUtils.format(workTailEnter, "paraId", MyUtils.getWordIdStringRandom()));
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String workTitle =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00E71030\" w:rsidRPr=\"0082265F\" w:rsidRDefault=\"002851BF\" w:rsidP=\"00F94A24\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "          <w:u w:val=\"single\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:r w:rsidRPr=\"005778D5\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "          <w:u w:val=\"single\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t xml:space=\"preserve\">SUMMARY OF </w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"006A1162\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "          <w:u w:val=\"single\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t xml:space=\"preserve\">WORK </w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidRPr=\"005778D5\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "          <w:u w:val=\"single\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>EXPERIENCE</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String workPart1 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00872833\" w:rsidRPr=\"008F5525\" w:rsidRDefault=\"00E04915\" w:rsidP=\"00CC4B1C\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#startJobDate#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00872833\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>-</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#endJobDate#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00872833\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t xml:space=\"preserve\">\t\t\t\t</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#companyName#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"008F5525\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t xml:space=\"preserve\">\t\t\t\t</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:eastAsiaTheme=\"majorEastAsia\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#companyPost#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";
    private static final String workPart2 =
            "    <w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"008F5525\" w:rsidRDefault=\"00E04915\" w:rsidP=\"008F5525\">\n" +
//                    "      <w:pPr>\n" +
//                    "        <w:widowControl/>\n" +
//                    "        <w:shd w:val=\"clear\" w:color=\"auto\" w:fill=\"FFFFFF\"/>\n" +
//                    "        <w:spacing w:line=\"390\" w:lineRule=\"atLeast\"/>\n" +
//                    "        <w:rPr>\n" +
//                    "          <w:rFonts w:ascii=\"微软雅黑\" w:eastAsia=\"微软雅黑\" w:hAnsi=\"微软雅黑\"/>\n" +
//                    "          <w:i/>\n" +
//                    "          <w:color w:val=\"000000\"/>\n" +
//                    "          <w:szCs w:val=\"21\"/>\n" +
//                    "        </w:rPr>\n" +
//                    "      </w:pPr>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"微软雅黑\" w:eastAsia=\"微软雅黑\" w:hAnsi=\"微软雅黑\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:i/>\n" +
                    "          <w:color w:val=\"000000\"/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t xml:space=\"preserve\">#W#O#companyInfomation#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String workPart4 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00C31DF8\" w:rsidRPr=\"00C31DF8\" w:rsidRDefault=\"00397C81\" w:rsidP=\"008F5525\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:widowControl/>\n" +
                    "        <w:shd w:val=\"clear\" w:color=\"auto\" w:fill=\"FFFFFF\"/>\n" +
                    "        <w:spacing w:line=\"390\" w:lineRule=\"atLeast\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidRPr=\"00C31DF8\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>汇报对象：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidR=\"00397C81\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rStyle w:val=\"af9\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:commentReference w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00E04915\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#leader#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String workPart5 =
            "    <w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00C31DF8\" w:rsidRPr=\"00C31DF8\" w:rsidRDefault=\"00C31DF8\" w:rsidP=\"008F5525\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:widowControl/>\n" +
                    "        <w:shd w:val=\"clear\" w:color=\"auto\" w:fill=\"FFFFFF\"/>\n" +
                    "        <w:spacing w:line=\"390\" w:lineRule=\"atLeast\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidRPr=\"00C31DF8\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>直接下属：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidR=\"00397C81\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rStyle w:val=\"af9\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:commentReference w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00E04915\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#subordinateCount#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:bookmarkStart w:id=\"6\" w:name=\"_GoBack\"/>\n" +
                    "      <w:bookmarkEnd w:id=\"6\"/>" +
                    "    </w:p>";

    private static final String workPart6 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:pStyle w:val=\"af0\"/>\n" +
                    "        <w:numPr>\n" +
                    "          <w:ilvl w:val=\"0\"/>\n" +
                    "          <w:numId w:val=\"31\"/>\n" +
                    "        </w:numPr>\n" +
                    "        <w:wordWrap w:val=\"0\"/>\n" +
                    "        <w:spacing w:after=\"75\" w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:ind w:firstLineChars=\"0\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:r w:rsidRPr=\"00BC14EC\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>工作内容：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00B945FB\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#jobContent#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String workPart7 =
            "    <w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00397C81\" w:rsidP=\"002305F5\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:numPr>\n" +
                    "          <w:ilvl w:val=\"0\"/>\n" +
                    "          <w:numId w:val=\"1\"/>\n" +
                    "        </w:numPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>工作业绩：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidR=\"00E04915\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#performance#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String workPart8 =
            "    <w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"007F2B12\" w:rsidRDefault=\"00872833\" w:rsidP=\"007F2B12\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:numPr>\n" +
                    "          <w:ilvl w:val=\"0\"/>\n" +
                    "          <w:numId w:val=\"1\"/>\n" +
                    "        </w:numPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidRPr=\"008F5525\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>看机会原因：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidR=\"00E04915\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#reason#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String workEnter =
            "\t<w:p w14:paraId=\"0AEFB709\" w14:textId=\"77777777\" w:rsidR=\"005B45D6\" w:rsidRPr=\"005B45D6\" w:rsidRDefault=\"00530885\" w:rsidP=\"005B45D6\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "    </w:p>";

    private static final String workTailEnter =
            "\t<w:p w14:paraId=\"722A1FC9\" w14:textId=\"77777777\" w:rsidR=\"00301D27\" w:rsidRPr=\"00397C81\" w:rsidRDefault=\"00301D27\" w:rsidP=\"003F3477\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"宋体\" w:hAnsi=\"宋体\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "    </w:p>";

}
