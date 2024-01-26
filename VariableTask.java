package day02;

public class VariableTask {
	public static void main(String[] args) {
		//1. 주어진 값과 자료형을 가지고 선언과 동시에 초기화
		
		//오늘의 날짜 9 int
		int day = 9;
		//키 180.5
		double height = 180.5;
		//몸무게 30.2
		float weight = 30.2f;
		//지하철역이름 역삼역
		String station = "역삼역";
		//대면 비대면 여부 true
		boolean zoom = true;
		//성별(gender) F/M
		char gender = 'F';
		
//		출력하기
		System.out.println(day);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(station);
		System.out.println(zoom);
		System.out.println(gender);
		
// +) 정수형 변수 num1과 num2를 선언하고 원하는 값으로 초기화 한 후
//  두 변수를 더한 변수 result에 저장한 후 출력하기
		int num1 = 100, num2 = 200;
		int result = num1 + num2;
		System.out.println(num1 + num2);
		System.out.println(result);

		
	}
}








