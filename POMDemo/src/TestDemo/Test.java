package TestDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		LoginPage lp=new LoginPage(driver);
		lp.setLoginPageun();
		lp.setLoginPagepwd();
		lp.setLoginPagelgnbtn();
		
		HomePage hp=new HomePage(driver);
		hp.verifyHomePageLogo();
	}

}
