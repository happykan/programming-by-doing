//Records Web Adresses 30 pts Happy Kan
import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://programmingbydoing.com/a/examples/fake-addresses.txt");
		Scanner fin = new Scanner( addys.openStream() );

		Address uno = new Address();
		uno.street = fin.nextLine();
		uno.city   = fin.nextLine();
		uno.state  = fin.next();
		uno.zip    = fin.nextInt();
		fin.skip("\n");

		Address dos = new Address();
		dos.street = fin.nextLine();
		dos.city   = fin.nextLine();
		dos.state  = fin.next();
		dos.zip    = fin.nextInt();
		fin.skip("\n");

		Address tre = new Address();
		tre.street = fin.nextLine();
		tre.city   = fin.nextLine();
		tre.state  = fin.next();
		tre.zip    = fin.nextInt();
		fin.skip("\n");

        Address forth = new Address();
        forth.street = fin.nextLine();
        forth.city = fin.nextLine();
        forth.state = fin.next();
        forth.zip = fin.nextInt();
        fin.skip("\n");

        Address fifth = new Address();
        fifth.street = fin.nextLine();
        fifth.city = fin.nextLine();
        fifth.state = fin.next();
        fifth.zip = fin.nextInt();
        fin.skip("\n");

        Address sixth = new Address();
        sixth.street = fin.nextLine();
        sixth.city = fin.nextLine();
        sixth.state = fin.next();
        sixth.zip = fin.nextInt();
        fin.skip("\n");
		
		fin.close();
		
		System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
        System.out.println(tre.street + ", " + forth.city + ", " + forth.state + "  " + forth.zip);
        System.out.println(tre.street + ", " + fifth.city + ", " + fifth.state + "  " + fifth.zip);
        System.out.println(tre.street + ", " + sixth.city + ", " + sixth.state + "  " + sixth.zip);
	}
}
