class airportdrivers
{
	public static void main(String [] args)
	{
		airport a=new airport("mangalore","black",123,new aeroplane("white","king",34));
		a.airportdetails();
		a.aeroplanedetails();
	}
}