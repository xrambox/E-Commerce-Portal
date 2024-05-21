package de.buw.se;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DataStoreSql {
  private static final String FILE_NAME = "src/main/resources/sourceDataBase";

  private static Statement getSqlStatement() {
    try {
      
      Class.forName("org.h2.Driver");
      Connection conn = DriverManager.getConnection("jdbc:h2:./" + FILE_NAME, "", "");
  
      Statement stmt = conn.createStatement();
  
      String createQ = "CREATE TABLE IF NOT EXISTS Books"
          + "(ID INT PRIMARY KEY AUTO_INCREMENT(1,1) NOT NULL, AUTHOR VARCHAR(255), TITLE VARCHAR(255))";
      stmt.executeUpdate(createQ);
      return stmt;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public static boolean addUser(String username, String password) {
      try {
          Statement stmt = getSqlStatement();
          stmt.executeUpdate("INSERT INTO Users (USERNAME, PASSWORD) VALUES ('" + username + "', '" + password + "')");
         // ResultSet rs= new ResultSet();
          if(username =="" || password == "") {
        	  return false;
          }
        	 
      } catch (SQLException e) {
          e.printStackTrace();

      }
      return true;
      
  }

  public static void checkUser(String username, String password) {
      try {
          Statement stmt = getSqlStatement();
          ResultSet selectRS = stmt.executeQuery("SELECT * FROM Users WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "'");
          if (selectRS.next()) {
              // User exists, handle accordingly
              System.out.println("User exists!");
          } else {
              // User does not exist, handle accordingly
              System.out.println("User does not exist!");
          }
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }

//  public static List<String> readAuthors() {
//    List<String> authors = new ArrayList<>();
//    try {
//      Statement stmt = getSqlStatement();
//      ResultSet selectRS = stmt.executeQuery("SELECT * FROM Books");
//      while (selectRS.next()) {
//        authors.add(selectRS.getString("AUTHOR"));
//      }
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }
//    return authors;
//  }
//  public static void checkUser0(String username, String password) {
//	  try {
//	      Statement stmt = getSqlStatement();
//	      ResultSet selectRS = stmt.executeQuery("SELECT * FROM USER, WHERE ");
//	      stmt.executeUpdate("INSERT INTO Books (AUTHOR, TITLE) VALUES('" + username + "', '" + password + "')");
//	     
//	    } catch (SQLException e) {
//	      e.printStackTrace();
//	    }
//	 
//  }
//
//
//  public static void addBook(String author, String title) {
//    try {
//      Statement stmt = getSqlStatement();
//      stmt.executeUpdate("INSERT INTO Books (AUTHOR, TITLE) VALUES('" + author + "', '" + title + "')");
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }
//  }
  
} 

