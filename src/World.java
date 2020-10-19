import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.FlowLayout;

public class World extends JFrame implements ActionListener {
	Source source = new Source();
	public World() {
		SimplePlot simple = new SimplePlot();
		MarkedPlot marked = new MarkedPlot();
		BarPlot bar = new BarPlot();
		marked.add(simple);
		bar.add(marked);

		PlotPanel p1 = new PlotPanel(simple);
		PlotPanel p2 = new PlotPanel(marked);
		PlotPanel p3 = new PlotPanel(bar);



		add(p1);
		add(p2);
		add(p3);



		JFrame frame = new JFrame("Random Number Generator");
		JPanel panel = new JPanel();
		frame.getContentPane();
		JButton button = new JButton("Button");
		Dimension size = button.getPreferredSize();
		button.setBounds(0, 900, 490, 60);
		panel.setLayout(null);
		panel.add(button);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(500, 1000);
		frame.setVisible(true);
		button.addActionListener(this);

		source.addObserver(p1);
		source.addObserver(p2);
		source.addObserver(p3);

	}

	public static void main(String[] args) {
		World world = new World();
	}

	public void actionPerformed(ActionEvent e) {
		source.create();

		System.out.println("Clicked");
	}

}
