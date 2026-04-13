package javaProgramming;

import java.util.Scanner;

public class TableOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Which table you want ?");
		int num = sc.nextInt();
		System.out.println();
		//Table of 2
		
		System.out.println("Table of "+num);
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
