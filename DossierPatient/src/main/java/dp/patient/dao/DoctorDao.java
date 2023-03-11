package dp.patient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dp.patient.db.DBConnection;
import dp.patient.model.Doctor;

public class DoctorDao {
	

  public  int addDoctor(Doctor doctor) {
    // TODO Auto-generated method stub
    Connection con = DBConnection.getConn();
    String sql = "insert into doctor (codeDoctor,nom,prenom,specialite,nomhopital,ville) values (codeDoctor,?,?,?,?,?) ";
    int i = 0;
    try {
      PreparedStatement preparedStatement = con.prepareStatement(sql);
      preparedStatement.setInt(1, 1);
      preparedStatement.setString(1, doctor.getNom());
      preparedStatement.setString(2, doctor.getPrenom());
      preparedStatement.setString(3, doctor.getSpecialite());
      preparedStatement.setString(4, doctor.getNomhopital());
      preparedStatement.setString(5, doctor.getVille());
      System.out.println(preparedStatement);
      i = preparedStatement.executeUpdate();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
    	printSQLException(e);
    }
      return i;
      
     
    }
  

	private void printSQLException(SQLException ex) {
      for (Throwable e: ex) {
          if (e instanceof SQLException) {
              e.printStackTrace(System.err);
              System.err.println("SQLState: " + ((SQLException) e).getSQLState());
              System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
              System.err.println("Message: " + e.getMessage());
              Throwable t = ex.getCause();
              while (t != null) {
                  System.out.println("Cause: " + t);
                  t = t.getCause();
              }
          }
      }
  }
  /*
    public boolean editDoctor(Doctor doctor) {
      Connection connection = DBConnection.getConn();
      String sql = "update doctor set  nomhopital=?, ville=?";
      sql += " where id=? ";
      int i = 0;
      try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, doctor.getNomhopital());
        preparedStatement.setString(2, doctor.getVille());
        preparedStatement.setInt(4, doctor.getCodeDortor());
        i = preparedStatement.executeUpdate();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      if (i == 0) {
        return false;
      } else {
        return true;
      }
    }
    public void deleteDoctor(int id) {
        Connection connection = DBConnection.getConn();
        String sql = "delete from doctor where id=?";
        try {
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          preparedStatement.setInt(1, id);
          preparedStatement.executeUpdate();
        } catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    */
    }
    
    