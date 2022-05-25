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
	public double getradius()
	{
		return radius;
	}
}

class tennisball extends Ball
{
	public double getradius()
	super(radius);
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
		is(ch==1)
		{
			this.b=new basketball(10,0);
			System.out.println("basketball is added");
		
		}
		else
		{
			this.b=new tennisball(5,0);
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

import java.util.Scanner;

class Bagdrive
{
	public static void main(String[] args)
	{
	Bag g=new Bag();
	Scanner s=new Scanner(System.in);
	while(true)
	{
	System.out.println("1.addBall\n2.isBagempty\n3.getradius\n4.removeBal\n4.exist");
	System.out.println("enter your choice");
	int ch=s.nextInt();
	switch(ch)
	{
		case 1:b.addBall();
			break;
		case 2:b.isBagempty();
			break;
		case 3:b.getradius()();
			break;
		case 4:b.removeBal();
			break;
		case 5:System.exist(0);
		default:System.out.println("invalid choice");
	}
	}
	}
}