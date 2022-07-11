package bo;

import java.util.ArrayList;

public class Model {
	
	private Boolean isDataLoaded;
	private ArrayList<Ville> listVilles;
	private ArrayList<Departement> listDpts;
	private ArrayList<Region> listRegions;
	
	public void init() {
		this.isDataLoaded = false;
		this.listVilles = new ArrayList<>();
		this.listDpts = new ArrayList<>();
		this.listRegions = new ArrayList<>();
	}

	/**
	 * @return the isDataLoaded
	 */
	public Boolean getIsDataLoaded() {
		return isDataLoaded;
	}

	/**
	 * @param isDataLoaded the isDataLoaded to set
	 */
	public void setIsDataLoaded(Boolean isDataLoaded) {
		this.isDataLoaded = isDataLoaded;
	}

	/**
	 * @return the listVilles
	 */
	public ArrayList<Ville> getListVilles() {
		return listVilles;
	}

	/**
	 * @param listVilles the listVilles to set
	 */
	public void setListVilles(ArrayList<Ville> listVilles) {
		this.listVilles = listVilles;
	}

	/**
	 * @return the listDpts
	 */
	public ArrayList<Departement> getListDpts() {
		return listDpts;
	}

	/**
	 * @param listDpts the listDpts to set
	 */
	public void setListDpts(ArrayList<Departement> listDpts) {
		this.listDpts = listDpts;
	}

	/**
	 * @return the listRegions
	 */
	public ArrayList<Region> getListRegions() {
		return listRegions;
	}

	/**
	 * @param listRegions the listRegions to set
	 */
	public void setListRegions(ArrayList<Region> listRegions) {
		this.listRegions = listRegions;
	}

}
