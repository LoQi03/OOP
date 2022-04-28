package faszom;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Card[] array = new Card[] {
				new CreditCard("Kiss Tamás",LocalDate.parse("2020-04-30"),Bank.OTP,150000,100000),
				new Card("Nagy Levente",LocalDate.parse("2022-05-31"),100000,Bank.ERSTE),
				new CreditCard("Szabó László",LocalDate.parse("2019-03-31"),Bank.OTP,200000,100000),
				new Card("Kovács Edit",LocalDate.parse("2021-01-31"),250000,Bank.OTP),
				};
			getMoney(array[0], 280000);
			getMoney(array[1], 80000);
			getMoney(array[2], 50000);
			getMoney(array[3], 100000);

	}
	public static void getMoney(Card input,int price)
	{
		if(input instanceof CreditCard)
		{
			if(((CreditCard) input).getMoneyCreditCard(price))
			{
				System.out.println("Pénzfelvétel:"+price+ " Sikeres Új egyenleg:"+input.getBalance()+ " Hitelkeret:"+((CreditCard)input).getCredit());
			}
			else
			{
				System.out.println("Pénzfelvétel:"+price+ " Sikertelen Új egyenleg:"+input.getBalance()+ " Hitelkeret:"+((CreditCard)input).getCredit());
			}
		}
		else
		{
			if(input.getMoney(price))
			{
				System.out.println("Pénzfelvétel:"+price+ " Sikeres Új egyenleg:"+input.getBalance());
			}
			else
			{
				System.out.println("Pénzfelvétel:"+price+ " Sikertelen Új egyenleg:"+input.getBalance());
			}
		}
	}
}
