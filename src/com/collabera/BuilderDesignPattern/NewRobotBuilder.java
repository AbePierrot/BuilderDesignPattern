package com.collabera.BuilderDesignPattern;

public class NewRobotBuilder implements RobotBuilder{
	
	private Robot newRobot;
	
	public NewRobotBuilder() {
		this.newRobot= new Robot();
	}

	@Override
	public void buildRobotHead() {
		newRobot.setRobotHead("Aluminum head");
	}

	@Override
	public void buildRobotTorso() {
		newRobot.setRobotTorso("Aluminum torso");
		
	}

	@Override
	public void buildRobotArms() {
	 newRobot.setRobotArms("Aluminum Arms");
		
	}

	@Override
	public void buildRobotLegs() {
		newRobot.setRobotLegs("Aluminum Legs");
		
	}

	@Override
	public void builtRobotSensor() {
		newRobot.setRobotSensor("temp sensor");
		
	}
	
	@Override
	public Robot getRobot() {
	    return this.newRobot;
	}



}
