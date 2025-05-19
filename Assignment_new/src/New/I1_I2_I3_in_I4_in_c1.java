package New;
interface II21{
	void in_1bhk();
}
interface II22{
	void in_2bhk();
}
interface II23{
	void in_3bhk();
}
interface II24 extends II21,II22,II23{
}
class rooms{
	public void in_1bhk() {
		System.out.println("in 1bhk.");
	}
	public void in_2bhk() {
		System.out.println("in 2bhk.");
	}
	public void in_3bhk() {
		System.out.println("in 3bhk.");
	}
	void residential()
	{
		System.out.println("types of portions:");
	}
}
public class I1_I2_I3_in_I4_in_c1 {

	public static void main(String[] args) {
		rooms r=new rooms();
		r.residential();
		r.in_1bhk();
		r.in_2bhk();
		r.in_3bhk();
	}
}
