package br.com.eicon.qualidade.basepage;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void aguardar(int seg) {
		try {
			Thread.sleep(seg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
