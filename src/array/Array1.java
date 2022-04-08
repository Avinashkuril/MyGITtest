package array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		char cha[]=new char[5];
		
		cha[0]='A';
		cha[1]='D';
		cha[2]='E';
		cha[3]='b';
		cha[4]='C';
		
//		System.out.println(cha[0]);
//		System.out.println(cha[1]);
//		System.out.println(cha[2]);
//		System.out.println(cha[3]);
//		System.out.println(cha[4]);
//		System.out.println();
//		System.out.println("===========================");
//		
//		
//		for(int i=0;i<=4;i++) {
//			System.out.println(cha[i]);
//		}
//		
//		for(int i=4;i>=0;i--) {
//			System.out.println(cha[i]);
//		}
		
		Arrays.sort(cha);
		
		for(int i=0;i<=4;i++) {
			System.out.println(cha[i]);
		}
		
		System.out.println();
		System.out.println("==================");
		
		for(int i=4;i>=0;i--) {
			System.out.println(cha[i]);
		}
		
		
		
		

	}

}
