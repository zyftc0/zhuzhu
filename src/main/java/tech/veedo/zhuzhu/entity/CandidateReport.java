package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class CandidateReport {

    private Long id;

    /**
     * 标题
     */
    private Title title;

    /**
     * 个人信息
     */
    private PersonalInformation personalInformation;

    /**
     * 薪酬
     */
    private Compensation compensation;

    /**
     * 教育背景
     */
    private List<EducationBackground> educationBackgrounds;

    /**
     * 工作经历
     */
    private List<WorkExperience> workExperiences;

    /**
     * 项目经历
     */
    private List<ProjectExperience> projectExperiences;

    /**
     * 核心优势
     */
    private List<Remark> remarks;

}
