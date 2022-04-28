package faszom;

public interface Chargeable {
	public boolean chargeFee(int input) throws NotEnoughMoneyException;
}
