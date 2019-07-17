package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 个人信息
 */
@Data
@Accessors(chain = true)
public class PersonalInformation {

    private Long id;

    private String name;

    private String gender;

    private String birthyear;

    private String homeAddress;

    private String maritalStatus;

}
