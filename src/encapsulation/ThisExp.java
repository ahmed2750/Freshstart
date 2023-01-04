package encapsulation;

public class ThisExp {
     int a;
     int b;
      public void setData(int a,int b) {
    	this. a = a;  
    	this. b = b;
    	 }
     public static void main(String[] args) {
		ThisExp e = new ThisExp();
		e.setData(4 , 8);
		System.out.println(e.a);
		System.out.println(e.b);
   }

}
