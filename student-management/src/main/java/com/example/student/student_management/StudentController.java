package com.example.student.student_management;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    StudentService service = new StudentService();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student saved!";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student deleted!";
    }

}
