package com.soft1851.cloud.study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Johnny
 * @Date: 2020/9/14 08:36
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private  Integer id;
    private  String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
