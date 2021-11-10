//Graphics A Clock Face 50-70 pts Happy Kan
import java.awt.*;
import javax.swing.JFrame;
public class ClockFace extends Canvas
{
    public void paint(Graphics g)
    {
        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
            g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
            g.drawString( String.valueOf(Y), 28, Y );
        // lines
        g.setColor(Color.lightGray);
        for ( int X=0; X<800; X += 50 )
            g.drawLine(X,0,X,599);    // horizontal
        for ( int Y=0; Y<600; Y += 50 )
            g.drawLine(0,Y,799,Y);    // vertical

        g.setColor(Color.black);
        g.drawOval(100,100,450,450);
        g.setColor(Color.lightGray);
        g.fillOval(320,320,10,10);
        g.setColor(Color.black);
        g.setFont(new Font("Consolas", Font.BOLD, 20));
        g.drawString("12",315,135);
        g.drawString("3", 515,335);
        g.drawString("6", 315,535);
        g.drawString("9", 115,335);
        g.drawLine(325,320,325,150);
        g.drawLine(325,320,450,320);

    }
    public static void main( String[] args )
	{
		JFrame win = new JFrame("ClockFace");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFace canvas = new ClockFace();
		win.add( canvas );
		win.setVisible(true);
	}
}