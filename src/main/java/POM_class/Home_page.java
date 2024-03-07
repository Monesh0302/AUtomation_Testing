package POM_class;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import Base_Test.Base_class;

public class Home_page extends Base_class {
	
	public Home_page() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement Home_tab;

	public WebElement getHome_tab() {
		return Home_tab;
	}
	
	@FindBy(id="btn2")
	private WebElement Home_skipsigin_button;

	public WebElement getHome_skipsigin_button() {
		return Home_skipsigin_button;
	}
	
	@FindBy(xpath="//title[text()='Register']")
	private WebElement Register_page_title;

	public WebElement getRegister_page_title() {
		return Register_page_title;
	}

}
