package top.zh.springbootmp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.zh.springbootmp.entity.Course;
import top.zh.springbootmp.entity.CourseStudent;
import top.zh.springbootmp.entity.Student;

import java.util.List;

public interface CourseStudentMapper extends BaseMapper<CourseStudent> {
    @Select("SELECT s.* FROM student s INNER JOIN t_course_student tcs ON s.id = tcs.student_id WHERE tcs.student_id = #{studentId}")
    List<Student> selectStudentsByCourseId(Long courseId);
}
