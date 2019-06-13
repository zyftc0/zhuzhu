package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CandidateReport {

    private PersonalInformation personalInformation;

    private Compensation compensation;

}
