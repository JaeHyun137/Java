package 자프실;
import java.util.Scanner;

class Account{
	String name;
	int balance =0;
	public void withdraw(int amount) {
		if(balance<=0) {
			
			System.out.println("잔액 부족");
		}
		else {
			
			balance -= amount;
			System.out.println(amount+"금액이 출금되었습니다");
			
		}
		
	}
	public void deposit(int amount) {
		   
			balance += amount;
			System.out.println(amount+"금액이 입금되었습니다");
	
	}
	public Account(String name) {
		this.name = name;
	}
	
}
public class 진단평가_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("jae hyun");
		System.out.println(ac.name+"님의 새로운 계좌가 만들어졌습니다. ");
		System.out.println("입금 : 1, 출금 : 2, 종료 :3 ");
		System.out.println("==========================");
		System.out.print("select menu : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("입금할 금액 : ");
			ac.deposit(sc.nextInt());
			break;
		case 2:
			System.out.println("출금할 금액 : ");
			ac.withdraw(sc.nextInt());
			break;
		case 3:
			System.out.println(ac.name+" 님의 최종 잔액은 "+ac.balance+"입니다");
		}
		
		sc.close();
		

	}

}
