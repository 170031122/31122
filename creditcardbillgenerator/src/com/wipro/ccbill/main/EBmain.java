package com.wipro.ccbill.main;

public class EBmain {
  public static void main(String[] args)
  {
	  System.out.println(new ConnectionService().generateBill(130,100,"Commercial"));
  }
}
