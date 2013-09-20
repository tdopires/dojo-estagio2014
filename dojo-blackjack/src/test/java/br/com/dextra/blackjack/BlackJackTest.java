package br.com.dextra.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class BlackJackTest {

	@Test
	public void sacarCarta() {
		BlackJack blackJack = new BlackJack();
		Assert.assertEquals("sacarCarta", blackJack.sacarCarta());
	}
	
	@Test
	public void pararDeSacarCartas() {
		BlackJack blackJack = new BlackJack();
		Assert.assertEquals("pararDeSacarCartas", blackJack.pararDeSacarCartas());
	}
}
