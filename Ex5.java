abstract class Ex3
{
	public void m1(){
		System.out.println("m1-method");
	}
	abstract void m2();
	abstract void m3();
}
abstract class Ex4 extends Ex3
{
	public void m2(){
		System.out.println("m2-method");
	}
}
class Ex5 extends Ex4
{
	public void m3(){
		System.out.println("m3-method");
	}
	public static void main(String[] args){
		Ex5 e = new Ex5();
		e.m1();
		e.m2();
		e.m3();
	}
	
}
m1-method
m2-method
m3-method