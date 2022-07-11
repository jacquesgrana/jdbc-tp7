package bo;

import java.util.ArrayList;

import dal.CsvLoaderDAO;

public class ControllerCSV {
	
	public Boolean loadData(ArrayList<Ville> villes, ArrayList<Departement> depts, ArrayList<Region> regions) {
		CsvLoaderDAO daoCsv = new CsvLoaderDAO(); 
		return daoCsv.loadCSV(villes, depts, regions);
	}

}
