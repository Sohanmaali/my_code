class Box 
{
	private  double width;
	private  double height;
	private  double depth;

	Box()
	{
		this.width = 0;
		this.height = 0;
		this.depth = 0;
	}
	Box(double w,  double h,  double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	double  volume() 
	{
		return width * height * depth;
	}
}

class  BoxWeight  extends  Box
{
	double weight;
	BoxWeight() 
	{
		weight = 0;
	}
	BoxWeight(double w,  double h,  double d,  double m) 
	{
		super(w, h, d);
		weight = m;
	}
}

class  Shipment  extends  BoxWeight
{
	double cost;

	Shipment() 
	{
		this.cost = 0;
	}
	Shipment(double w,  double h,  double d,  double m,  double c) 
	{
		super(w, h, d, m); 
		cost = c;
	}
}

class  TestMultilevel
{
   public  static  void  main(String args[])
   {
       Shipment shipment1 =  new Shipment(1,  2,  3,  5,  3.41);

       double vol;
       vol = shipment1.volume();

       System.out.println("The volume of shipment1 is " + vol);
       System.out.println("The weight of shipment1 is " + shipment1.weight);
       System.out.println("Shipping cost: Rs." + shipment1.cost);
       System.out.println();
   }
}