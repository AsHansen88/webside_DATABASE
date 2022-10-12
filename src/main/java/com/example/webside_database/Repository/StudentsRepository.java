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

    try {
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM student2");
      ResultSet resultSet = psts.executeQuery();

      while (resultSet.next()) {

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

  public Student getStudent(int id) {

    PreparedStatement psts = null;
    try {
      psts = conn.prepareStatement("SELECT * FROM student2 WHERE id = ?");


      psts.setInt(1, id);
      ResultSet resultSet = psts.executeQuery();

      if (resultSet.next()) {
        return new Student(
            resultSet(Student.getInt("id")),
            resultSet(Student.getString("name")),
            resultSet(Student.getString("emil")),
            resultSet(Student.getBoolean("gender"))
        );

      }

      return null;

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}