package practice;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 林籍贸府  
		// print() -> System.out.println()
		System.out.println("hello world");
		int title;
		title = 300;
		System.out.println(title);
		System.out.println();
		
		String name = "沥局";
		int money = 3000;
		System.out.println(name + money);
		String name2 = getName();
		System.out.println(name2);
	}
	
	public static void method1() {
		System.out.println("method1");
	}
	
	public static String getName() {
		return "沥局";
	}

}
