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

	public void fecharNavegador() {

		try {

			Runtime rt = Runtime.getRuntime();
			rt.exec("taskkill /im chrome.exe /f /t");
			System.out.println("Navegador fechado com sucesso !!!");

		} catch (Exception e) {
			System.out.println(e + " - Navegador não foi fechado");
		}

	}

}
