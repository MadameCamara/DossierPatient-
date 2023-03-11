package dp.patient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dp.patient.db.DBConnection;
import dp.patient.model.Patient;


public class PatientDao {
	
	
	public int registerPatient(Patient patient) throws ClassNotFoundException {
		Connection con = DBConnection.getConn();
		 String sql = "insert into patient (codePatient, nom, prenom, adresse, sexe,etatMatrimonial,profession) values  (codePatient, ?, ?, ?, ?,?,?) ";

        int result = 0;


        try (
        		
        		 // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(1, patient.getNom());
                preparedStatement.setString(2,patient.getPrenom());
                preparedStatement.setString(3,patient.getAdresse());
                preparedStatement.setString(4,patient.getSexe());
                preparedStatement.setString(5,patient. getEtatmatrimonial());
                preparedStatement.setString(6,patient.getProfession());
                
                
                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();
                
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
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
