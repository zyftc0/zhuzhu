package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EducationBackground {

    private Long id;

    private String startEduDate;

    private String endEduDate;

    private String school;

    private String major;

    private String education;

}
