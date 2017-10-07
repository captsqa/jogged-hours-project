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
	 * @param noOfDays
	 * @return
	 */
	public static int calculateTotalHours(int noOfDays) {
		int i = 1;
		int hours = 0;
		int totalHours = 0;
		do {
			System.out.println("Enter Day " + i + " Jogged hours :");
			hours = scanner.nextInt();
			noOfDays--;
			i++;
			totalHours = totalHours + hours;
		} while (noOfDays >= 1);
		return totalHours;
	}

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
		System.out.println("\nThank you " + name + ", for using " + appName + "Application.\nHave a great Day!");
	}

	/**
	 * @param totalHours
	 * @return
	 */
	public static String findJoggerLevel(int totalHours) {
		if (totalHours < 15) {
			return "Amateur";
		} else if (totalHours >= 15 && totalHours <= 40) {
			return "Efficient";
		} else {
			return "Extremist";
		}
	}

	public static int getTotalJoggers() {
		int totalJoggers = 0;
		System.out.println("How many joggers information do you want to enter :");
		totalJoggers = scanner.nextInt();
		return totalJoggers;
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
		System.out.println("Welcome to the " + appName + " Application");
		// System.out.print("Please provide registered jogger's name : ");
		return scanner.nextLine();
	}

	public static boolean requestBoolean(String question) {
		String input;
		boolean isValid = false;
		boolean response = true;
		while (!isValid) {
			System.out.print(question + " (Yes/No)");
			input = scanner.nextLine();
			if (input.trim().equalsIgnoreCase("yes")) {
				isValid = true;
				response = true;
			} else if (input.trim().equalsIgnoreCase("no")) {
				isValid = true;
				response = false;
			} else {
				System.out.println("You did not respond to the question in the correct form: (Yes/No)");
			}
		}
		return response;
	}

	public static byte requestByte(String question) {
		byte num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Byte.parseByte(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
	}

	public static char requestChar(String question) {
		System.out.print(question + " ");
		return scanner.nextLine().charAt(0);
	}

	public static double requestDouble(String question) {
		double num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Double.parseDouble(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
	}

	public static float requestFloat(String question) {
		float num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Float.parseFloat(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
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

	public static long requestLong(String question) {
		long num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Long.parseLong(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
	}

	public static short requestShort(String question) {
		short num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Short.parseShort(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
	}

	/**
	 * @param string
	 * @return
	 */
	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
