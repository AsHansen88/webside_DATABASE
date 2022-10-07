package com.example.webside_database.model;

public class Student {

  private int id;
  private String name;
  private String Email;
  private boolean gender;


  public Student(int id, String name, String email, boolean gender) {
    this.id = id;
    this.name = name;
    Email = email;
    this.gender = gender;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public boolean isGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", Email='" + Email + '\'' +
        ", gender=" + gender +
        '}';
  }
}
