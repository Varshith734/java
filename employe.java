class employe
{	
	String name;
	int id;
	String dep;
	String address;
	employe(String name){
		this.name=name;
	}

	employe(String name,int id){
		this(name);
		this.id=id;
	}
	employe(String name,int id,String dep){
		this(name,id);
		this.dep=dep;
	}
	employe(String name,int id,String dep,String address){
		this(name,id,dep);
		this.address=address;
	}
	public void display()
	{
	System.out.println("name :"+name);
	System.out.println("id :"+id);
	System.out.println("dep :"+dep);
	System.out.println("address :"+address);
	}
	
	
	public static void main(String [] args)
{
	System.out.println("program started");
	employe s=new employe("bjorn");
	s.display();
	System.out.println("************************************************");
	employe s1=new employe("bjorn",34);
	s1.display();
	System.out.println("************************************************");
	employe s2=new employe("bjorn",34,"ise");
	s2.display();
	System.out.println("************************************************");
	employe s3=new employe("bjorn",45,"ise","mijar");
	s3.display();
	System.out.println("************************************************");
	System.out.println("program ended");
}
}