import java.util.Scanner;
class Ball
{
	double radius;
	Ball(double radius)
	{
		this.radius=radius;
	}
}

class Basketball extends Ball
{
	Basketball(double radius){
	super(radius);
	}
	public void getradius()
	{
		System.out.println(radius);
	}
}

class tennisball extends Ball
{
	tennisball(double radius)
	{
	super(radius);
	}
	public void getradius()
	{
		System.out.println(radius);
	}
}

class Bag
{
	Ball b;
	Scanner s=new Scanner(System.in);
	public void addBall()
	{
		System.out.println("enter the you want to play");
		System.out.println("1.basket ball\n 2.tennis ball");
		int ch=s.nextInt();
		if(ch==1)
		{
			this.b=new Basketball(10.0);
			System.out.println("basketball is added");
		
		}
		else
		{
			this.b=new tennisball(5.0);
			System.out.println("tennisball is added");
		}
		
	}
	public void isBagempty()
	{
		if(this.b==null)
		{
			System.out.println("bag is empty");
		}
		else
		{
			System.out.println("bag is full");
		}
	}
	public void getradius()
	{
		if(b instanceof Basketball)
		{
			Basketball c=(Basketball)b;
			c.getradius();
		}
		else
		{
			tennisball t=(tennisball)b;
			t.getradius();
		}
	}
	public void removeBal()
	{
		if(b instanceof Basketball)
		{
			this.b=null;
			System.out.println("basketball is removed");
		}
		else
		{
			this.b=null;
			System.out.println("tennisball is removed");
		}	
	}
}



class Bagdrive
{
	public static void main(String[] args)
	{
	Bag a=new Bag();
	Scanner s=new Scanner(System.in);
	while(true)
	{
	System.out.println("1.addBall\n2.isBagempty\n3.getradius\n4.removeBal\n4.exit");
	System.out.println("enter your choice");
	int ch=s.nextInt();
	switch(ch)
	{
		case 1:a.addBall();
			break;
		case 2:a.isBagempty();
			break;
		case 3:a.getradius();
			break;
		case 4:a.removeBal();
			break;
		case 5:System.exit(0);
		default:System.out.println("invalid choice");
	}
	}
	}
}