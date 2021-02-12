package edu.unl.raikes.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unl.raikes.amongus.Lobby;
import edu.unl.raikes.amongus.Player;
import edu.unl.raikes.amongus.SuspiciousCalculator;

public class SuspiciousCalculatorTests {

	@Test
	public void exampleTest() {
		Player player = null;
		Lobby lobby = null;
		int suspiciousScore = SuspiciousCalculator.getSuspiciousMetric(player, lobby);

		Assert.assertEquals(-1, suspiciousScore);
	}
}
