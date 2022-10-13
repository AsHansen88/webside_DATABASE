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
            resultSet.getInt("id"),
            resultSet.getString("name"),
            resultSet.getString("email"),
            resultSet.getBoolean("gender")
        );


      }



    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void create (Student student) {
    try {
      psts = conn.prepareStatement("INSERT INTO student(name, email, gender) VALUES (?,?,?)");
      psts.SetString(1, Student.Getname());
      psts.SetString(2, Student.Getemail());
      psts.Setboolean(3, Student.isgender());
      psts.executeUpdate();

    }catch (SQLException e) {
      e.printStackTrace();
    }



  }

}
