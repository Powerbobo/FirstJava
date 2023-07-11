package com.kh.day12.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		// 선택정렬
		
		int nums[] = { 5, 7, 2, 1, 4 };
		
		// 제일 작은 값을 제일 작은 인덱스 의 값과 변경
		
		// 1-1 : {1, 7, 2, 5, 4}
		
		// 2-1 : {1, 2, 7, 5, 4}
		
		// 3-1 : {1, 2, 4, 5, 7}
		
		// 4-1 : {1, 2, 4, 5, 7}
		
		// 결과 값 : {1, 2, 4, 5, 7}
		
		int min; // 인덱스 값 저장할 변수
		
		for(int i = 0; i < nums.length; i++) {
			min = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[min] > nums[j]) {
					min = j; // j 값을 min 에 저장
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
}
