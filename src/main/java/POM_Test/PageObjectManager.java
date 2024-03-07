package POM_Test;

import POM_class.Home_page;

public class PageObjectManager {
	
	private Home_page Home;
	
	public Home_page getHome() {
		if (Home==null) {
			Home = new Home_page();
		}
		return Home;
	}

	private static PageObjectManager pom;

	public static PageObjectManager getPom() {
		return pom;
	}

}
