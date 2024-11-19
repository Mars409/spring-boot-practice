package top.zh.springbootmp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.zh.springbootmp.entity.Clazz;
import top.zh.springbootmp.entity.Student;
import top.zh.springbootmp.entity.Teacher;

import java.util.List;

public interface ClazzMapper extends BaseMapper<Clazz> {
    @Select("SELECT * FROM teacher WHERE id = #{teacherId}")
    Teacher selectTeacherByClazzId(Long teacherId);

    @Select("SELECT * FROM student WHERE clazz_id = #{clazzId} ")
    List<Student> selectStudentByClazzId(Long clazzId);
}
