import java.util.Observable;

public class Source extends Observable {

	private int value;

	public void create() {
		value = (int)((Math.random()*250));

	}

	public int getValue() {
		return 0;
	}

}
