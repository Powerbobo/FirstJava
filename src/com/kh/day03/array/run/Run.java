package com.kh.day03.array.run;

import java.util.Random;
import java.util.Scanner;

import com.kh.day03.array.exercise.Exercise_Array1;
import com.kh.day03.array.exercise.Exercise_For;
import com.kh.day03.array.exercise.Exercise_Loop;
import com.kh.day03.array.exercise.Exercise_Random;
import com.kh.day03.array.exercise.Exercise_While;

public class Run {
	public static void main(String [] args)
	{
		// Exercise_Array1 cannot be resolved to a type
		// Scanner
		// Random
		Exercise_Array1 exArr = new Exercise_Array1();
		//변수에 저장되어있는 메서드를 실행하는 방법
//		exArr.exercise1();
//		exArr.exercise2();
//		exArr.arryCopyExercise();
		
		Exercise_For exFor = new Exercise_For();
//		exFor.forexercise1();
//		exFor.forexercise2();
//		exFor.forDoubleExercise1();
//		exFor.forDoubleExercise2();
//		exFor.forDoubleExercise3();
		
		Exercise_While exWhile = new Exercise_While();
//		exWhile.whileExercise1();
//		exWhile.whileExercise2();
		
		Exercise_Loop exLoop = new Exercise_Loop();
//		exLoop.exercise1();
//		exLoop.exercise2();
//		exLoop.exercise3();
//		exLoop.exercise4();
//		exLoop.exercise5();
//		exLoop.exercise6();
		
		Exercise_Random exRand = new Exercise_Random();
//		exRand.exRand1();
	}
}
