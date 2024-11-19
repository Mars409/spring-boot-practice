package top.zh.springbootmp.service;

import lombok.AllArgsConstructor;
import top.zh.springbootmp.entity.Clazz;
import top.zh.springbootmp.entity.Course;
import top.zh.springbootmp.entity.Student;
import top.zh.springbootmp.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    private final CourseMapper courseMapper;

    public Course getCourseWithStudent(Long courseId) {
        Course course = courseMapper.selectById(courseId);
        if (course != null) {
            List<Student> students = courseMapper.selectStudentByCourseId(courseId);
            course.setStudents(students);
        }
        return course;
    }
}
