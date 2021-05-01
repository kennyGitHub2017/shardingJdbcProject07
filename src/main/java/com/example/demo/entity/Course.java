package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class Course {

    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
