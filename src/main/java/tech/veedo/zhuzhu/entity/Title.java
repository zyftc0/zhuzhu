package tech.veedo.zhuzhu.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Title {

    private Long id;

    private String company;

    private String post;

    private String postLocation;

}
