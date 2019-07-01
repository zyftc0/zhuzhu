package tech.veedo.zhuzhu.enums;

import lombok.Getter;

@Getter
public enum RFontsEnum {

    ARIAL("Arial"),
    SONGTI("宋体"),
    ;

    private String str;

    RFontsEnum(String str) {
        this.str = str;
    }

}
