package dp.patient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dp.patient.db.DBConnection;
import dp.patient.model.Utilisateur;

public class UtilisateurDao {
	
	 public  int addUtilisateur(Utilisateur user) {
		    // TODO Auto-generated method stub
		    Connection con = DBConnection.getConn();
		    String sql = "insert into utilisateur (iduser,nom,prenom,login,password) values (idUser,?,?,?,?) ";
		    int i = 0;
		    try {
		      PreparedStatement preparedStatement = con.prepareStatement(sql);
		      preparedStatement.setInt(1, 1);
		      preparedStatement.setString(1, user.getNom());
		      preparedStatement.setString(2, user.getPrenom());
		      preparedStatement.setString(3, user.getLogin());
		      preparedStatement.setString(4, user.getPassword());
		      
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

}
