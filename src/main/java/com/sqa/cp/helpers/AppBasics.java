/**
 * File Name: AppBasics.java<br>
 * Chhaya Patel<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 2, 2017
 */
package com.sqa.cp.helpers;

import java.util.Scanner;

import com.sqa.cp.helpers.exceptions.RequestNumberNotWithinRangeException;
import com.sqa.cp.helpers.exceptions.RequestNumberOverMaxException;
import com.sqa.cp.helpers.exceptions.RequestNumberUnderMinException;

/**
 * AppBasics //ADDD (description of class) //ADDD (description of core fields)
 * //ADDD (description of core methods)
 *
 * @author Chhaya Patel
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method which farewells the user at the end of an application to
	 * say Thank you and wish them well
	 *
	 * @param name
	 *            Name of user
	 * @param appName
	 *            Name of application
	 */
	public static void farewellUser(String name, String appName) {
		System.out.println(
				"\nThank you " + name + ", for using Basic App " + appName + "Application.\nHave a great Day!");
	}

	/**
	 * Helper method which greets the user and welcomes them to the application.
	 * This method then takes their name and returns
	 *
	 * @param appName
	 *            Name of Application
	 * @return name Name of user
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to my " + appName + " Application");
		System.out.print("Could I get your name please? ");
		return scanner.nextLine();
	}

	/**
	 * @param question
	 * @return
	 */
	public static boolean requestBoolean(String question) {
		return false;
	}

	/**
	 * @param question
	 * @return
	 */
	public static byte requestByte(String question) {
		int resultByte = 0;
		return (byte) resultByte;
	}

	/**
	 * @param question
	 * @return
	 */
	public static char requestChar(String question) {
		return 0;
	}

	/**
	 * @param question
	 * @return
	 */
	public static double requestDouble(String question) {
		return 0;
	}

	/**
	 * @param question
	 * @return
	 */
	public static float requestFloat(String question) {
		return 0;
	}

	/**
	 * @param string
	 *            Ask user a Question
	 * @return
	 */
	public static int requestInt(String question) {
		int resultNumber = 0;
		String input = "";
		boolean valid = false;
		while (!valid) {
			try {
				// Ask Question
				System.out.print(question + " ");
				// Get Input String from user
				input = scanner.nextLine();
				// Parse input string into int type
				resultNumber = Integer.parseInt(input);
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid formatted number [" + input + "]");
			}
		}
		return resultNumber;
	}

	/**
	 * @param string
	 *            Ask user a Question
	 * @param int
	 *            minimum range
	 * @param int
	 *            maximum range
	 * @return
	 */
	public static int requestInt(String question, int min, int max) {
		int resultNumber = 0;
		String input = "";
		boolean valid = false;
		while (!valid) {
			try {
				// Ask Question
				System.out.print(question + " ");
				// Get Input String from user
				input = scanner.nextLine();
				// Parse input string into int type
				resultNumber = Integer.parseInt(input);
				// Evaluate valid entry
				// Evaluate valid range
				if (resultNumber >= min && resultNumber <= max) {
					valid = true;
				} else {
					System.out.println("Please Enter number between " + min + " and " + max);
				}
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid formatted number [" + input + "]");
			}
		}
		return resultNumber;
	}

	/**
	 * @param question
	 * @param min
	 * @param max
	 * @param errorMessage
	 * @return
	 */
	public static int requestInt(String question, int min, int max, String errorMessage) {
		int resultNumber = 0;
		String input = " ";
		boolean valid = false;
		while (!valid) {
			try {
				// Ask Question
				System.out.print(question + " ");
				input = scanner.nextLine();
				resultNumber = Integer.parseInt(input);
				if (resultNumber < min) {
					throw new RequestNumberUnderMinException();
				}
				if (resultNumber > max) {
					throw new RequestNumberOverMaxException();
				}
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a valid formatted number [" + input + "]");
				/*
				 * } catch (RequestNumberUnderMinException e) { System.out.
				 * println("You have not entered a valid number higher than minimum ("
				 * + min + ") - [" + input + "]"); } catch
				 * (RequestNumberOverMaxException e) { System.out.
				 * println("You have not entered a valid number lower than maximum ("
				 * + max + ") - [" + input + "]");
				 */
			} catch (RequestNumberNotWithinRangeException e) {
				System.out.println(errorMessage);
			}
		}
		return resultNumber;
	}

	/**
	 * @param question
	 * @return
	 */
	public static long requestLong(String question) {
		return 0;
	}

	/**
	 * @param question
	 * @return
	 */
	public static short requestShort(String question) {
		return 0;
	}
}
