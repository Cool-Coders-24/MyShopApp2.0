abstract class Ex1
{
	public void m1(){
		System.out.println("Hey welcome to class");
	}
	abstract void m2();
	abstract void m3();
}
class Ex2 extends Ex1
{
	public void m2(){
		System.out.println("this is m2 method");
	}
	public void m3(){
		System.out.println("this is m3 method");
	}
	public static void main(String[] args){
		Ex2 e = new Ex2();
		e.m1();
		e.m2();
		e.m3();
	}
}
Hey welcome to class
this is m2 method
this is m3 method