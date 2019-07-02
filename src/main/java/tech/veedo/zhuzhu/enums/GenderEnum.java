package tech.veedo.zhuzhu.enums;

import lombok.Getter;

@Getter
public enum  GenderEnum {

    MALE(1, "男"),
    FEMALE(0, "女"),
    ;

    private Integer code;
    private String str;

    public static String getGenderStr(Integer code) {
        for (GenderEnum type : GenderEnum.values()) {
            if (type.getCode() == code) {
                return type.getStr();
            }
        }
        return null;
    }

    GenderEnum(Integer code, String str) {
        this.code = code;
        this.str = str;
    }

}
