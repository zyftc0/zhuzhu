package tech.veedo.zhuzhu.enums;

import lombok.Getter;

@Getter
public enum ColorEnum {

    BLACK("000000"),
    ;

    private String str;

    ColorEnum(String str) {
        this.str = str;
    }

}
