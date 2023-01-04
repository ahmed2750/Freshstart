package restart;

public class GetnSetMethod {
	String name;
	int Age;
	

	public static void main(String[] args) {
		GetnSetMethod a = new GetnSetMethod();
		a.name = ("shak");
		a.Age  = (35) ;
		System.out.println(a.getName());
		System.out.println(a.getAge());
		a.printDetails();
	}
      public void setName (String name) {
    	  this.name = name;
      }
		public void setAge(int Age) {
		 this.Age=Age;
		}
		 public void printDetails() {
			 System.out.println(name + "," +Age);
		 }
		 public String getName() {
			 return this.name;
		 }
		    public int getAge() {
		       return this.Age;
		 
		}

}

