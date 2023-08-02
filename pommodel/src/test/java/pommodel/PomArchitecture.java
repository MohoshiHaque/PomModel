package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomArchitecture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		String url ="https://www.saucedemo.com/";
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		
		Login login = new Login(driver);
		
		login.enterUsername("Mohoshi");
		login.enterPassword("bangladesh");
		
		login.clickLogin();
		Thread.sleep(3000);


	}

}
