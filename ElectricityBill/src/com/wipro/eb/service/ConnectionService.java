package com.wipro.eb.service;

import com.wipro.eb.entity.Connection;

public class ConnectionService {
	public boolean validate(int currentReading,int previousReading,String type) throws InvalidConnecionException,InvalidReadingException
	{
	 if(currentReading<previousReading || previousReading<0 || currentReading<0)
			throw new InvalidReadingException();
	 else
	 {
		if(type!="Domestic" || type!="Commercial")
			throw new InvalidConnecionException();
		else 
			return true;
	}
	}
 public float calculateBillAmt(int currentReading,int previousReading,String type)
 {
	 float amt=0;
	 try
	 {
		 if(validate(currentReading,previousReading,type)==true)
		 {
			 Connection c;
			 if(type=="Domestic")
			 {
				 c=new Domestic();
				 amt=c.computeBill();
			 }
			 else
			 {
				 c=new Commercial();
				 amt=c.computeBill();
			 }
			 return amt;
		 }
		 else
			 return 0.0;
	 }
	 catch(InvalidReadingException e)
	 {
		 return -1;
	 }
	 catch(InvalidConnecionException e)
	 {
		 return -2;
	 }
 }
   public String generateBill(int currentReading,int previousReading,String type)
   {
	   float res=calculateBillAmt(currentReading,previousReading,type);
	   if(res==-1)
		   return "InvalidReadingException";
	   else if(res==-2)
		   return "InvalidConnecionException";
	   else 
		   return "Amount to be paid:+res";
   }
 
}
