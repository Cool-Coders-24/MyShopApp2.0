abstract class  Test
{
	public void m1(){
		System.out.println("Hello World!");
	}
	public void m2(){
		System.out.println("hii World!");
	}
	abstract void m3();
	public static void main(String[] args) 
	{
		Test t = new Test();
		
	}
}

Test.java:12: error: Test is abstract; cannot be instantiated
                Test t = new Test();