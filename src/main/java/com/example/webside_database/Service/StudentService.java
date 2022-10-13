package com.example.webside_database.Service;

import com.example.webside_database.Repository.StudentsRepository;
import com.example.webside_database.model.Student;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class StudentService {

  StudentsRepository repo = new StudentsRepository();

  public List<Student> getAllStudents(){
    return repo.getAllStudents();
  }

  public Student getStudent(int id){
    return repo.getStudent(id);
  }




  public void create(WebRequest req) {
    boolean gender = false;

    if (req.getParameter("gender") == "mand"){
      gender = true;
  }
    Student student = new Student(req.getParameter("name"),
        req.getParameter("Email"),
        gender);
  }

  repo.create(student);
}
