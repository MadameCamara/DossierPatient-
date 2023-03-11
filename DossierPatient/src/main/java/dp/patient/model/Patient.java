package dp.patient.model;

import java.io.Serializable;





@SuppressWarnings("serial")
public class Patient implements Serializable {
	
	
	private int CodePatient;
	private String nom;
	private String prenom;
	private String adresse;
	private String sexe;
	private String etatmatrimonial;
	private String profession;
	


	public int getCodePatient() {
		return CodePatient;
	}

	public void setCodePatient(int codePatient) {
		CodePatient = codePatient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEtatmatrimonial() {
		return etatmatrimonial;
	}

	public void setEtatmatrimonial(String etatmatrimonial) {
		this.etatmatrimonial = etatmatrimonial;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	
	
	
	
}

