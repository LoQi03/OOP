package faszom;

import java.time.LocalDate;

public class Card implements Chargeable {

	public void setCardfee(int cardfee) {
		this.cardfee = cardfee;
	}
	private String name;
	private LocalDate Validity;
	private int balance;
	private Bank bank;
	private int cardfee;

	public Card(String name, LocalDate validity, int balance, Bank bank) {
		super();
		this.name = name;
		Validity = validity;
		this.balance = balance;
		this.bank = bank;
		switch(bank)
		{
		 case OTP:
			 cardfee=1000;
			 break;
		 case KnH:
			 cardfee=2000;
			 break;
		 case ERSTE:
			 cardfee=3000;
			 break;
		 case CIB:
			 cardfee=4000;
			 break;
		}
	}

	public String getName() {
		return name;
	}

	public LocalDate getValidity() {
		return Validity;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", Validity=" + Validity + ", balance=" + balance + ", bank=" + bank + "]";
	}

	public boolean getMoney(int price) {
		if (LocalDate.now().isBefore(Validity)) {
			if (balance >= price) {
				this.balance -= price;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean chargeFee(int input) throws NotEnoughMoneyException {
		if(this.cardfee>=input)
		{
			this.cardfee-=input;
			return true;
		}
		else
		{
			throw new NotEnoughMoneyException();
		}
	}
	public int getCardfee() {
		return cardfee;
	}
	
}
