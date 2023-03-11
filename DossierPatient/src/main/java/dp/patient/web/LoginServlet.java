package dp.patient.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dp.patient.db.DBConnection;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con=DBConnection.getConn();
			
			String n=request.getParameter("email");
			String p=request.getParameter("password");
			PreparedStatement ps=con.prepareStatement("Select login from utilisateur where login=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd=request.getRequestDispatcher("dashbord.jsp");
				rd.forward(request, response);
			}
			else
			{ 
				
				RequestDispatcher rd=request.getRequestDispatcher("Inscription.jsp");
				rd.forward(request, response);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
