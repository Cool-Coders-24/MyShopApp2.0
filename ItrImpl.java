interface Itr
{
	public abstract void m1();
	public abstract void m2();
}
class ItrImpl implements Itr
{
	public void m1(){
		System.out.println("M1-overrdien");
	}
	public void m2(){
		System.out.println("M2-overriden");
	}
	public static void main(String[] args){
		ItrImpl i = new ItrImpl();
		i.m1();
		i.m2();
	}
}
M1-overrdien
M2-overriden