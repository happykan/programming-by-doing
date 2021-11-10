//Graphics Graphing Parabolas 40 pts Happy Kan
import java.awt.Color;

public class GraphingParabolas
{
	public static void main( String[] args )
	{
		double y;
		double a, h, k;

		GraphPaper gp1 = new GraphPaper(10,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp1.drawPoint(x,y);
		}

		GraphPaper gp2 = new GraphPaper(320,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-4,2) + 5;
			gp2.drawPoint(x,y);
		}

		GraphPaper gp3 = new GraphPaper(630,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 0.5;
			h = 0; k = 0;
			y = a*Math.pow(x+1,2) - 3;
			gp3.drawPoint(x,y);
		}

		GraphPaper gp4 = new GraphPaper(10,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 3;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp4.drawPoint(x,y);
		}

		GraphPaper gp5 = new GraphPaper(320,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 2;
			h = 0; k = 0;
			y = a*Math.pow(x+3,2) + 4;
			gp5.drawPoint(x,y);
		}

		GraphPaper gp6 = new GraphPaper(630,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = -(0.5);
			h = 0; k = 0;
			y = a*Math.pow(x+5,2) + 5;
			gp6.drawPoint(x,y);
		}

	}
}
