package com.kalinin.springboot.mybatis.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GuideDto {
    private int id;
    private String name;
    private String abbreviated_name;

}
