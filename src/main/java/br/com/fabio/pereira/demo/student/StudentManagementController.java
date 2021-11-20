package br.com.fabio.pereira.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Marie Curie"),
            new Student(3, "Anna Goulart")
    );

    @GetMapping
    public List<Student> getAllStudent() {
        return STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println(student);
    }

    @DeleteMapping("{studentId}")
    public void deleteNewStudent(@PathVariable Integer studentId) {
        System.out.println(studentId);
    }

    @PatchMapping("{studentId}")
    public void updateStudent(@PathVariable Integer studentId, @RequestBody Student student) {
        System.out.printf("%s %s%n", studentId, student);
    }
}
