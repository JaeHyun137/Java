package ������;
import java.util.Scanner;

class Account{
	String name;
	int balance =0;
	public void withdraw(int amount) {
		if(balance<=0) {
			
			System.out.println("�ܾ� ����");
		}
		else {
			
			balance -= amount;
			System.out.println(amount+"�ݾ��� ��ݵǾ����ϴ�");
			
		}
		
	}
	public void deposit(int amount) {
		   
			balance += amount;
			System.out.println(amount+"�ݾ��� �ԱݵǾ����ϴ�");
	
	}
	public Account(String name) {
		this.name = name;
	}
	
}
public class ������_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("jae hyun");
		System.out.println(ac.name+"���� ���ο� ���°� ����������ϴ�. ");
		System.out.println("�Ա� : 1, ��� : 2, ���� :3 ");
		System.out.println("==========================");
		System.out.print("select menu : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("�Ա��� �ݾ� : ");
			ac.deposit(sc.nextInt());
			break;
		case 2:
			System.out.println("����� �ݾ� : ");
			ac.withdraw(sc.nextInt());
			break;
		case 3:
			System.out.println(ac.name+" ���� ���� �ܾ��� "+ac.balance+"�Դϴ�");
		}
		
		sc.close();
		

	}

}
