package 자프실;

class Calc{ //퍼블릭 아니라도 객체 생성 가능 - 이거 관련해서 헷갈려서 정리한거 있는데 찾아보기
	
	
	//오버로딩 : "한 클래스 내에서" 두개 이상의 이름이 같은, 매개변수로 구분되는 메소드 작성
	//반면 오버라이딩은 슈퍼클래스의 메소드를 "서브" 클래스에서 재정의
	public String sum(int x,int y) {
		return x+"+"+y+" = "+ (x+y);    //매개변수가 꼭 클래스의 멤버로 정의되어있지 않아도 됨
	}
	public String sum(int x,int y,int z) {
		return x+"+"+y+"+"+z+" = "+ (x+y+z) ;     //매개변수가 꼭 클래스의 멤버로 정의되어있지 않아도 됨
	}
}

public class 진단평가_2번 {

	public static void main(String[] args) {
		Calc ca = new Calc();
		System.out.println(ca.sum(1, 2));
		System.out.println(ca.sum(1, 2,3));
		

	}

}
