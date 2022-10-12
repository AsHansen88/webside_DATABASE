package com.example.webside_database.Repository;

public class Main {

  public static void main(String[] args) {
    DatabaseConnectManage.getConnection();

    StudentsRepository repo = new StudentsRepository();

    System.out.println(repo.getAllStudents());
    System.out.println(repo.getStudent(1));

  }

}
