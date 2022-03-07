public class VendingMachineTest {

	/**
	 * Testing Vending Machine 
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		VendingMachine OrangeJuice = new VendingMachine(100);
		System.out.println("Number of cans: " + OrangeJuice.getCans() + " " + "Number of tokens: " + OrangeJuice.getTokens());
		
		VendingMachine machine = new VendingMachine();
		machine.display();
		machine.insertToken();
		machine.display();
		machine.insertToken();
		machine.display();
		machine.insertToken(12);
		machine.display();
	}
}
