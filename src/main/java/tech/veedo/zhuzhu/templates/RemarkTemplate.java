package tech.veedo.zhuzhu.templates;

import tech.veedo.zhuzhu.entity.Remark;
import tech.veedo.zhuzhu.utils.MyUtils;
import tech.veedo.zhuzhu.utils.StringUtils;

import java.util.HashMap;
import java.util.List;

public class RemarkTemplate {

    private static RemarkTemplate rt = RemarkTemplate.init();

    private static RemarkTemplate init() {
        if (rt == null) rt = new RemarkTemplate();
        return rt;
    }

    public static String generateXmlStr(List<Remark> remarks) {
        StringBuffer sb = new StringBuffer(StringUtils.format(remarktitle, "paraId", MyUtils.getWordIdStringRandom()));
        remarks.forEach(remark -> {
            HashMap<String, Object> params = MyUtils.Object2HashMap(remark);
            sb.append(rt.dynamicGenerate(StringUtils.format(rt.remark, "paraId", MyUtils.getWordIdStringRandom()), params));
        });
        sb.append(StringUtils.format(enter, "paraId", MyUtils.getWordIdStringRandom()));
        return sb.toString();
    }

    private String dynamicGenerate(String origin, HashMap<String, Object> params) {
        return StringUtils.format(origin, params);
    }

    private static final String remarktitle =
            "<w:p w14:paraId='#W#O#paraId#R#D#' w14:textId='77777777' w:rsidR='005137DB' w:rsidRPr='00996D23' w:rsidRDefault='00EB798E' w:rsidP='003F3477'>" +
            "<w:pPr>" +
            "<w:spacing w:line='360' w:lineRule='auto'/>" +
            "</w:pPr>" +
            "<w:commentRangeStart w:id='29'/>" +
            "<w:r w:rsidRPr='003F3477'>" +
            "<w:rPr>" +
            "<w:rFonts w:ascii='宋体' w:hAnsi='宋体' w:hint='eastAsia'/>" +
            "<w:b/>" +
            "<w:szCs w:val='21'/>" +
            "</w:rPr>" +
            "<w:t>核心优势：</w:t>" +
            "</w:r>" +
            "<w:commentRangeEnd w:id='29'/>" +
            "<w:r w:rsidR='00397C81'>" +
            "<w:rPr>" +
            "<w:rStyle w:val='af9'/>" +
            "</w:rPr>" +
            "<w:commentReference w:id='29'/>" +
            "</w:r>" +
            "</w:p>";
    private static final String remark =
            "<w:p w14:paraId='#W#O#paraId#R#D#' w14:textId='77777777' w:rsidR='00A917E9' w:rsidRDefault='00B945FB' w:rsidP='00B945FB'>" +
            "<w:pPr>" +
            "<w:pStyle w:val='af0'/>" +
            "<w:numPr>" +
            "<w:ilvl w:val='0'/>" +
            "<w:numId w:val='35'/>" +
            "</w:numPr>" +
            "<w:spacing w:line='360' w:lineRule='auto'/>" +
            "<w:ind w:firstLineChars='0'/>" +
            "<w:rPr>" +
            "<w:rFonts w:ascii='宋体' w:hAnsi='宋体'/>" +
            "<w:color w:val='000000'/>" +
            "<w:sz w:val='22'/>" +
            "</w:rPr>" +
            "</w:pPr>" +
            "<w:r>" +
            "<w:rPr>" +
            "<w:rFonts w:ascii='Arial' w:hAnsi='Arial' w:cs='Arial' w:hint='eastAsia'/>" +
            "<w:iCs/>" +
            "<w:szCs w:val='21'/>" +
            "</w:rPr>" +
            "<w:t>#W#O#remark#R#D#</w:t>" +
            "</w:r>" +
            "</w:p>";
    private static final String enter =
            "<w:p w14:paraId='#W#O#paraId#R#D#' w14:textId='77777777' w:rsidR='000452C0' w:rsidRPr='000452C0' w:rsidRDefault='000452C0' w:rsidP='000452C0'>" +
                    "<w:pPr>" +
                    "<w:rPr>" +
                    "<w:rFonts w:ascii='宋体' w:hAnsi='宋体'/>" +
                    "<w:sz w:val='22'/>" +
                    "</w:rPr>" +
                    "</w:pPr>" +
                    "</w:p>";
}
