package com.wipro.eb.entity;

public class Commercial extends Connection
{
	public Commercial(int currentReading,int previousReading,float slabs[])
	{
		this.currentReading=currentReading;
		this.previousReading=previousReading;
		this.slabs=slabs;
	}
	public float computeBill()
	{
		float bill=0;
		int units=currentReading-previousReading;
		if(units<=50)
		{
			bill=bill+units*slabs[0];
		}
		else if(units>50 && units<=100)
		{
			bill=bill+(units-50)*slabs[1]+50*slabs[0];
		}
		else
			bill=bill+(units-100)*slabs[2]+50*slabs[1]+50*slabs[0];
		
		return units;
	}
}
