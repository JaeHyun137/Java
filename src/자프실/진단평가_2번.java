package ������;

class Calc{ //�ۺ� �ƴ϶� ��ü ���� ���� - �̰� �����ؼ� �򰥷��� �����Ѱ� �ִµ� ã�ƺ���
	
	
	//�����ε� : "�� Ŭ���� ������" �ΰ� �̻��� �̸��� ����, �Ű������� ���еǴ� �޼ҵ� �ۼ�
	//�ݸ� �������̵��� ����Ŭ������ �޼ҵ带 "����" Ŭ�������� ������
	public String sum(int x,int y) {
		return x+"+"+y+" = "+ (x+y);    //�Ű������� �� Ŭ������ ����� ���ǵǾ����� �ʾƵ� ��
	}
	public String sum(int x,int y,int z) {
		return x+"+"+y+"+"+z+" = "+ (x+y+z) ;     //�Ű������� �� Ŭ������ ����� ���ǵǾ����� �ʾƵ� ��
	}
}

public class ������_2�� {

	public static void main(String[] args) {
		Calc ca = new Calc();
		System.out.println(ca.sum(1, 2));
		System.out.println(ca.sum(1, 2,3));
		

	}

}
