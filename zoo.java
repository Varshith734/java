class zoo
{
	String name="pillikula";
	 int types=45;
	int workers=25;
	int total_animal=256;
	
	static
	{
		System.out.println("...welcome to the zoo..");
	}
	
	public  void wildanimal()
	{
	System.out.println(" no of animals:"+total_animal);
	}
	
	public void zooname()
	{
	System.out.println(" name of zoo:"+name);
	}
	
	public static void zoowork()
	{
 	zoo z=new zoo();
	System.out.println(" no of workers:"+z.workers);
	}
	
	public static void main (String []args)
	{
	zoo z=new zoo();
	
	z.wildanimal();
	z.zooname();
	z.zoowork();
	
	}



	static 
	{
		System.out.println("...**come again**..");
	}
}