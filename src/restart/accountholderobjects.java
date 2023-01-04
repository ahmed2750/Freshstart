package restart;

public class accountholderobjects {

	public static void main(String[] args) {
		accountHolder tom = new accountHolder();
		accountHolder henry = new accountHolder();
		accountHolder Sarah = new accountHolder();
		
		tom .firstName = "Tom";
		tom .lastName  = "Smith";
		tom.age    = 20;
		tom .accountBalance = 10000;
		tom.testEligibiltyForCreditCard();
		System.out.println("is Tom Eligible for cc: "+tom.eligilityForCreditCard);
	}

}
