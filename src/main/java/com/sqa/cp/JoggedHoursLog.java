/**
 * File Name: JoggedHoursLog.java<br>
 * Chhaya Patel<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 6, 2017
 */
package com.sqa.cp;

import java.util.*;

import com.sqa.cp.helpers.*;

/**
 * JoggedHoursLog //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chhaya Patel
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHoursLog {

	private static String appName = "Jogged hours log App";

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppBasics.greetUserAndGetName(appName);
		String joggerName = " ";
		System.out.println("How many joggers information do you want to enter :");
		int totalJoggers = AppBasics.getTotalJoggers();
		do {
			int i = 1;
			System.out.print("***Please provide registered jogger" + i + "'s name : ");
			joggerName = scanner.nextLine();
			int noOfDays = AppBasics.requestInt();
			int totalHours = AppBasics.calculateTotalHours(noOfDays);
			System.out.println(joggerName + " jogged " + totalHours + " hours this week.");
			String joggerLevel = AppBasics.findJoggerLevel(totalHours);
			System.out.println(joggerName + " is " + joggerLevel + " jogger.***");
			totalJoggers--;
			i++;
		} while (totalJoggers > 0);
		AppBasics.farewellUser(appName);
	}
}
