package restart;

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	//getter and setter method with constructor
	
	public Dog() {
		name = "woofy";
	    breed = "German";
		age = 2;
	}
	
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getBreed() {
    	return breed;
    }
    public void setBreed(String breed) {
    	this.breed = breed;
    }
    public int getAge() {
    	return age;
    }
   
    
    public void setAge(int age) {
    	this.age=age;
    }
    public String toString() {
    	return "name=  " +name+ ", breed=  " +breed+ ", age=  "  +age;
    }

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		System.out.println(dog);

	}

}
