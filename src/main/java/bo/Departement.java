package bo;

/**
 * Classe des objets départements. 
 * 
 * codeDept : code du département de la ville, 
 * codeReg : code de la région du département, 
 * nomDept : nom du département, 
 * populTotale : population du département. 
 * 
 * @author jacques granarolo
 */
// TODO ajouter attributs : codeReg et nomDept
public class Departement {
	private String codeDept;
	private String nomDept;
	private Region region;
	//private Long populTotale;
	
	/**
	 * Constructeur : 
	 * 
	 * @param codeDept : code du département, 
	 * @param codeReg : code de la région du département, 
	 * @param nomDept : nom du département, 
	 * @param populTotale : population du département. 
	 */
	public Departement(String codeDept, String nomDept, Region region) {
		//super();
		this.codeDept = codeDept;
		this.nomDept = nomDept;
		this.region = region;
	}
	
	/**
	 * Méthode qui renvoie un clone de l'objet courant. 
	 */
	public Departement clone() {
		return new Departement(this.codeDept, this.nomDept, this.region);
	}

	@Override
	public String toString() {
		return "departement : code : " + this.codeDept + " / nom : " + this.nomDept + " / " + this.region.toString();
	}
	
	/**
	 * Surcharge de la méthode équals() : définit les critères pour pouvoir utiliser contains() et equals()
	 */
	@Override
	public boolean equals(Object o){
		Departement dtpToTest = (Departement) o;
		boolean codeDeptEquals = dtpToTest.codeDept.equals(this.codeDept);
		return (codeDeptEquals);
	}

	public String getCodeDept() {
		return this.codeDept;
	}

	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	public String getNomDept() {
		return nomDept;
	}

	public void setNomDept(String nomDept) {
		this.nomDept = nomDept;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
