package tech.veedo.zhuzhu.sets;

import org.docx4j.wml.RFonts;
import org.docx4j.wml.STHint;
import org.springframework.beans.BeanUtils;
import tech.veedo.zhuzhu.enums.RFontsEnum;

public class RFontsSet {

    private static RFontsSet set = RFontsSet.init();

    private static RFontsSet init() {
        if (set == null) set = new RFontsSet();
        return set;
    }

    private RFonts arial;

    private RFonts songTi;

    public static RFonts getArial() {
        return generate(RFontsEnum.ARIAL);
    }

    public static RFonts getSongTi() {
        return generate(RFontsEnum.SONGTI);
    }

    public static RFonts getSongTiWithHint() {
        RFonts rf = generate(RFontsEnum.SONGTI);
        rf.setHint(STHint.EAST_ASIA);
        return rf;
    }

    private static RFonts generate(RFontsEnum rFontsEnum) {
        switch (rFontsEnum) {
            case ARIAL:
                if (set.arial == null) {
                    set.arial = new RFonts();
                    setProps(set.arial, rFontsEnum);
                }
                return set.arial;
            case SONGTI:
                if (set.songTi == null) {
                    set.songTi = new RFonts();
                    setPropsEastAsia(set.songTi, rFontsEnum);
                }
                return set.songTi;
        }

        return null;
    }

    private static void setProps(RFonts rFonts, RFontsEnum rFontsEnum) {
        rFonts.setAscii(rFontsEnum.getStr());
        rFonts.setHAnsi(rFontsEnum.getStr());
        rFonts.setCs(rFontsEnum.getStr());
    }

    private static void setPropsEastAsia(RFonts rFonts, RFontsEnum rFontsEnum) {
        setProps(rFonts, RFontsEnum.ARIAL);
        rFonts.setEastAsia(rFontsEnum.getStr());
    }

}
