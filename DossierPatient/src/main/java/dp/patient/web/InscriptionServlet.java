package dp.patient.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dp.patient.dao.PatientDao;
import dp.patient.dao.UtilisateurDao;
import dp.patient.model.Patient;
import dp.patient.model.Utilisateur;

@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private UtilisateurDao userDao;
	
       
    
	 public void init() {
	        userDao = new UtilisateurDao();
	    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("nom");
        String lastName = request.getParameter("prenom");
        String login= request.getParameter("email");
        String password = request.getParameter("password");
        
        
		
		Utilisateur user = new Utilisateur();
		user.setNom(firstName);
		user.setPrenom(lastName);
		user.setLogin(login);
		user.setPassword(password);
		
		
		 try {
	            userDao.addUtilisateur(user);
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	        }

	        response.sendRedirect("index.jsp");
	    }
	

}

