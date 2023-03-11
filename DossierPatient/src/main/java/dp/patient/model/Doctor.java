package dp.patient.model;

public class Doctor {
	  private int codeDortor;
	  private String nom;
	  private String  prenom;
	  private String specialite;
	  private String nomhopital;
	  private String ville;
	
	
	public int getCodeDortor() {
		return codeDortor;
	}
	public void setCodeDortor(int codeDortor) {
		this.codeDortor = codeDortor;
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
	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public String getNomhopital() {
		return nomhopital;
	}
	public void setNomhopital(String nomhopital) {
		this.nomhopital = nomhopital;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Doctor(int codeDortor, String nom, String prenom, String specialite, String nomhopital, String ville) {
		super();
		this.codeDortor = codeDortor;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.nomhopital = nomhopital;
		this.ville = ville;
	}
	public Doctor() {
		super();
	}
	  
	  

}
