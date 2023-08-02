package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
        this.driver = driver;
	}

	By uName = By.id("user-name");
	By pswd = By.id("password");
	By loginBtn = By.id("login-button");
	
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	

}
