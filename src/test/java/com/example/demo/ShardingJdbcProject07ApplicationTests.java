package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ShardingJdbcProject07ApplicationTests {
    @Autowired
    private CourseMapper courseMapper;

    @Test
    void contextLoads() {
        System.out.println("9999999999999999999999999999999999");

        Course course = new Course();
        course.setUserId(100L);
        course.setCname("JAVA");
        course.setCstatus("NO");
        courseMapper.insert(course);
        System.out.println("0000000000000000000000000000000022");
    }




    @Test
    void comparetoTest(){
        Integer a = 123;
        Integer b = 123;

        if (a==b){
            System.out.println("相等");
        } else {
            System.out.println("BU相等");
        }

    }

}
