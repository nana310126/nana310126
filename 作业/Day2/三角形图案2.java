package ��ϰ;

import java.util.Scanner;

public class ������ͼ��2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("�������кţ�");
		int num=input.nextInt();
		for(int i=1;i<=num;i++){
			//��ӡ�ո�
			for(int j=1;j<=num-i;j++){
				System.out.println(" ");
			}
			//��ӡ�Ǻ�
			for(int j=1;j<=i*2-1;j++){
				System.out.println("*");
			}
			System.out.println();
		}
			}

	}


