import java.util.Scanner; //importing Scanner class

public class TestDriver { // Declaring TestDriver class

	public static void main(String[] args) { // Declaring main class

		System.out.println("\n\n\n\n\n\n\n\n\n\n \t\t\t\t\t   CS589");
		System.out.println("\t\t\t\t\t  Project");
		System.out.println("\t\t\t\t\tTest Driver \n");
		System.out.println("\t\t\t\t    Prashanth Molakala");
		System.out.println("\t\t\t\t\t A2032954 \n\n\n");

		GasPump GP = new GasPump(); // Creating object of class GasPump

		int t = 0;

		Boolean loop = true; // This condition is used to exit the loop
		while (loop) { // While loop is used to execute the methods one by one

			try { // To catch exceptions

				if (t == 1) { // This condition is used to refresh the values of
								// GasPump object GP after the TurnOff method of
								// GasPump class returns the value 1

					t = 0;
					GasPump GP1 = new GasPump();
					GP = GP1;
					System.out.println("\n\n\n\n\n Enter a new Test case: ");

				}

				System.out.println("\n\n\n\n\n Press ENTER to Continue...");
				Scanner keyboard = new Scanner(System.in); // Object keyboard of
															// class Scanner is
															// created to read
															// values entered by
															// user
				keyboard.nextLine(); // To continue execution after enter is
										// pressed

				System.out.println("\n\n\n\n\n");

				System.out.println("\t		Driver for the GasPump class \n");
				System.out.println("\t	0. Activate");
				System.out.println("\t	1. Start");
				System.out.println("\t	2. Pay Credit");
				System.out.println("\t	3. Reject");
				System.out.println("\t	4. Approved");
				System.out.println("\t	5. PayCash");
				System.out.println("\t	6. Cancel");
				System.out.println("\t	a. Regular");
				System.out.println("\t	b. Super");
				System.out.println("\t	c. StartPump");
				System.out.println("\t	d. PumpGallon");
				System.out.println("\t	e. StopPump");
				System.out.println("\t	f. NoReceipt");
				System.out.println("\t	g. Receipt");
				System.out.println("\t	h. TurnOff \n");
				System.out.println("\t		Testing-oriented methods");
				System.out.println("\t	p. show_price");
				System.out.println("\t	t. show_total");
				System.out.println("\t	s. check_state");
				System.out.println("\n \t 	n. Enter a new Test case	\n");
				System.out.println("\t	q. Quit \n");

				Scanner scanner = new Scanner(System.in); // New object scanner
															// of
															// class Scanner is
															// created
				System.out.print("\n Enter the operation to be performed: ");

				String op = scanner.next(); // String op accepts any string
											// values
											// entered by user

				System.out.println("\n\n\n\n\n\n\n\n\n\n");

				switch (op) { // To switch values of op

				case "0": // If op is 0
					System.out.println("GasPump class");
					System.out.println("Activate(int a, int b) method");
					System.out.print("\n Enter the value of a: ");
					int a = scanner.nextInt(); // a is set to the next integer
												// value
												// assigned by the user
					System.out.print(" Enter the value of b: ");
					int b = scanner.nextInt(); // b is set to the next integer
												// value
												// assigned by the user
					System.out.println("");

					if ((a >= 0) && (b >= 0)) {
						System.out.println("Price of Regular gas = $" + a);
						System.out.println("Price of Super gas = $" + b);
						System.out.println("");
					}

					int y = GP.Activate(a, b); // Calling the method
												// Activate(int a,
												// int b) of GasPump class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "1": // If op is 1
					System.out.println("GasPump class");
					System.out.println("Start() method \n");
					y = GP.Start(); // Calling the method Start() of GasPump
									// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "2": // If op is 2
					System.out.println("GasPump class");
					System.out.println("PayCredit() method \n");
					y = GP.PayCredit(); // Calling the method PayCredit() of
										// GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "3": // If op is 3
					System.out.println("GasPump class");
					System.out.println("Reject() method \n");
					y = GP.Reject(); // Calling the method Reject() of GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "4": // If op is 4
					System.out.println("GasPump class");
					System.out.println("Approved() method \n");
					y = GP.Approved(); // Calling the method Approved() of
										// GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "5": // If op is 5
					System.out.println("GasPump class");
					System.out.println("PayCash(int c) method");
					System.out.print("\n Enter the value of c: ");
					int c = scanner.nextInt(); // b is set to the next integer
												// value
												// assigned by the user
					System.out.println("");
					System.out.println("Cash inserted = $" + c);
					System.out.println("");
					y = GP.PayCash(c); // Calling the method PayCash() of
										// GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "6": // If op is 6
					System.out.println("GasPump class");
					System.out.println("Cancel() method \n");
					y = GP.Cancel(); // Calling the method Cancel() of GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "a": // If op is a
					System.out.println("GasPump class");
					System.out.println("Regular() method \n");
					y = GP.Regular(); // Calling the method Regular() of GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "b": // If op is b
					System.out.println("GasPump class");
					System.out.println("Super() method \n");
					y = GP.Super(); // Calling the method Super() of GasPump
									// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "c": // If op is c
					System.out.println("GasPump class");
					System.out.println("StartPump() method \n");
					y = GP.StartPump(); // Calling the method StartPump() of
										// GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "d": // If op is d
					System.out.println("GasPump class");
					System.out.println("PumpGallon() method \n");
					y = GP.PumpGallon(); // Calling the method PumpGallon() of
											// GasPump class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "e": // If op is e
					System.out.println("GasPump class");
					System.out.println("StopPump() method \n");
					y = GP.StopPump(); // Calling the method StopPump() of
										// GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "f": // If op is f
					System.out.println("GasPump class");
					System.out.println("NoReceipt() method \n");
					y = GP.NoReceipt(); // Calling the method NoReceipt() of
										// GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "g": // If op is q
					System.out.println("GasPump class");
					System.out.println("Receipt() method \n");
					y = GP.Receipt(); // Calling the method Receipt() of GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ y);
					break;
				case "h": // If op is h
					System.out.println("GasPump class");
					System.out.println("TurnOff() method \n");
					t = GP.TurnOff(); // Calling the method TurnOff() of GasPump
										// class
					System.out
							.println("\n\n The value returned by the method is: "
									+ t);
					break;
				case "p": // If op is p
					System.out.println("GasPump class Testing Oriented method");
					System.out.println("show_price() \n");
					y = GP.show_price(); // Calling the testing oriented method
											// show_price() of GasPump class
					System.out.println("Price of gas = $" + y);
					break;
				case "t": // If op is t
					System.out.println("GasPump class Testing Oriented method");
					System.out.println("show_total() \n");
					y = GP.show_total(); // Calling the testing oriented method
											// show_total() of GasPump class
					System.out.println("Total amount spent = $" + y);
					break;
				case "s": // If op is s
					System.out.println("GasPump class Testing Oriented method");
					System.out.println("check_state() \n");
					int s = GP.check_state(); // Calling the testing oriented
												// method
												// check_state() of GasPump
												// class
					if (s < 0) {
						System.out
								.println("The Gaspump has not been activated");
					} else {
						System.out
								.println("The GasPump class is in the State S"
										+ s);
					}
					break;
				case "n": // If op is n
					GasPump GP1 = new GasPump();
					GP = GP1; // Refreshing the values of GP
					System.out.println("You can now enter a new Test case: ");
					break;
				case "q": // If op is q
					scanner.close(); // Closing object scanner of Scanner class
					keyboard.close(); // Closing object keyboard of Scanner
										// class
					loop = false;
					break;
				default: // If the input string is not present in the above
							// string
							// value of op
					System.out.println("\t Invalid input");
					break;
				}

			} catch (Exception ex) // It catches the exceptions
			{
				System.out.println("\t \n\n Invalid input: enter an integer value");
			}

		}

	}
}
