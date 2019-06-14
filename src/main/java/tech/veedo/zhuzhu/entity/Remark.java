package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Remark {

    private Long id;

    private String remark;

}
