package com.kalinin.springboot.mybatis.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GuideDto {
    private Integer id;
    private String name;
    private String reduction;
}
