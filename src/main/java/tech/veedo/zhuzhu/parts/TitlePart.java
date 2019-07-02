package tech.veedo.zhuzhu.parts;

import org.docx4j.jaxb.Context;
import org.docx4j.wml.*;
import tech.veedo.zhuzhu.entity.Title;
import tech.veedo.zhuzhu.enums.RFontsEnum;
import tech.veedo.zhuzhu.sets.ColorSet;
import tech.veedo.zhuzhu.sets.RFontsSet;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TitlePart {

    // get the object factory
    private static ObjectFactory factory = Context.getWmlObjectFactory();

    public static List<P> generate(Title title) {
        List<P> result = new ArrayList<>();

        // title
        P p1 = factory.createP();
        p1.setPPr(generatePPr(RFontsEnum.ARIAL));
        p1.getContent().add(generateR(RFontsEnum.ARIAL, "CANDIDATE REPORT"));
        result.add(p1);

        P p2 = factory.createP();
        p2.setPPr(generatePPr(RFontsEnum.SONGTI));
        p2.getContent().add(generateR(RFontsEnum.SONGTI, "Recommend Position: "+title.getPost()+"-"+title.getPostLocation()));
        result.add(p2);

        return result;
    }

    private static PPr generatePPr(RFontsEnum rFontsEnum) {
        PPr ppr = factory.createPPr();

        PPrBase.PStyle pStyle= factory.createPPrBasePStyle();
        pStyle.setVal("a5");
        ppr.setPStyle(pStyle);

        ParaRPr rPr = generateRPr(factory.createParaRPr(), rFontsEnum);
        ppr.setRPr(rPr);

        Jc jc = factory.createJc();
        jc.setVal(JcEnumeration.CENTER);
        ppr.setJc(jc);

        return ppr;
    }

    private static R generateR(RFontsEnum rFontsEnum, String text) {
        R r = factory.createR();

        RPr rPr = generateRPr(factory.createRPr(), rFontsEnum);
        rPr.setB(factory.createBooleanDefaultTrue());
        r.setRPr(rPr);

        Text t = factory.createText();
        t.setValue(text);
        r.getContent().add(t);

        return r;
    }

    private static <T extends RPrAbstract> T generateRPr(T t, RFontsEnum rFontsEnum) {
        switch (rFontsEnum) {
            case ARIAL:
                t.setRFonts(RFontsSet.getArial());
                break;
            case SONGTI:
                t.setRFonts(RFontsSet.getSongTi());
                break;
        }
        t.setColor(ColorSet.getBlack());

        HpsMeasure sz = new HpsMeasure(){{ setVal(BigInteger.valueOf(21)); }};
        t.setSz(sz);
        t.setSzCs(sz);
        return t;
    }

}
