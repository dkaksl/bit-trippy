/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.bit_trippy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * @author Amani Kilumanga
 *
 */
public class BitTrippy {

	public static void main(String[] args) {
		try {
			Robot robot = new Robot();
			RunnerBot bot = new RunnerBot(robot);
			bot.wait(2000);
			altTab(robot);
			bot.wait(2000);
			bot.playLv1_1();
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	private static void altTab(Robot robot) {
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

}
