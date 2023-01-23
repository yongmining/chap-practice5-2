package chap04_1_solving;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고 
		 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
		 * 
		 * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 홀수인 양의 정수를 입력하세요 : 7
		 * 
		 * -- 출력 예시 --
		 * 1 2 3 4 3 2 1
		 * 
		 * -- 입력 예시 --
		 * 홀수인 양의 정수를 입력하세요 : 8
		 * 
		 * -- 출력 예시 --
		 * 양수 혹은 홀수만 입력해야 합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int index;

		while (true) {
			System.out.println("홀수인 양의 정수를 입력하세요. : ");
			index = sc.nextInt();  // 정수 입력

			//만약 입력한 정수가 짝수이거나 0이하이면
			if (index % 2 == 0 || index <= 0) {
				System.out.println("양수 혹은 홀수만 입력해야 합니다."); //while문 다시돌기
			} else { //아니면
				break;  //while문 종료
			}
		}

		int cnt = 0;
		int[] arr = new int[index];  //입력한 정수만큼의 크기를 가진 정수형 배열 선언

		for (int i = 0; i <= arr.length / 2; i++) { // 인덱스 범위의 절반만큼
			arr[i] = ++cnt; //1씩 증가
		}
		for (int i = arr.length / 2 + 1; i < arr.length; i++) { //나머지 절반만큼
			arr[i] = --cnt; //1씩 감소
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
