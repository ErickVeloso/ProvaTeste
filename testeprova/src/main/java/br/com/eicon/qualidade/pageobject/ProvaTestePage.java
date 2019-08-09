package br.com.eicon.qualidade.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import br.com.eicon.qualidade.basepage.BasePage;
import br.com.eicon.qualidade.configuracao.DriverPage;

public class ProvaTestePage extends DriverPage {

	String tituloPagina;
	String tituloEsperado = "Selenium - Web Browser Automation";

	BasePage bp = new BasePage(driver);

	public ProvaTestePage efetuarTesteProva() {

		// Acessando o Site do Google
		getDriver().get("http://www.google.com.br");

		bp.aguardar(3000);

		// Maximizando o Navegador
		getDriver().manage().window().maximize();

		bp.aguardar(3000);

		// Pesquisando no Google: seleniumhq.org
		getDriver().findElement(By.name("q")).sendKeys("seleniumhq.org");

		bp.aguardar(3000);

		// Clicando no Botão Pesquisar Google
		getDriver().findElement(By.className("gNO89b")).click();

		bp.aguardar(3000);

		// Acessando Site do Selenium
		getDriver()
				.findElement(By.cssSelector(
						"#rso > div:nth-child(1) > div > div > div > div > div.r > a:nth-child(1) > div > cite"))
				.click();

		bp.aguardar(3000);

		// Capturando o Titulo da Pagina
		tituloPagina = getDriver().getTitle();
		System.out.println("Titulo da Página: " + tituloPagina);
		
		bp.aguardar(3000);
		
		//Efetuando comparação do titulo da pagina com o printado.
		Assert.assertEquals(tituloEsperado, tituloPagina);
		

		return this;

	}


}