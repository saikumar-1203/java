package New;
interface II6{
	void engine();
}
class engine_1 {
	void engine_specilization() {
		System.out.println("Engine: Bs6");
	}
}
class Model extends engine_1 implements II6 {
	public void engine()
	{
		System.out.println("other Engine: Bs5");
	}
	void model(){
		System.out.println("Model: virtus");
	}
}
class Brand extends Model{
	void company() {
		System.out.println("Brand: volkswagan");
	}
	
}
public class I1_c1_in_c2_in_c3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brand b=new Brand();
		b.company();
		b.model();
		b.engine_specilization();
		b.engine();
	}

}
