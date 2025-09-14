interface Itr2
{
	public abstract void m1();
	public abstract void m2();
}
abstract class ItrImpl2 implements Itr2
{
	public void m1(){
		System.out.println("M1-overrdien");
	}
	
}
class ItrImpl3 extends ItrImpl2
{
	public void m2(){
		System.out.println("M2-overrdien");
	}
	public static void main(String[] args){
		ItrImpl3 i = new ItrImpl3();
	}
}
