import javax.swing.JPanel;
import java.util.Observable;
import java.util.Observer;
import java.awt.*;


public class PlotPanel extends JPanel implements Observer {

	Drawable drawable;

//	public PlotPanel(SimplePlot simple) {
//		this.drawable = drawable;
//	}
//
//	public PlotPanel(MarkedPlot marked) {
//		this.drawable = drawable;
//	}
//
//	public PlotPanel(BarPlot bar) {
//		this.drawable = drawable;
//	}

	public PlotPanel(Drawable drawable){
		this.drawable = drawable;
	}

	public void update(Observable o, Object arg){
		drawable.setValue (((Source)o).getValue());
		repaint();
	}

	public void paintComponent(Graphics g) {
		if (drawable != null){
			drawable.draw(g);
		}
	}

}
