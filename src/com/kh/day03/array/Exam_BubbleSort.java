package com.kh.day03.array;

public class Exam_BubbleSort {
	public static void main(String [] args)
	{
		// 버블정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 기본적으로 다른 정렬에 비해서는 속도가 느린편이며 역순으로 
		// 정렬할 때 가장 느림
		
		// {2, 5, 4, 1, 3}
		
		// {2, 4, 1, 3, 5}
		
		// {2, 1 ,3, 4, 5}
		
		// {2, 1, 3, 4, 5}
		
		// {1, 2, 3, 4, 5}
		

		
//		// 첫 번째 (가장 큰 수가 맨 오른쪽으로 감)
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[0];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;
//		}
//		// {2, 5, 4, 1, 3} -> 안바뀜
//		
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;
//		}
//		// {2, 4, 5, 1, 3} -> 바뀜
//		
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[3];
//			arrs[3] = temp;
//		}
//		// {2, 4, 1, 5, 3} -> 바뀜
//		
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[4];
//			arrs[4] = temp;
//		}
//		// {2, 4, 1, 3, 5} -> 바뀜
//		// =======================================================
//		
//		// 두 번째
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;
//		}
//		// {2, 4, 1, 3, 5} -> 안바뀜
//		
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;
//		}
//		// {2, 1, 4, 3, 5} -> 바뀜
//		
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;
//		}
//		// {2, 1, 4, 3, 5} -> 바뀜
//		
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[2] = arrs[3];
//			arrs[3] = temp;
//		}
//		// {2, 1, 3, 4, 5} -> 바뀜
//		// =======================================================
//		
//		// 세 번째
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;
//		}
//		// {1, 2, 3, 4, 5} -> 바뀜
//		
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[1];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;
//		}
//		// {1, 2, 3, 4, 5} -> 안바뀜
//		// =======================================================
//		
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[0];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;			
//		}
//		// {1, 2, 3, 4, 5} -> 안바뀜
//		// ========================================================
//		// {1, 2, 3, 4, 5} => 종료
		
		int [] arrs = {2, 5, 4, 1, 3};
		// j = 0 ~ 3
		// 배열의 길이가 총 5인데, j의 값은 0 ~ 3까지 증가한다.
		// j 의 값은 0부터 점점 늘어나는데, j 값이 4가 되면 안되기 때문에
		// j < arrs.length-1 을 해서 j의 값이 3 까지만 늘어나게끔 하고,
		// 버블 정렬은 큰 숫자가 이동해서 맨 오른쪽으로 이동하기 때문에
		// 첫번째엔 4번 비교가 되고, 두번째엔 3번 비교가 된다.
		// 점점 비교되는 횟수가 줄어들어야 하기 때문에 i를 0 부터 점점 늘어나게
		// 조건식을 설정하고, 
		// 조건식을 j < (arrs.length-1)-i 으로 작성한다.
		// i 의 최대값은 배열의 길이-1 이여야 하기 때문에
		// 조건식을 i < arrs.length-1 으로 작성한다.
		for(int i = 0; i < arrs.length-1; i++) {

			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if (arrs[j] > arrs[j+1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}
			}
		}
		// 배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
		
		
		
		
		

		
		
	}
}
