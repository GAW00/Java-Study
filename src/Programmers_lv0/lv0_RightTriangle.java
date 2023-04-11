package Programmers_lv0;

import java.util.Scanner;

public class lv0_RightTriangle {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");   
            }
            System.out.println();
        }
        sc.close();
    }
	/*
	 * public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print("*".repeat(i));
        }
        sc.close();
    }
	 */
}
