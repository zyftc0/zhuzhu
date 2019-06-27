package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.ProjectExperience;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ProjectExperienceTemplate {

    private static ProjectExperienceTemplate pet = ProjectExperienceTemplate.init();

    private static ProjectExperienceTemplate init() {
        if (pet == null) pet = new ProjectExperienceTemplate();
        return pet;
    }

    public static String generateXmlStr(List<ProjectExperience> projectExperiences, AtomicInteger count) {
        StringBuffer sb = new StringBuffer(StringUtils.format(projectTitle, "paraId", MyUtils.getWordIdStringRandom()));
        Stream.iterate(0, integer -> integer + 1).limit(projectExperiences.size()).forEach(i -> {
            HashMap<String, Object> params = MyUtils.Object2HashMap(projectExperiences.get(i));
            sb.append(pet.dynamicGenerate(StringUtils.format(projectPart1, "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(pet.dynamicGenerate(StringUtils.format(StringUtils.format(projectPart2, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(pet.dynamicGenerate(StringUtils.format(StringUtils.format(projectPart3, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(pet.dynamicGenerate(StringUtils.format(StringUtils.format(projectPart4, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params))
                    .append(pet.dynamicGenerate(StringUtils.format(StringUtils.format(projectPart5, "num", count.incrementAndGet()), "paraId", MyUtils.getWordIdStringRandom()), params));
            if (i+1!=projectExperiences.size()) {
                sb.append(StringUtils.format(projectEnter, "paraId", MyUtils.getWordIdStringRandom()));
            }
        });
        sb.append(StringUtils.format(projectTailEnter, "paraId", MyUtils.getWordIdStringRandom()));
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String projectTitle =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"008017F3\" w:rsidRDefault=\"008017F3\" w:rsidP=\"008017F3\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:pStyle w:val=\"10\"/>\n" +
                    "        <w:tabs>\n" +
                    "          <w:tab w:val=\"left\" w:pos=\"2268\"/>\n" +
                    "          <w:tab w:val=\"left\" w:pos=\"2410\"/>\n" +
                    "        </w:tabs>\n" +
                    "        <w:spacing w:before=\"0\" w:beforeAutospacing=\"0\" w:after=\"0\" w:afterAutospacing=\"0\" w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:kern w:val=\"2\"/>\n" +
                    "          <w:sz w:val=\"21\"/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "          <w:u w:val=\"single\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:r w:rsidRPr=\"00646157\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:kern w:val=\"2\"/>\n" +
                    "          <w:sz w:val=\"21\"/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "          <w:u w:val=\"single\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>PROJECT EXPERIENCE</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String projectPart1 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00B945FB\" w:rsidP=\"00397C81\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#startProjDate#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00397C81\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>-</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#endProjDate#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00397C81\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t xml:space=\"preserve\">\t\t\t\t\t\t\t\t</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:proofErr w:type=\"spellStart\"/>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:b/>\n" +
                    "          <w:bCs/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#projectName#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:proofErr w:type=\"spellEnd\"/>\n" +
                    "    </w:p>";

    private static final String projectPart2 =
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
                    "        <w:t>项目职务：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00B945FB\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#projectPost#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String projectPart3 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00397C81\" w:rsidRPr=\"00D90FBF\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
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
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidRPr=\"00D90FBF\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>项目介绍：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rStyle w:val=\"af9\"/>\n" +
                    "          <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:commentReference w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00B945FB\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#projectContent#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String projectPart4 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:pStyle w:val=\"af0\"/>\n" +
                    "        <w:numPr>\n" +
                    "          <w:ilvl w:val=\"0\"/>\n" +
                    "          <w:numId w:val=\"31\"/>\n" +
                    "        </w:numPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:ind w:firstLineChars=\"0\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidRPr=\"00D90FBF\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>项目职责：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rStyle w:val=\"af9\"/>\n" +
                    "          <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:commentReference w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00B945FB\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"宋体\" w:hAnsi=\"宋体\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:sz w:val=\"22\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#projectDuty#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String projectPart5 =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"3CE2DBE4\" w:rsidR=\"00397C81\" w:rsidRPr=\"005B45D6\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:pStyle w:val=\"af0\"/>\n" +
                    "        <w:numPr>\n" +
                    "          <w:ilvl w:val=\"0\"/>\n" +
                    "          <w:numId w:val=\"31\"/>\n" +
                    "        </w:numPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:ind w:firstLineChars=\"0\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:commentRangeStart w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r w:rsidRPr=\"00D90FBF\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>项目业绩：</w:t>\n" +
                    "      </w:r>\n" +
                    "      <w:commentRangeEnd w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      <w:r>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rStyle w:val=\"af9\"/>\n" +
                    "          <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:commentReference w:id=\"#W#O#num#R#D#\"/>\n" +
                    "      </w:r>\n" +
                    "      <w:r w:rsidR=\"00B945FB\">\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"宋体\" w:hAnsi=\"宋体\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:sz w:val=\"22\"/>\n" +
                    "        </w:rPr>\n" +
                    "        <w:t>#W#O#projectPerformance#R#D#</w:t>\n" +
                    "      </w:r>\n" +
                    "    </w:p>";

    private static final String projectEnter =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"005B45D6\" w:rsidRPr=\"005B45D6\" w:rsidRDefault=\"005B45D6\" w:rsidP=\"005B45D6\">\n" +
                    "      <w:pPr>\n" +
                    "        <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "        <w:rPr>\n" +
                    "          <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "          <w:iCs/>\n" +
                    "          <w:szCs w:val=\"21\"/>\n" +
                    "        </w:rPr>\n" +
                    "      </w:pPr>\n" +
                    "      <w:bookmarkStart w:id=\"24\" w:name=\"_GoBack\"/>\n" +
                    "      <w:bookmarkEnd w:id=\"24\"/>\n" +
                    "    </w:p>";

    private static final String projectTailEnter =
            "\t<w:p w14:paraId=\"#W#O#paraId#R#D#\" w14:textId=\"77777777\" w:rsidR=\"00301D27\" w:rsidRPr=\"00397C81\" w:rsidRDefault=\"00301D27\" w:rsidP=\"003F3477\">\n" +
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
