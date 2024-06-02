
public class Main {

	public static void main(String[] args) {
		Controller c = new Controller();
		Robot r = new Robot ();
		Supervizor s = new Supervizor();
		c.r = r;
		r.c = c;
		c.s = s;
		s.controller = c;
		c.start();
		r.start();
		s.start();
	}
}
