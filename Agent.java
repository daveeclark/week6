package com.week6;

public class Agent extends Robot{

    private double badgeId;

    public Agent(String words, double badgeId) {
        super(words);
        this.badgeId=badgeId;
    }

    public double getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(double badgeId) {
        this.badgeId = badgeId;
    }

}
