package faszom;

public class NotEnoughMoneyException extends Exception {
	
	private static final long ExceptionID = 16;
	@Override
	public String getMessage()
	{
		return "Not enough money!";
	}
}
