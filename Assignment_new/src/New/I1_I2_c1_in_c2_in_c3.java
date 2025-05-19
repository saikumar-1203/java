package New;
interface II9{
	void add();
}
interface II10{
	void sub();
}
class arithmetic{
	void mul() {
		System.out.println("Product is :"+(12*6));
	}
}
class arithmetic_operation extends arithmetic implements II9,II10
{
	public void add() {
		System.out.println("sum is:"+(12+6));
	}
	public void sub() {
		System.out.println("difference is:"+(12-6));
	}
	void div() 
	{
		System.out.println("quotient is :"+(12/6));
	}
}
public class I1_I2_c1_in_c2_in_c3 {

	public static void main(String[] args) {
		arithmetic_operation a=new arithmetic_operation();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}
}
