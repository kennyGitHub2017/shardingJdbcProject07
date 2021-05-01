package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

//@Data
public class UserBook {
    private Long id;
    private BigDecimal amount;
    private String info;


    public static void main(String[] args) {
        Integer a = 123567;
        Integer b = 123567;

        if (a.intValue()==b.intValue()){
            System.out.println("相等");
        } else {
            System.out.println("BU相等");
        }
    }
}
