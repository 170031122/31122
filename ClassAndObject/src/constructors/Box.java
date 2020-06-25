package constructors;

public class Box {

	int lenght;
	int width;
	
	Box()
	{
		this.lenght=10;
		this.width=10;
	}
	
	Box(int lenght,int width)
	{
		this.lenght=lenght;
		this.width=width;
	}
	
		public void totalbox()
	{
		int area=lenght+width;
		System.out.println("area "+area);
	}
}
