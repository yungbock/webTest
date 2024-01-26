package day02;

public class Variable01 {
	public static void main(String[] args) {
		//변수의 선언
		//자료형 변수명;
		int a; //정수를 저장할 수 있는 변수 a를 만들었다(선언했다)
		//변수에 값을 대입(저장한다)
		a = 10; //변수 a에 10이라는 정수값을 저장했다(대입했다)
		
		//변수를 선언과 동시에 초기화
		//자료형 변수명 = 값;
		int b = 20; //정수를 저장할 수 있는 변수 b를 선언하고 
		//20이라는 값으로 초기화했다
		
		System.out.println(a);
		System.out.println(b);
		
//		int c;
//		System.out.println(c);
//		변수에 값을 초기화하지 않으면 에러 발생
		
		//여러개의 변수의 선언하는 방법
		//자료형 변수명1, 변수명2, 변수명3;
		//변수명1 = 값;
		int num1, num2, num3;
		num1 = 1;
		num2 = 2;
		num3 = 3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//여러개의 변수를 선언하면서 한번에 초기화
		//자료형 변수명1 = 값, 변수명2 = 값;
		double do1 = 3.14, do2 = 5.11;
		System.out.println(do1);
		System.out.println(do2);
		
//		int a = 10;
//		같은 영역에서 같은 이름으로 변수 선언 시 오류 발생
//		a = 10;
//		자료형을 기재하지 않고 값을 대입할 경우 
//		마지막으로 대입된 값으로 저장된다
		
		
	}
}









