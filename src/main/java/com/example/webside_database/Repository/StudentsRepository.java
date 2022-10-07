package com.example.webside_database.Repository;

import com.example.webside_database.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StudentsRepository {


  private Connection conn = DatabaseConnectManage.getConnection();

  public List<Student> getAllStudents() {

    List<Student> students = new ArrayList<>();

    try{
    PreparedStatement psts = conn.prepareStatement("SELECT * FROM student2");
    ResultSet resultSet = psts.executeQuery();

    while (resultSet.next()){

      students.add(new Student(
          resultSet.getInt("id"),
          resultSet.getString("name"),
          resultSet.getString("Email"),
          resultSet.getBoolean("gender")
      ));
    }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return students;
  }


}
