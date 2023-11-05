package com.client;
import java.util.Scanner;
import com.service.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Vehicle[] a=new Vehicle[];
		Rto obj=new Pune();
		while(true)
		{
			//System.out.println("Welcome to Vehicle Registeration System\n Options");
			//int a=sc.nextInt();
			//obj.entry(a);
			System.out.println("1.Register your vehicle\n2.View your vehicle\n3.Update your Details");
			System.out.println("what is your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				//obj.entry(3);
				obj.regVehicle();
				break;
			case 2:	
				obj.viewDetails();
				break;
			case 3:	
				obj.updateVehicle();
				break;
			default :
				System.out.println("invalid choice code");
			}
		}

	}

}
