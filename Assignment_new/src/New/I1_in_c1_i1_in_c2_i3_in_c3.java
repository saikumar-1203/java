package New;
interface II15{
	void add11();
}
class address11 implements II15{
	public void add11() 
	{
		System.out.println("mallareddy in maisammaguda");
	}
}
interface II16{
	void add22();
}
class address22 implements II16{
	public void add22()
	{
		System.out.println("cmr in kandlakoya");
	}
}
interface II17{
	void add33();
}
class address33 implements II17{
	public void add33()
	{
		System.out.println("st.martins in kompally");
	}
}
public class I1_in_c1_i1_in_c2_i3_in_c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		address11 a1=new address11();
		a1.add11();
		address22 a2=new address22();
		a2.add22();
		address33 a3=new address33();
		a3.add33();

	}

}
