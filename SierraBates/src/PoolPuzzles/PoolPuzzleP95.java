package PoolPuzzles;

class PoolPuzzleP95
{
	double area;
	int height, length;
	public static void main (String[] argums)
	{
		int x = 0;
		PoolPuzzleP95 [] ta = new PoolPuzzleP95[4];
		
		while(x < 4)
		{
			ta[x] = new PoolPuzzleP95();
			ta[x].height = (x+1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			
			System.out.print("треугольник" + x + ", площадь = ");
		System.out.println(ta[x].area);
		
		x = x + 1;
		}
		int y = x;
		x = 27;
		PoolPuzzleP95 t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", площадь t5 = " + t5.area);
	}
	
	void setArea()
	{
		area = (height * length) / 2;
	}
}
