/**
 * 
 */

/**
 * Testing postcard object
 * @author Natalia
 */
public class PostcardTest {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) 
	{
		String text = "I am having a great time\nthe island of Java.\nWish you were here.";
		
		Postcard newPostcard = new Postcard("Lilly", text);
		newPostcard.print();
		System.out.println();
		newPostcard.setReceiver("Yoosef");
		newPostcard.print();
		
		System.out.println();
		newPostcard.setMsg("You should be in class today!\nWhy didnt you come again!?");
		System.out.println(newPostcard.getMsg());
		System.out.println();
		newPostcard.setReceiver("Ammar");
		newPostcard.setSender("Natalia");
		System.out.println("Receiver: " + newPostcard.getReceiver() + "\nSender: " + newPostcard.getSender());
		
		System.out.println();
		newPostcard.print();
		newPostcard.setMsg(text);
		
		Postcard p1 = new Postcard();
		p1.print();


	}

}
