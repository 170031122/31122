package firstday;

public class SwitchDemo {
public static void main(String[] args) {
	int i=0;
	switch(i) {
	case 0:System.out.println("light on");
	//break;
	case 1:System.out.println("ac on");
	//break;
	case 2:System.out.println("projector on");
	break;
	case 3:System.out.println("system on");
	break;
	default:System.out.println("check switch 0 to 3");
	break;
	}
}
}
