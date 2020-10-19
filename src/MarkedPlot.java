import java.awt.*;
public class MarkedPlot extends DecoratedPlot {

	public void draw(Graphics g) {
		drawable.draw(g);

		for (int pt = 0; pt<(values.size()-1); pt++){
			int x = pt *10;
			int y = values.get(pt)*10;
			int wdth = 10;
			int ht = 10;
			g.fillRect(x,y,wdth,ht);
		}
	}

}
