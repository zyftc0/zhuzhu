package tech.veedo.zhuzhu.enums;

import lombok.Getter;

@Getter
public enum MaritalStatusEnum {

    YES(1, "是"),
    NO(0, "否"),
    ;

    private Integer code;
    private String str;

    public static String getMaritalStatusStr(Integer code) {
        for (MaritalStatusEnum type : MaritalStatusEnum.values()) {
            if (type.getCode() == code) {
                return type.getStr();
            }
        }
        return null;
    }

    MaritalStatusEnum(Integer code, String str) {
        this.code = code;
        this.str = str;
    }

}
