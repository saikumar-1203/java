package New;
interface II18{
	void coolers();
}
class c1{
	void brand1() {
		System.out.println("Symphony");
	}
}
class c2 extends c1 implements II18{
	public void coolers()
	{
		System.out.println("Voltas");
		
	}
}
class c3{
	public void freezers() {
		System.out.println("Whirlpool");
	}
}
class c4 extends c3{
	public void washingmachine() {
		System.out.println("LG");
	}
	
}

public class I1_c1_in_c2_c3_in_c4 {

	public static void main(String[] args) {
		c2 x=new c2();
		x.coolers();
		x.brand1();
		c4 y=new c4();
		y.freezers();
	}

}
