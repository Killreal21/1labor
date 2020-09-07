package com.company;
import java.util.Scanner;

public class Main {

    /*public static void main(String[] args) {
	int mass[]={1,5,3,19};
	int sum=0;
	for (int num:mass){
	    sum=sum+num;
    }
	System. out. println ("Сумма равна="+sum);
    }
}*/

	/*public static void main (String[] args){
		for (String str:args){
			System. out. println ("Аргумент="+str);
		}
	}
}*/

	/*public static void main(String[] args) {
	for (double i=1;i<11;i=i+1){
		System. out. printf ("%f%n",1/i);
	}
	}
}*/

	/*public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000);
			System.out.println(arr[i]);
		}
		System.out.println("Отсортированный:");
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}*/

	public static int Factorial(int n) {
		int k=1;
		for (int i=1; i<n+1;i++){
			k=k*i;
		}
		return k;
	}




	public static void main(String[] args) {
	int n=5;
		System.out.println(Factorial(n));
	}
}
