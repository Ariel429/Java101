package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingHat {

	public static void main(String[] args) {
	// ������ �̸�, ����� �װ�, ���ǰ� ���� ��� ������ 4��, ����Ʈ �����.
		System.out.println("�������� �̸��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		List<String> houses = new ArrayList<String>();
		houses.add("����Ǫ��");
		houses.add("��������");
		houses.add("�׸��ɵ���");
		houses.add("����Ŭ��");
		
		System.out.println("� ������� ���ǰ� �ͳ���?\n 1.����\n 2.�밨��\n 3.�Ǹ���\n 4.������");
		int userAnswer = sc.nextInt();
		
		System.out.println(username + " ���� ������ " + houses.get(userAnswer -1)+"�Դϴ�.");
		
	}

}
