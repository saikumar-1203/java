package New;
interface II19{
	void cricket();
}
interface II20 {
	void kabbadi();
}
interface games extends II19,II20{
	
}
class pet{
	void khokho() {
		System.out.println("I am playing khokho");
	}
}
class activities extends pet implements games{
	public void cricket()
	{
		System.out.println("I an playing cricket");
	}
	public void kabbadi()
	{
		System.out.println("I am playing kabbadi");
	}
}
public class I1_I2_in_I3_c1_in_c2 {

	public static void main(String[] args) {
		activities a1=new activities();
		a1.cricket();
		a1.kabbadi();
		a1.khokho();

	}

}
