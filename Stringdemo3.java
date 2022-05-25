

import java.util.ArrayDequeue;
 class Dequeue
{
    public static void main(String [] args)
    {
        ArrayDequeue al=new ArrayDequeue();
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
	System.out.println("empty :"+al.isEmpty());
	System.out.println("size  :"+al.size());
	System.out.println(" hashcode  :"+al.hashCode());
	al.clear();
	System.out.println(al);
	
	System.out.println(al.contains(10));
    }
}
