package com.example.webside_database.Service;

import com.example.webside_database.Repository.StudentsRepository;
import com.example.webside_database.model.Student;

import java.util.List;

public class StudentService {

  StudentsRepository repo = new StudentsRepository();

  public List<Student> getAllStudents(){
    return repo.getAllStudents();
  }

  public Student getStudent(int id){
    return repo.getStudent(id);
  }

}
