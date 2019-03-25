import java.util.Enumeration;
import java.util.Vector;

class Vectorenumeration {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);

		Enumeration<Integer> enumeration = v.elements();

		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

	}

}