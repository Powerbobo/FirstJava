package com.kh.day12.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		// 삽입 정렬

		int nums[] = { 5, 7, 2, 1, 4 };

		// 2번째 숫자부터 왼쪽이랑 비교해서 큰 값이 오른쪽으로 이동

		// 1-1 : {5, 7, 2, 1, 4}

		// 2-1 : {5, 2, 7, 1, 4}
		// 2-2 : {2, 5, 7, 1, 4}

		// 3-1 : {2, 5, 1, 7, 4}
		// 3-2 : {2, 1, 5, 7, 4}
		// 3-3 : {1, 2, 5, 7, 4}

		// 4-1 : {1, 2, 5, 4, 7}
		// 4-2 : {1, 2, 4, 5, 7} -> 여기서 정렬이 끝났지만, 정렬이 됬어도 계속 비교!
		// 4-3 : {1, 2, 4, 5, 7}
		// 4-4 : {1, 2, 4, 5, 7}

		// 결과 값 : {1, 2, 4, 5, 7}

		for (int i = 1; i < nums.length; i++) {
			// 위치는 점점 증가하고, 비교하는 인덱스는 감소
			for (int j = i; j > 0; j--) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}
}
