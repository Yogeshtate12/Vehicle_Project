package com.service;
import java.util.Scanner;
import com.model.Vehicle;
public class Pune implements Rto{
	Scanner sc=new Scanner(System.in);
	//int en;
	/*public void entry(int n)
	{
		en=n;
		System.out.println(en);
	}*/
	
	Vehicle v[]=new Vehicle[2];
	
	//int i=0;
	int count=1;
	@Override
	
	
	public Vehicle[] regVehicle()
	{
		
		//Vehicle v[]=new Vehicle[1];
		for(int i=0;i<v.length;i++)
		{
			Vehicle v1=new Vehicle();
			System.out.println(count);
			v1.setSrNo(count);
			v[i]=v1;
		System.out.println("Enter registeration id:");
		v[i].setRegId(sc.nextInt());
		System.out.println("Enter Model Name :");
		sc.nextLine();
		
		v[i].setModelName(sc.nextLine());
		System.out.println("enter price");
		v[i].setPrice(sc.nextFloat());
		System.out.println("Enter the colour");
		v[i].setColour(sc.next());
		System.out.println("Enter the area");
		v[i].setArea(sc.next());
		System.out.println("Enter ownername");
		v[i].setOwnerName(sc.nextLine());
		v[i].setOwnerName(sc.nextLine());
		System.out.println("Enter Mobile Number");
		v[i].setMob(sc.nextLong());
		System.out.println("Enter adhaar number");
		v[i].setAdhaar(sc.nextLong());
		System.out.println("-----------------------------------------------------");
		 count++;
		//break;
		}
		
		return v;
	}
	@Override
	public void updateVehicle()
	{
		System.out.println("enter serial number");
		int no=sc.nextInt();
		for(int i=no-1;i<no;i++)
		{
		//System.out.println("Enter");
		System.out.println("1.Update price\n2.Update Owner Name");
		System.out.println("What you want to update?\nEnter choice");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			v[i].setPrice(sc.nextFloat());
			break;
		case 2 :
			sc.nextLine();
			v[i].setOwnerName(sc.nextLine());
			break;
		default :
			System.out.println("invalid choice code");
		}
		}
		
	}
	public  void viewDetails()
	{
		System.out.println("enter the vehicles");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		System.out.println("SR.NO :"+v[i].getSrNO());	
		System.out.println("REGISTERATION ID: "+v[i].getRegId());
		System.out.println("MODEL NAME : "+v[i].getModelName());
		System.out.println("PRICE: "+v[i].getPrice());
		System.out.println("COLOUR: "+v[i].getColour());
		System.out.println("AREA: "+v[i].getArea());
		System.out.println("OWNER NAME: "+v[i].getOwnerName());
		System.out.println("MOBILE NUMBER: "+v[i].getMob());
		System.out.println("ADHAAR NUMBER: "+v[i].getAdhaar());
		System.out.println("------------------------------------------------");
		}
	}
	
	
 }


