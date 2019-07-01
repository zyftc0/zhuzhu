package tech.veedo.zhuzhu.sets;

import org.docx4j.wml.Color;
import tech.veedo.zhuzhu.enums.ColorEnum;

public class ColorSet {

    private static ColorSet set = ColorSet.init();

    private static ColorSet init() {
        if (set == null) set = new ColorSet();
        return set;
    }

    private Color black;

    public static Color getBlack() {
        return generate(ColorEnum.BLACK);
    }

    private static Color generate(ColorEnum colorEnum) {
        switch (colorEnum) {
            case BLACK:
                if (set.black == null) {
                    set.black = new Color();
                    setProps(set.black, colorEnum);
                }
                return set.black;
        }

        return null;
    }

    private static void setProps(Color color, ColorEnum rFontsEnum) {
        color.setVal(rFontsEnum.getStr());
    }

}
