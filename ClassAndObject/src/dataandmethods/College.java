package dataandmethods;

public class College {
public static void main(String[] args) {
	Student pranav=new Student();
	pranav.collegefee=50000;
	pranav.examfee=5000;
	pranav.name="pranav";
	int a=pranav.totalpay(25000,100200);
	
	Student nikkie=new Student();
	nikkie.collegefee=60000;
	nikkie.examfee=5600;
	nikkie.name="nikkie";
	int b=nikkie.totalpay(27000,100000);
	
	Student navya=new Student();
	navya.collegefee=60000;
	navya.examfee=5600;
	navya.name="navya";
	int p=navya.totalpay(26000,100900);
	
	int c=a+b+p;
	System.out.println(" total fee  "+c);
}
}
