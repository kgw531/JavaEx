package com.jungang;

import java.util.Scanner;

public class Practice3 { 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int var1 = 1;
		
		
		while(true) {
			int input = scan.nextInt();
			switch (input) {
			case 1:
				var1 = var1 + scan.nextInt();
				System.out.println(var1);
				
				break;
			case 2:
				int var2 = var1 + scan.nextInt();
				System.out.println(var1 + var2);
				
				
				
				break;
			}
			
		}
	}

}
