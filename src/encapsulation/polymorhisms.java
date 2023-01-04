package encapsulation;
class Bird{
	public void sing() {
		System.out.println("twet tweet tweet");
	}
}
class Robin extends Bird {
	public void sing() {
		System.out.println("twedd ledeedee");
	}
}

public class polymorhisms {

	public static void main(String[] args) {
//		Bird b = new Bird();
//		b.sing();
		Robin r = new Robin();
		r.sing();

	}

}
