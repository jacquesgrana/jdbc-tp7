package bll;

import bo.ControllerCSV;
import bo.Model;
import ihm.Vue;

public class Controller {
	
	private Vue vue;
	private Model model;
	
	
	public void init() {
		this.model = new Model();
		this.vue = new Vue();
		this.model.init();
		this.vue.init();
	}
	
	public void run() {
		boolean quit = false;
		char choice = ' ';
		do {
			this.vue.displayGeneralMenu(this.model.getIsDataLoaded());
			choice = this.vue.inputChar();
			switch (choice) {
			case 'Q', 'q':
				quit = true;
				break;
			case '0':
				ControllerCSV controllerCsv = new ControllerCSV();
				controllerCsv.loadData(this.model.getListVilles(), this.model.getListDpts(), this.model.getListRegions());
				this.model.setIsDataLoaded(true);
				break;
			}
			
		} while (!quit);
		//this.vue.waitForCToContinue();
		
		this.vue.closeScanner();
		this.vue.displayQuitMessage();
	}
}
