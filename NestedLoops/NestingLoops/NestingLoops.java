//Nested Loops Nesting Loops 20 pts Happy Kan
public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
			System.out.println();
		}

		System.out.println("\n");

	}
}
//1. The variable in the inner loop changes faster
//2. It become ABCDEABCE...; 1111122222...
//3. The output will no longer be in the same line. It will be like CN loop
//4. After the "b" loop is done before continuing "a" loop, it will switch to the next line.