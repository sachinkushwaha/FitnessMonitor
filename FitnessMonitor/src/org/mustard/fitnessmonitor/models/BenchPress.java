package org.mustard.fitnessmonitor.models;

public class BenchPress extends Physical {

	public BenchPress() {
	}

	@Override
	public ActivityType activityType() {
		return ActivityType.BENCHPRESS;
	}

	@Override
	public double calculateCalories() {
		return super.weight * super.getRepetition() / super.getBenchPressWeight() * 0.7;
	}
}
