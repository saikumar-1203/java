package New;
interface II11
{
	void add1();
}
interface II12
{
	void add2();	
}
interface II13
{
	void add3();
}
class address1 implements II11,II12,II13
{
	public void add1() {
		System.out.println("maisammaguda");
	}
	public void add2() {
		System.out.println("bahadurpalli");
	}
	public void add3() {
		System.out.println("dhulapalli");
	}
}
interface II14 {
	void add4();
}
class address2 extends address1 implements II14{
	public void add4()
	{
		System.out.println("kompally");
	}
}

public class I1_I2_I3_in_c1_I4_in_c2 {

	public static void main(String[] args) {
		address2 a=new address2();
		a.add1();
		a.add2();
		a.add3();
		a.add4();


	}

}
