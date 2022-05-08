package com.kalinin.springboot.springboot_mybatis.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "guide")
@Data
@NoArgsConstructor
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column (name = "abbreviated_name")
    private String abbreviated_name;


}
