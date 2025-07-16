package com.subodh.collection;

import java.util.HashMap;

public class HashMap_Project {

	public static void main(String[] args) {
		BankAccount ac1=new BankAccount(1234, "customer1", 10000,"Ameerpet");
		BankAccount ac2=new BankAccount(1235, "customer2", 20000,"SrNagar");
		BankAccount ac3=new BankAccount(1236, "customer3", 30000,"Ameerpet");
		BankAccount ac4=new BankAccount(1237, "customer4", 40000,"Ameerpet");
		BankAccount ac5=new BankAccount(1238, "customer5", 50000,"HitechCity");
		BankAccount ac6=new BankAccount(1239, "customer6", 60000,"Panjagotta");
		BankAccount ac7=new BankAccount(1241, "customer7", 70000,"KPHB");
		BankAccount ac8=new BankAccount(1241, "customer8", 70000,"KPHB");
		BankAccount ac9=new BankAccount(1241, "customer9", 70000,"KPHB");
		
		HashMap<BankAccount,Integer>bankAccountMap=new HashMap<>();
		bankAccountMap.put(ac1, 1);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac2, 2);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac3, 3);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac4, 4);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac5, 5);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac6, 6);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac7, 7);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac8, 7);		System.out.println(bankAccountMap);	System.out.println("...");
		bankAccountMap.put(ac9, 7);		System.out.println(bankAccountMap);	System.out.println("...");
		System.out.println(bankAccountMap);
	}

}
