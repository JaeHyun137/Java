package 자프실;

import java.util.Scanner;

class Student{  //퍼블릭 클래스 하나만. 클래스안에 클래스 넣ㅈ말기
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
		return "\n<학생 정보>\n나이 : "+this.getAge() + "\n학번 : "+this.getRollno() +"\n이름 : "+this.getName();
	}
}

public class 진단평가_1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("나이 : ");
		s.setAge(sc.nextInt());
		System.out.print("학번 : ");
		s.setRollno(sc.nextInt());
		System.out.print("이름 : ");
		s.setName(sc.next());
		System.out.println(s.toString());
		sc.close();
		

	}

}
