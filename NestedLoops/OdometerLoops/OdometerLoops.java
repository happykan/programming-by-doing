//Nested Loops Odometer Loops 25 pts Happy Kan
public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
		for ( int thous=0; thous<8; thous++ )
		{
			for ( int hund=0; hund<8; hund++ )
			{
				for ( int tens=0; tens<8; tens++ )
				{
					for ( int ones=0; ones<8; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(8);
					}
				}
			}
		}

		System.out.println();
	}
}
//1. It doesn't work
//2. 
