package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProjectExperience {

    private Long id;

    private String startProjDate;

    private String endProjDate;

    private String projectName;

    private String projectPost;

    private String projectContent;

    private String projectDuty;

    private String projectPerformance;

}
