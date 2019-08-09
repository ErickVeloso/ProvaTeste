package br.com.eicon.qualidade.teste;

import org.junit.After;
import org.junit.Test;

import br.com.eicon.qualidade.pageobject.ProvaTestePage;

public class ProvaTeste {

	ProvaTestePage ptp = new ProvaTestePage();

	@Test
	public void executarTeste() {

		ptp.efetuarTesteProva();

	}

	@After
	public void fimTeste() {
		
		ptp.fecharNavegador();
		
	}
}
