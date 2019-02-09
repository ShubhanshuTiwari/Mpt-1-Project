package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountServiceImpl accountserviceimpl=new AccountServiceImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("1 for Account Balance Enquiry");
			System.out.println("2 for Recharge Account");
			System.out.println("3 Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:System.out.println("Enter the mobile No");
					String mobileno=sc.next();
				//	sc.nextLine();
					char ch[]=mobileno.toCharArray();
					if(ch.length!=10) {
						System.out.println("Enter a valid Number");
					}
					else {
						System.out.println(accountserviceimpl.getAccountDetails(mobileno));
					}
				break;
			case 2:System.out.println("Enter a mobile no");
					String mobileno1=sc.next();
					System.out.println("Enter the balance need to be deposit");
					double rechargeAmount=sc.nextDouble();
			//	sc.nextLine();
					char ch2[]=mobileno1.toCharArray();
					if(ch2.length!=10) {
					System.out.println("Enter a valid Number");
				}
					else {
					int flag=accountserviceimpl.rechargeAccount(mobileno1, rechargeAmount);
					if(flag==1) {
						System.out.println("Recharge Account Sucessfull");
						
					}
				    }
				break;
			case 3:System.out.println("---Thanks For Using Our System----");
				System.exit(0);
				break;
				
			
			}
		}
		
		
		
		
		
	}

}
