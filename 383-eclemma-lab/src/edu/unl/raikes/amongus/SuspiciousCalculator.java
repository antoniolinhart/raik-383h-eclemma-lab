package edu.unl.raikes.amongus;

public class SuspiciousCalculator {

	/*
	 * Calculate a percentage representing the suspiciousness of a player. Returns
	 * suspicious percentage, -1 if player or lobby is null.
	 */
	public static int getSuspiciousMetric(Player player, Lobby lobby) {
		if (player == null || lobby == null) {
			return -1;
		}
		
		int totalDeaths = getTotalNumberOfDeathsReported(lobby);
		int totalTasks = getTotalNumberOfTasksSeenCompleted(lobby);
		int totalEmergencies = getTotalNumberOfEmergenciesFixed(lobby);
		
		double numberOfDeathsReportedRatio = 0;
		if (totalDeaths != 0) {
			numberOfDeathsReportedRatio = 1 - (double) player.getNumberOfDeathsReported() / totalDeaths;
		}
		
		double tasksSeenCompletingRatio = 0;
		if (totalTasks != 0) {
			tasksSeenCompletingRatio = 1 - (double) player.getNumberOfTasksSeenCompleting() / totalTasks;
		}
		
		double emergenciesFixedRatio = 0;
		if (totalEmergencies != 0) {
			emergenciesFixedRatio = 1 - (double) player.getNumberOfEmergenciesFixed() / totalEmergencies;
		}
		
		double playerNameRatio = (double) player.getColor().getColorString().length() / player.getName().length();

		int suspiciousScore = (int) (100 * (0.4 * numberOfDeathsReportedRatio + 0.2 * tasksSeenCompletingRatio + 0.35 * emergenciesFixedRatio + 0.5 * playerNameRatio));
		return suspiciousScore;
	}
	
	public static int getTotalNumberOfDeathsReported(Lobby lobby) {
		int total = 0;
		
		for (Player player: lobby.getPlayers()) {
			total += player.getNumberOfDeathsReported();
		}
		
		return total;
	}
	
	public static int getTotalNumberOfTasksSeenCompleted(Lobby lobby) {
		int total = 0;
		
		for (Player player: lobby.getPlayers()) {
			total += player.getNumberOfTasksSeenCompleting();
		}
		
		return total;
	}
	
	public static int getTotalNumberOfEmergenciesFixed(Lobby lobby) {
		int total = 0;
		
		for (Player player: lobby.getPlayers()) {
			total += player.getNumberOfEmergenciesFixed();
		}
		
		return total;
	}
	
}