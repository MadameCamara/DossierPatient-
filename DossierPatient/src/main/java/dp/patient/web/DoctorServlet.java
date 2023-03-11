package dp.patient.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dp.patient.dao.DoctorDao;
import dp.patient.dao.PatientDao;
import dp.patient.model.Doctor;
import dp.patient.model.Patient;

@WebServlet("/ajouter")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 private DoctorDao doctorDao;
		
     
	    
	 public void init() {
	        doctorDao = new DoctorDao();
	    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("nom");
        String lastName = request.getParameter("prenom");
        String specialite= request.getParameter("specialite");
        String nomhopial = request.getParameter("nomhopital");
        String ville = request.getParameter("ville");
        
        
		
		Doctor doctor = new Doctor();
		doctor.setNom(firstName);
		doctor.setPrenom(lastName);
		doctor.setSpecialite(specialite);
		doctor.setNomhopital(nomhopial);
		doctor.setVille(ville);
		
		 try {
	            doctorDao.addDoctor (doctor);
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	        }

	        response.sendRedirect("medecin.jsp");
	    }
	

}
