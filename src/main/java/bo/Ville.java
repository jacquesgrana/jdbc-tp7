package bo;

/**
 * Classe des objets villes. 
 * 
 * codeRegion : code de la région de la ville, 
 * nomRegion : nom de la région de la ville, 
 * codeDept : code du département de la ville, 
 * codeCom : code de la ville, 
 * nomCom : nom de la ville, 
 * populTotale : population de la ville. 
 * 
 * @author jacques granarolo
 */
public class Ville {

	private String codeCom;
	private String nomCom;
	private Long populCom;
	private Departement deptCom;
	private Region regCom;
	
	
	
	/**
	 * @param codeCom
	 * @param nomCom
	 * @param populCom
	 * @param deptCom
	 * @param regCom
	 */
	public Ville(String codeCom, String nomCom, Long populCom, Departement deptCom) {
		super();
		this.codeCom = codeCom;
		this.nomCom = nomCom;
		this.populCom = populCom;
		this.deptCom = deptCom;
	}


	/**
	 * Méthode qui renvoie un clone de l'objet courant. 
	 */
	public Ville clone() {
		return new Ville(this.codeCom, this.nomCom, this.populCom, this.deptCom);
	}


	@Override
	public String toString() {
		return "commune : code : " + this.codeCom + " / nom : " + this.nomCom  + " / pop : " + this.populCom + " / " + this.deptCom.toString();
	}


	/**
	 * @return the codeCom
	 */
	public String getCodeCom() {
		return codeCom;
	}


	/**
	 * @param codeCom the codeCom to set
	 */
	public void setCodeCom(String codeCom) {
		this.codeCom = codeCom;
	}


	/**
	 * @return the nomCom
	 */
	public String getNomCom() {
		return nomCom;
	}


	/**
	 * @param nomCom the nomCom to set
	 */
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}


	/**
	 * @return the populCom
	 */
	public Long getPopulCom() {
		return populCom;
	}


	/**
	 * @param populCom the populCom to set
	 */
	public void setPopulCom(Long populCom) {
		this.populCom = populCom;
	}


	/**
	 * @return the deptCom
	 */
	public Departement getDeptCom() {
		return deptCom;
	}


	/**
	 * @param deptCom the deptCom to set
	 */
	public void setDeptCom(Departement deptCom) {
		this.deptCom = deptCom;
	}


	/**
	 * @return the regCom
	 */
	public Region getRegCom() {
		return regCom;
	}


	/**
	 * @param regCom the regCom to set
	 */
	public void setRegCom(Region regCom) {
		this.regCom = regCom;
	}
	
}
