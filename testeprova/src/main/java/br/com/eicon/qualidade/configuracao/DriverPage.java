package br.com.eicon.qualidade.configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPage {

	public String caminhoDriver = "lib/chromedriver/chromedriver.exe";
	public WebDriver driver;

	public DriverPage() {
	
	System.setProperty("webdriver.chrome.driver", caminhoDriver);
	driver = new ChromeDriver();
	
	}

	public WebDriver getDriver() {
		
		return driver;
	}
	
}
