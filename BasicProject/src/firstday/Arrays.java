package firstday;

public class Arrays {
public static void main(String[] args) {
       //int a[]=new int[5];
       //a[0]=10;
      // a[2]=30;
      // a[4]=40;
       //System.out.println(a[3]);
    //   for(int c:a)
    //   {
    	//   System.out.println(c);
      // }
       
       
       int b[][]=new int[3][4];
       int i,j,temp=10;
       for(i=0;i<3;i++) {
    	 for(j=0;j<4;j++) {
    		 b[i][j]=temp;
    		 temp+=10;
       }
       }
       
       for(i=0;i<3;i++) {
    	   for(j=0;j<4;j++) {
    		  System.out.print(b[i][j]+"  "); 	 
    	   }
    	   System.out.println();
       }
       
	}
}
