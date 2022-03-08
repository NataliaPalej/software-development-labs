/** Testing Account object
 * @author Natalia
 */
public class AccountTest {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		//Initializing new Account object
		Account a1 = new Account(1234, "Smith", 500, 200);
		Account a2 = new Account(3333, "Jones", 200, 100);
		a1.printTable();
		a1.print();
		a2.print();
		System.out.println();
		a1.withdraw(400);
		a1.print();
		System.out.println();
		a2.withdraw(400);
		a2.print();
		System.out.println();
		a1.deposit(300);
		a1.print();
		System.out.println();
		a2.deposit(300);
		a2.print();
	}

}
