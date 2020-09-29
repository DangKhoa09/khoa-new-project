package BaiTap;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">>Kiem tra so chan le<<");
		System.out.println("Nhap so can kiem tra :");
		int so= sc.nextInt();
		if(so % 2 ==0) {
			System.out.println(" So "+so+ " la so chan");
			
		}
		else {
		System.out.println( "So"+so+" la so le");
		}
		}

	}


