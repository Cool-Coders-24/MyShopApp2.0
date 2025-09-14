abstract class  Test
{
	public void m1(){
		System.out.println("Hello World!");
	}
	public void m2(){
		System.out.println("hii World!");
	}
	abstract void m3();
	abstract void m4();
	abstract void m5();
	abstract void m5();
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
		
	}
}

Test.java:12: error: Test is abstract; cannot be instantiated
                Test t = new Test();
