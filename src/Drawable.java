import java.util.LinkedList;
import java.awt.*;

public class Drawable {

	protected LinkedList<Integer> values = new LinkedList<Integer>();

	public void setValue(int v) {
		 this.values.add(v);
	}

	public void draw(Graphics g) {

	}

}
