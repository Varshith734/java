import java.util.Scanner;
class Shopping
{
	int belt;
	int shoe;
	int dress;
	
	 Shopping(int belt)
	{
		this.belt=belt;
	}
	Shopping(int belt,int shoe)
	{
		this(belt);
		this.shoe=shoe;
	}
	Shopping(int belt,int shoe,int dress)
	{
		this(belt,shoe);
		this.dress=dress;
	}
}

class Flipkart extends  Shopping
{
	Flipkart(int belt,int shoe,int dress){
	super(belt,shoe,dress);
	}
	public void getbelt()
	{
		System.out.println(belt);
	}
	public void getshoe()
	{
		System.out.println(shoe);
	}
	public void getdress()
	{
		System.out.println(dress);
	}
	public void getShoppingdetails()
	{
	System.out.println(belt);
	System.out.println(shoe);
	System.out.println(dress);
	}
}

class Myntra extends  Shopping
{
	Myntra(int belt,int shoe,int dress){
	super(belt,shoe,dress);
	}
	public void getbelt()
	{
		System.out.println(belt);
	}
	public void getshoe()
	{
		System.out.println(shoe);
	}
	public void getdress()
	{
		System.out.println(dress);
	}
	public void getShoppingdetails()
	{
	System.out.println(belt);
	System.out.println(shoe);
	System.out.println(dress);
	}

}
class Amazon extends  Shopping
{
	Amazon(int belt,int shoe,int dress){
	super(belt,shoe,dress);
	}
	public void getbelt()
	{
		System.out.println(belt);
	}
	public void getshoe()
	{
		System.out.println(shoe);
	}
	public void getdress()
	{
		System.out.println(dress);
	}
	public void getShoppingdetails()
	{
	System.out.println(belt);
	System.out.println(shoe);
	System.out.println(dress);
	}
}



class Google
{
	Shopping b;
	Scanner s=new Scanner(System.in);
	public void addorder()
	{
		System.out.println("enter the item u want order");
		System.out.println("1.Flipkart\n 2.Myntra\n3.Amazon");
		int ch=s.nextInt();
		if(ch==1)
		{
			this.b=new Flipkart(1,1,1);
			System.out.println("Flipkart is orderd");
		
		}
		else if(ch==2)
		{
			this.b=new Myntra(2,2,2);
			System.out.println("Myntra is orderd");
		}
		 else
		{
			this.b=new Amazon(3,3,3);
			System.out.println("Amazon is orderd");
		}
		
	}
	
	public void shoppingdetails()
	{
		if(b instanceof Flipkart )
		{
			Flipkart f=(Flipkart)b;
			f.getShoppingdetails();
		}
		else if(b instanceof Myntra)
		{
			Myntra m=(Myntra)b;
			m.getShoppingdetails();
		}
		else
		{
			Amazon a=(Amazon)b;
			a.getShoppingdetails();
		}
	}
	public void removeorder()
	{
		if(b instanceof Flipkart)
		{
			this.b=null;
			System.out.println("Flipkart is removed");
		}
		else if(b instanceof Myntra)
		{
			this.b=null;
			System.out.println("Myntra is removed");
		}
		else
		{
			this.b=null;
			System.out.println("Amazon is removed");
		}
	}
}



class Googledrives
{
	public static void main(String[] args)
	{
	Google g=new Google();
	Scanner s=new Scanner(System.in);
	while(true)
	{
	System.out.println("1.addorder\n2.shoppingdetails\n3.removeorder\n4.exit");
	System.out.println("enter your choice");
	int ch=s.nextInt();
	switch(ch)
	{
		case 1:g.addorder();
			break;
		case 2:g.shoppingdetails();
			break;
		case 3:g.removeorder();
			break;
		case 4:System.exit(0);
		default:System.out.println("invalid choice");
	}
	}
	}
}