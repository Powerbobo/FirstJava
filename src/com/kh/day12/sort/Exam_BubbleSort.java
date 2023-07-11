package com.kh.day12.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
		
		// 배열 생성
		int [] nums  = {5, 7, 2, 1, 4};
		
		// 버블 정렬 => 왼쪽 숫자부터 오른쪽에 있는 숫자랑 비교하면서 계속 우측으로 이동
		
		// 1-1 : {5, 7, 2, 1, 4}
		// 1-2 : {5, 2, 7, 1, 4}
		// 1-3 : {5, 2, 1, 7, 4}
		// 1-4 : {5, 2, 1, 4, 7}
		
		// 2-1 : {2, 5, 1, 4, 7}
		// 2-2 : {2, 1, 5, 4, 7}
		// 2-3 : {2, 1, 4, 5, 7}
		
		// 3-1 : {1, 2, 4, 5, 7} -> 여기서 정렬이 끝났지만, 정렬이 됬어도 계속 비교!
		// 3-2 : {1, 2, 4, 5, 7}
		
		// 4-1 : {1, 2, 4, 5, 7}
		
		// 결과 값 : {1, 2, 4, 5, 7}
		
		// i값을 빼면서 점점 비교하는 숫자가 줄어들 수 있게끔.
		for(int i = 0; i < nums.length-1; i ++) {
			// 배열의 갯수보다 비교하는 숫자가 적기때문에 -1
			for(int j = 0; j < (nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp; 
				}
			}
		}
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
}
