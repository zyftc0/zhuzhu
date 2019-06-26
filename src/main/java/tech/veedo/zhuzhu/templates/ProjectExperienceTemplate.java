package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.ProjectExperience;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;
import java.util.List;

public class ProjectExperienceTemplate {

    private static ProjectExperienceTemplate pet = ProjectExperienceTemplate.init();

    private static ProjectExperienceTemplate init() {
        if (pet == null) pet = new ProjectExperienceTemplate();
        return pet;
    }

    public static String generateXmlStr(List<ProjectExperience> projectExperiences) {
        StringBuffer sb = new StringBuffer(projectTitle);
        projectExperiences.forEach(projectExperience -> {
            HashMap<String, Object> params = MyUtils.Object2HashMap(projectExperience);
            sb.append(pet.dynamicGenerate(pet.project, params));
        });
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String projectTitle =
            "        <w:p w14:paraId=\"PROJECTEXPTITLE\" w14:textId=\"77777777\" w:rsidR=\"008017F3\" w:rsidRDefault=\"008017F3\" w:rsidP=\"008017F3\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:pStyle w:val=\"10\"/>\n" +
                    "                <w:tabs>\n" +
                    "                    <w:tab w:val=\"left\" w:pos=\"2268\"/>\n" +
                    "                    <w:tab w:val=\"left\" w:pos=\"2410\"/>\n" +
                    "                </w:tabs>\n" +
                    "                <w:spacing w:before=\"0\" w:beforeAutospacing=\"0\" w:after=\"0\" w:afterAutospacing=\"0\" w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:kern w:val=\"2\"/>\n" +
                    "                    <w:sz w:val=\"21\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:u w:val=\"single\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:proofErr w:type=\"gramStart\"/>\n" +
                    "            <w:r w:rsidRPr=\"00646157\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:kern w:val=\"2\"/>\n" +
                    "                    <w:sz w:val=\"21\"/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                    <w:u w:val=\"single\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">PROJECT EXPERIENCE</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:proofErr w:type=\"gramEnd\"/>\n" +
                    "        </w:p>\n";

    private static final String project =
            "        <w:p w14:paraId=\"PROJECTEXPERIENCE\" w14:textId=\"5C70CB8B\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00B945FB\" w:rsidP=\"00397C81\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#startProjDate#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>-</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#endProjDate#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\" w:rsidRPr=\"00296498\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">    </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">                </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\" w:rsidRPr=\"008017F3\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">   </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\" w:rsidRPr=\"008017F3\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\"> </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">       </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00397C81\" w:rsidRPr=\"003A7B1F\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t xml:space=\"preserve\">  </w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:b/>\n" +
                    "                    <w:bCs/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#projectName#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>\n" +
                    "        <w:p w14:paraId=\"PROPOST\" w14:textId=\"48588E3B\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:pStyle w:val=\"af0\"/>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"31\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:wordWrap w:val=\"0\"/>\n" +
                    "                <w:spacing w:after=\"75\" w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:ind w:firstLineChars=\"0\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"15\"/>\n" +
                    "            <w:r w:rsidRPr=\"00BC14EC\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>项目职务：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"15\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                    <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"15\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00B945FB\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#projectPost#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:bookmarkStart w:id=\"16\" w:name=\"_GoBack\"/>\n" +
                    "            <w:bookmarkEnd w:id=\"16\"/>\n" +
                    "        </w:p>\n" +
                    "        <w:p w14:paraId=\"PROCONTENT\" w14:textId=\"48B92FD4\" w:rsidR=\"00397C81\" w:rsidRPr=\"00D90FBF\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:pStyle w:val=\"af0\"/>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"31\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:wordWrap w:val=\"0\"/>\n" +
                    "                <w:spacing w:after=\"75\" w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:ind w:firstLineChars=\"0\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"17\"/>\n" +
                    "            <w:r w:rsidRPr=\"00D90FBF\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>项目介绍：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"17\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                    <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"17\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00B945FB\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#projectContent#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>\n" +
                    "        <w:p w14:paraId=\"PRODUTY\" w14:textId=\"7C23ADE6\" w:rsidR=\"00397C81\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:pStyle w:val=\"af0\"/>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"31\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:ind w:firstLineChars=\"0\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"18\"/>\n" +
                    "            <w:r w:rsidRPr=\"00D90FBF\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>项目职责：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"18\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                    <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"18\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00B945FB\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"宋体\" w:hAnsi=\"宋体\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:sz w:val=\"22\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#projectDuty#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>\n" +
                    "        <w:p w14:paraId=\"PROPERFORMANCE\" w14:textId=\"691E709A\" w:rsidR=\"00397C81\" w:rsidRPr=\"002305F5\" w:rsidRDefault=\"00397C81\" w:rsidP=\"00397C81\">\n" +
                    "            <w:pPr>\n" +
                    "                <w:pStyle w:val=\"af0\"/>\n" +
                    "                <w:numPr>\n" +
                    "                    <w:ilvl w:val=\"0\"/>\n" +
                    "                    <w:numId w:val=\"31\"/>\n" +
                    "                </w:numPr>\n" +
                    "                <w:spacing w:line=\"360\" w:lineRule=\"auto\"/>\n" +
                    "                <w:ind w:firstLineChars=\"0\"/>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "            </w:pPr>\n" +
                    "            <w:commentRangeStart w:id=\"19\"/>\n" +
                    "            <w:r w:rsidRPr=\"00D90FBF\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"Arial\" w:hAnsi=\"Arial\" w:cs=\"Arial\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:iCs/>\n" +
                    "                    <w:szCs w:val=\"21\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>项目业绩：</w:t>\n" +
                    "            </w:r>\n" +
                    "            <w:commentRangeEnd w:id=\"19\"/>\n" +
                    "            <w:r>\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rStyle w:val=\"af9\"/>\n" +
                    "                    <w:rFonts w:ascii=\"Times New Roman\" w:hAnsi=\"Times New Roman\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:commentReference w:id=\"19\"/>\n" +
                    "            </w:r>\n" +
                    "            <w:r w:rsidR=\"00B945FB\">\n" +
                    "                <w:rPr>\n" +
                    "                    <w:rFonts w:ascii=\"宋体\" w:hAnsi=\"宋体\" w:hint=\"eastAsia\"/>\n" +
                    "                    <w:sz w:val=\"22\"/>\n" +
                    "                </w:rPr>\n" +
                    "                <w:t>#w#o#projectPerformance#r#d#</w:t>\n" +
                    "            </w:r>\n" +
                    "        </w:p>\n";
}
