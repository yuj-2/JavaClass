package com.util;

public class Graphic2D {
	public static void drawLine(){

		System.out.println("---------------"); //50줄 가정

	}

	public static void drawLine(int n){
		for (int i = 1; i <= n; i++) {
			System.out.print("-");
		}
		System.out.println("---------------"); //50줄 가정

	}

	public static void drawLine(int n, char style){
		for (int i = 1; i <= n; i++) {
			System.out.print(style);
		}
		System.out.println(); //50줄 가정

	}
}
