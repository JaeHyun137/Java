package ������;

import java.util.Scanner;

class Student{  //�ۺ� Ŭ���� �ϳ���. Ŭ�����ȿ� Ŭ���� �֤�����
	int rollno,age;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "\n<�л� ����>\n���� : "+this.getAge() + "\n�й� : "+this.getRollno() +"\n�̸� : "+this.getName();
	}
}

public class ������_1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("���� : ");
		s.setAge(sc.nextInt());
		System.out.print("�й� : ");
		s.setRollno(sc.nextInt());
		System.out.print("�̸� : ");
		s.setName(sc.next());
		System.out.println(s.toString());
		sc.close();
		

	}

}
