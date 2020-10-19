import java.awt.*;

public class BarPlot extends DecoratedPlot {

	public void draw(Graphics g) {
		final int VAL = 10;

		drawable.draw(g);
		g.setColor(Color.GRAY);

		for (int pt = 0; pt < values.size() - 1;pt++){
			int x = pt * VAL;
			int y = values.get(pt);
			int wdth = VAL;
			int ht = y * VAL;

			g.fillRect( x - 5, y , wdth, ht);
		}
	}

}
