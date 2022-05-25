

import java.util.ArrayList;
 class Stringdemo1
{
    public static void main(String [] args)
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(true);
        al.add(10.0);
        al.add('c');
        al.add("chandan");
        System.out.println(al);


	al.remove(2);
	al.remove(3);
	System.out.println(al);
	System.out.println(al.clone());
	al.clear();
	System.out.println(al);
	
	System.out.println(al.contains(10));
    }
}
