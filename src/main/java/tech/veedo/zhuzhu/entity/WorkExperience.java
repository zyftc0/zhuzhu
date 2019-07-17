package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WorkExperience {

    private Long id;

    private String startJobDate;

    private String endJobDate;

    private String companyName;

    private String companyPost;

    private String companyInformation;

    private String leader;

    private String subordinateCount;

    private String jobContent;

    private String performance;

    private String reason;

}
