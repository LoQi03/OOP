package faszom;

import java.time.LocalDate;

public class CreditCard extends Card{


	private int credit;
	public CreditCard(String name, LocalDate validity, Bank bank, int balance) {
		super(name, validity, balance, bank);
		this.credit=100000;
	}
	public CreditCard(String name, LocalDate validity, Bank bank, int balance,int credit) {
		super(name, validity, balance, bank);
		this.credit=credit;
	}
	public boolean getMoneyCreditCard(int price)
	{
		if(this.getMoney(price))
		{
			return true;
		}
		else if(credit>=price && LocalDate.now().isBefore(this.getValidity()))
		{
			this.credit-=price;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "CreditCard [credit=" + credit + ", getName()=" + getName() + ", getValidity()=" + getValidity()
				+ ", getBalance()=" + getBalance() + ", getBank()=" + getBank() + "]";
	}
	@Override
	public boolean chargeFee(int input) throws NotEnoughMoneyException {
		if(this.getBalance()>=input)
		{
			this.setBalance(this.getBalance()-input);
			return true;
		}
		else
		{
			throw new NotEnoughMoneyException();
		}
	}
}
