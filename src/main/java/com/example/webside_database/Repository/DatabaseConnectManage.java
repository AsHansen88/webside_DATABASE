package com.example.webside_database.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectManage {

  // Variabler
  private static String hostname;
  private static String username;
  private static String password;
  private static Connection conn;


  // Metoder

  public static Connection getConnection(){
    hostname = "jdbc:mysql://test2022.mysql.database.azure.com";
    username = "AsHansen88";
    password = "191188Anders";


    try {

      conn = DriverManager.getConnection(hostname, username, password);

    } catch (SQLException e) {
      System.out.println("Kan ikke forbinde database");
      e.printStackTrace();
    }

    System.out.println("Forbindelse til database");
return conn;
  }

  }


