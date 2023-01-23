package chap04_1_solving;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * 검색할 문자를 하나 입력 받아 
		 * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 문자열을 하나 입력하세요 : helloworld
		 * 검색할 문자를 입력하세요 : l
		 * 
		 * -- 출력 예시 --
		 * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);  //입력받을 준비
		System.out.print("문자열을 하나 입력하세요. : "); 
		String str = sc.nextLine();  //문자열 입력
		char[] ch = new char[str.length()];  //문자형 배열을 문자열 길이만큼의 크기로 선언 및 할당

		for (int i = 0; i < ch.length; i++) {  //배열의 인덱스 범위에서
			ch[i] = str.charAt(i);  //문자열의 i번째 문자를 배열의 i번째에 입력
		}

		System.out.print("검색할 문자를 입력하세요. : ");
		char ch1 = sc.nextLine().charAt(0);  //검색할 문자를 입력 후
		// 문자를 문자열 형태로 받아와 0번째의 문자를 ch1에 대입

		int cnt = 0; //문자 갯수 저장
		for (int i = 0; i < ch.length; i++) {  //배열의 인덱스 범위에서
			if (ch[i] == ch1)  // 배열의 인덱스의 값이 입력한 문자와 같으면
				cnt++;  // 같은 문자 갯수 1증가

		}

		System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch1 + "은 " + cnt + "개 입니다.");

	}

}
