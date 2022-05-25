


import java.util.Scanner;

class shopping{
double belt;
double shoe;
double dress;
shopping(double belt,double shoe,double dress)
{
this.belt=belt;
this.shoe=shoe;
this.dress=dress;
}
}

class flipkart extends shopping{
flipkart(double belt,double shoe,double dress)
{
super(belt,shoe,dress);
}
public void getshoppingdetails()
{
System.out.println(belt);
System.out.println(shoe);
System.out.println(dress);
}
}

class myntra extends shopping{
myntra(double belt,double shoe,double dress)
{
super(belt,shoe,dress);
}
public void getshoppingdetails()
{
System.out.println(belt);
System.out.println(shoe);
System.out.println(dress);
}
}

class amazon extends shopping{
amazon(double belt,double shoe,double dress)
{
super(belt,shoe,dress);
}
public void getshoppingdetails()
{
System.out.println(belt);
System.out.println(shoe);
System.out.println(dress);
}
}

class google
{
shopping s;
Scanner ss=new Scanner(System.in);
public void addOrder()
{
System.out.println("Enter the Shopping websites");
System.out.println("1.Flipkart\n2.Myntra\n3.Amazon");
int choice=ss.nextInt();
if(choice==1)
{
this.s=new flipkart(100,1000,500);
System.out.println("Flipkart updated");
}
else if(choice==2)
{
this.s=new myntra(50,500,100);
System.out.println("Myntra updated");

}
else
{
this.s=new amazon(200,750,800);
System.out.println("Flipkart updated");
}
}

public void shoppingdetail()
{
if(s instanceof flipkart)
{
flipkart f=(flipkart)s;
f.getshoppingdetails();
}

if(s instanceof myntra)
{
myntra m=(myntra)s;
m.getshoppingdetails();
}

if(s instanceof amazon)
{
amazon a=(amazon)s;
a.getshoppingdetails();
}

}

public void cancelorder()
{
if(s instanceof flipkart)
{
this.s=null;
System.out.println("flipkart order is cancelled");
}
else if(s instanceof myntra)
{
this.s=null;
System.out.println("myntra order is cancelled");
}
else
{
this.s=null;
System.out.println("amazon order is cancelled");
}
}

public void getshopdetail()
{
if(s instanceof flipkart)
{
flipkart f=(flipkart)s;
f.getshoppingdetails();
}
else if(s instanceof myntra)
{
myntra m=(myntra)s;
m.getshoppingdetails();
}
else
{
myntra m=(myntra)s;
m.getshoppingdetails();
}
}

}

class googledriver
{
public static void main(String[] args)
{
google g=new google();
Scanner s=new Scanner(System.in);
boolean exit=true;
while(exit)
{
System.out.println("Choose the option");
System.out.println("1.add order\n2.Show shopping details\n3.Cancel \n4.getShopdetails\n5.Exit");
int choice=s.nextInt();
switch(choice)
{
case 1:g.addOrder();
break;
case 2:g.shoppingdetail();
break;
case 3:g.cancelorder();
break;
case 4:g.getshopdetail();
break;
case 5:exit=false;
break;
default:System.out.println("Choose the correct option");

}
}
}
}

