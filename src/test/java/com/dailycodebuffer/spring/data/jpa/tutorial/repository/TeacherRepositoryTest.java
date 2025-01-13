package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherRepositoryTest {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherRepositoryTest(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Test
    public void saveTeacher() {
        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Qutub")
                .lastName("Khan")
                //.courses(List.of(courseDBA, courseJava))
                .build();

        teacherRepository.save(teacher);
    }
}