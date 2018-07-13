
public class ClassB extends ClassA{

	
	public ClassB(int a) {
		
		super(a);
		// TODO Auto-generated constructor stub
		super.b = 10;
		super.m2();
	}

	/*public ClassB(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}*/

	public static void m1() {
		System.out.println(" I am from b");
	}

  @Override
	public void m2() {
	  System.out.println("i am from b");
  }
  public void m3() {
	  System.out.println(" i am from b");
	  super.m1();
  }
 public static void main(String[] args) {
	
	 ClassA a = new ClassB(20);
	 a.m1();
	 a.m2();
	 a.b=10;
	 ClassB b = (ClassB)a;
	 b.m3();
	
	 
}
}
