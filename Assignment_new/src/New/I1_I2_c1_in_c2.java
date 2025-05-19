package New;
interface II7
{
	void manchuriya();
}
interface II8
{
	void noodles();
}
class Fastfood{
	void friedrice() {
		System.out.println("One plate fried rice.");
	}
}
class Bill extends Fastfood implements II7,II8{
	public void manchuriya() {
		System.out.println("One plate manchuriya");
	}
	public void noodles() {
		System.out.println("One plate noodles");
	}
	void amount()
	{
		System.out.println("total amount:240");
	}
}
public class I1_I2_c1_in_c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill b=new Bill();
		b.noodles();
		b.friedrice();
		b.manchuriya();
		b.amount();
	}

}
