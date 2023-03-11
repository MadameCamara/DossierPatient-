package dp.patient.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dp.patient.dao.PatientDao;
import dp.patient.model.Patient;

@WebServlet("/register")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private PatientDao patientDao;
	
       
    
	 public void init() {
	        patientDao = new PatientDao();
	    }
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("nom");
        String lastName = request.getParameter("prenom");
        String adresse= request.getParameter("adresse");
        String etat = request.getParameter("etatmatrimonial");
        String sexe = request.getParameter("sexe");
        String profession = request.getParameter("profession");
        
		
		Patient patient = new Patient();
		patient.setNom(firstName);
		patient.setPrenom(lastName);
		patient.setAdresse(adresse);
		patient.setEtatmatrimonial(etat);
		patient.setSexe(sexe);
		patient.setProfession(profession);
		
		 try {
	            patientDao.registerPatient(patient);
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	        }

	        response.sendRedirect("listpatient.jsp");
	    }
	

}
