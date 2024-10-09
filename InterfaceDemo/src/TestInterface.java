
public class TestInterface {
	public static void main(String[] args) {
		Interface1 obj=new MyClass();
		
		obj.m1();//Complier error:	Duplicate default methods named m1 with the parameters () and () are inherited from the types Interface2 and Interface1 if we doesnot override m1() method

		((MyClass)obj).m1();
	}
}
