//equal...............


class Employe5
{
	
	String name;
	
	Employe5(String name)
	{
		
		this.name=name;
		
	}
	
	public boolean equals(Object o)
	{
		Employe5 e=(Employe5)o;
		if(this.name==e.name)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		Employe5 e=new Employe5("chandan");
		Employe5 e1=new Employe5("yash");
		Employe5 e2=new Employe5("chandan");
		Employe5 e3=new Employe5("jiga");
		Employe5 e4=new Employe5("jiga");
		
		System.out.println(e==e1);
		System.out.println(e.equals(e1));
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e==e2);
		System.out.println(e.equals(e2));
		System.out.println(e3==e4);
		System.out.println(e3.equals(e4));
		
	}
}