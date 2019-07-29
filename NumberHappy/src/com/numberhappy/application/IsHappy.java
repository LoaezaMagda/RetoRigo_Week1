package com.numberhappy.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsHappy {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer num=0;
		System.out.println("Dame un numero");
		num=sc.nextInt();
		System.out.println(isnumberHappy(num) ? "Es happy" : "No es happy");
	}
	
	public static boolean isnumberHappy(int n){
		Set<Integer> entrada=new HashSet<Integer>();
		
		while(entrada.add(n)) {
			Integer acu=0;
				while(n>0) {
							acu+=(n%10)*(n%10);
							n/=10;  
						}
			n=acu;
			if(n==1) {
				return true;
			}
		 }
			return false;
	}
}
