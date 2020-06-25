package dataandmethods;

public class Student {
	
	int collegefee;
	int examfee;
	int total;
	String name;
	
	public int totalpay(int collegefee,int examfee) {
		total=this.collegefee+this.examfee;
		System.out.println(name+" total fee  "+total);
		return total;
	}
}
