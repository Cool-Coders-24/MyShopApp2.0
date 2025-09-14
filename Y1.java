interface X1
{
	public static void m1(){
		System.out.println("hii");
	}
	public static void m2(){
		System.out.println("hlo");
	}
}
class  Y1 implements X1
{
	public static void main(String[] args) 
	{
		X1.m1();
		X1.m2();
	}
}

hii
hlo