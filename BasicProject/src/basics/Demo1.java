package basics;

public class Demo1 {
     	
	    public int a=10;
     	private int b=20;
     	int c=30;//package level
     	protected int d=40;
     	
public static void main(String[] args) {
	Demo1 d1=new Demo1();
	System.out.println(d1.a);
	System.out.println(d1.b);
	System.out.println(d1.c);
	System.out.println(d1.d);
}
}
