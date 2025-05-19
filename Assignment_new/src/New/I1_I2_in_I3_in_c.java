package New;

interface II1
{
	void love1();
}
interface II2
{
	void love2();
}
interface II3 extends II1,II2
{
	void love3();
}
public class I1_I2_in_I3_in_c implements II3 {
	public void love1()
	{
		System.out.print(" Love");
	}
	public void love2()
	{
		System.out.print(" You");
	}
	public void love3()
	{
		System.out.print("I");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1_I2_in_I3_in_c i1=new I1_I2_in_I3_in_c();
		i1.love3();
		i1.love1();
		i1.love2();
	}
}
