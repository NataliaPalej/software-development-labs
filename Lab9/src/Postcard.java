
public class Postcard 
{
	private String receiver;
	private String sender;
	private String msg;
	
	
	//constructor
	public Postcard(String sender, String message)
	{
		this.msg = message;
		this.sender = sender;
		this.receiver = " ";
	}
	
	public Postcard()
	{
		System.out.println("Set sender, msg, receiver");
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the sender
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	/**
	 * Method to print the content of the message
	 */
	public void print()
	{
		System.out.println(receiver + "\n" + msg + "\n" + sender);
	}
	
	 
}
