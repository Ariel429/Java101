package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingHat {

	public static void main(String[] args) {
	// 마법사 이름, 기숙사 네개, 기억되고 싶은 사람 선택지 4개, 프린트 기숙사.
		System.out.println("마법사의 이름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		List<String> houses = new ArrayList<String>();
		houses.add("후플푸프");
		houses.add("슬리데린");
		houses.add("그리핀도르");
		houses.add("레번클로");
		
		System.out.println("어떤 사람으로 기억되고 싶나요?\n 1.착한\n 2.용감한\n 3.훌륭한\n 4.현명한");
		int userAnswer = sc.nextInt();
		
		System.out.println(username + " 님의 기숙사는 " + houses.get(userAnswer -1)+"입니다.");
		
	}

}
