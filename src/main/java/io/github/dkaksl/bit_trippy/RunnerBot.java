/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.bit_trippy;

import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * @author Amani Kilumanga
 *
 */
public class RunnerBot {

	private final Robot robot;

	public RunnerBot(Robot robot) {
		this.robot = robot;
	}

	public void wait(int delay) {
		this.robot.delay(delay);
	}

	public void jump() {
		pressSpace(this.robot, 20);
	}

	public void longJump() {
		pressSpace(this.robot, 400);
	}

	public void waitAndJump(int waitTime) {
		this.wait(waitTime);
		jump();
	}

	public void waitAndLongJump(int waitTime) {
		this.wait(waitTime);
		longJump();
	}

	public void playLv1_1() {
		jump();
		jump(); // start level
		waitAndJump(11250);
		waitAndJump(1450);
		waitAndJump(1450);
		waitAndJump(1500);
		waitAndJump(1500);
		waitAndJump(750);
		waitAndJump(750);
		waitAndJump(750);
		waitAndJump(740);
		waitAndJump(740);
		waitAndJump(740);
		waitAndJump(1800); // climb ledge
		waitAndLongJump(900); // jump off ledge
		waitAndJump(500);
		waitAndJump(740); // 2nd star get
		waitAndJump(740);
		waitAndJump(740);
		waitAndJump(740);
		waitAndJump(740); // 3rd star get
		waitAndJump(1500);
		waitAndJump(1500);
		waitAndJump(1500);
		waitAndJump(3300); // climb 2nd ledge
		waitAndJump(900); // 4th star get
		waitAndJump(1650);
		waitAndJump(740);
		waitAndJump(740);
		waitAndJump(740);
		waitAndJump(740); // finish
	}

	private void pressSpace(Robot robot, int holdTime) {
		pressKey(robot, KeyEvent.VK_SPACE, holdTime);
	}

	private void pressKey(Robot robot, int event, int delay) {
		robot.keyPress(event);
		robot.delay(delay);
		robot.keyRelease(event);
	}

}
