package com.example.demo.mapper;






import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
