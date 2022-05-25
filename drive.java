class drive
{
	public static void main(String[] args)
	{
		greenapple g=new greenapple();
		apple a=new apple();
		mango b=new mango();
		fruit f=new fruit();
		System.out.println("**********----------greenapple----*****");
		System.out.println(g instanceof greenapple);
		System.out.println(g instanceof apple);
		System.out.println(g instanceof fruit);
		//System.out.println(g instanceof mango);
		
		
		System.out.println("*********------apple----*****");
		System.out.println(a instanceof greenapple);
		System.out.println(a instanceof apple);
		System.out.println(a instanceof fruit);
		//System.out.println(a instanceof mango);
		
		System.out.println("*********------mango----*****");
		//System.out.println(b instanceof greenapple);
		//System.out.println(b instanceof apple);
		System.out.println(b instanceof fruit);
		System.out.println(b instanceof mango);
	
		System.out.println("*********------fruit----*****");
		System.out.println(f instanceof greenapple);
		System.out.println(f instanceof apple);
		System.out.println(f instanceof fruit);
		System.out.println(f instanceof mango);
	
	}
		

}