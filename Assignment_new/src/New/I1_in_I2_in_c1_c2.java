package New;
interface II4{
	void model();
}
interface II5 extends II4{
	void price();
}
class Oldlaptop implements II5{
	public void model() {
		System.out.println("model:Hp vectus");
	}
	public void price() {
		System.out.println("price:60000");
	}
	public void ram() {
		System.out.println("Ram:8 Gb.");
	}
}
class Newlaptop implements II5{
	public void model() {
		System.out.println("model:Msi Bravo");
	}
	public void price() {
		System.out.println("price:45000");
	}
	public void ram() {
		System.out.println("Ram:16 Gb");
	}
}
public class I1_in_I2_in_c1_c2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oldlaptop o=new Oldlaptop();
		Newlaptop n=new Newlaptop();
		o.model();
		o.price();
		o.ram();
		n.model();
		n.price();
		n.ram();
	}
}
