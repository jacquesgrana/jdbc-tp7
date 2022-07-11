package bll;

import bo.Model;
import ihm.Vue;

public class Controller {
	
	private Vue vue;
	private Model model;
	
	
	public void init() {
		this.vue = new Vue();
		this.model = new Model();
		vue.init();
		model.init();
	}
	
	public void run() {
		vue.displayQuitMessage();
	}
}
