class Draw
{
	Draw()
	{
		this(10000);
		System.out.println(" Draw()");
	}
	Draw(int a )
	{
		this(100,200);
		System.out.println(" Draw() area of  square "+ (a * a ));
	}
	Draw(int l, int b)
	{
		System.out.println(" Draw() area of Rectanlge "+ (l*b));
	}
}
class  Demo16
{
	public static void main(String args[])
	{
	 	//Draw d1= new Draw();
		//Draw d2= new Draw(10);
		//Draw d3= new Draw(10,20);	
	}	
}