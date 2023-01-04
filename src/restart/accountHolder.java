package restart;

public class accountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligilityForCreditCard;
     public void testEligibiltyForCreditCard() {
    	 if(age>21 && accountBalance >= 20000){
    		 eligilityForCreditCard=true;
    	 }
    	 
     }
}
