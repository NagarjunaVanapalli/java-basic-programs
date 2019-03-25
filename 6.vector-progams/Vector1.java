import java.util.*;

class Vector1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();

		al.add("sixth");
		al.add("seventh");

		Vector v = new Vector();

		v.add("first");
		v.add("sec");
		v.add("third");
		v.add("fourth");
		v.add("first");
		v.add("fifth");
		v.add("first");

		v.addAll(al);

		v.set(1, "second");// Replace the element at specified index

		System.out.println(v.contains("first"));// searching an element.
		System.out.println(v);
		v.remove(2);// remove specify index
		v.remove("fifth");
		System.out.println(v);

		System.out.println(v.size());// get size

		System.out.println(v.subList(1, 4));// Sublist

		Vector<String> v1 = new Vector<String>(v);// copy

		System.out.println(v1);

		Collections.swap(v, 1, 3);// swaping

		System.out.println(v);

		Collections.replaceAll(v, "first", "one");// replaces the same occurance

		System.out.println(v.capacity());

		System.out.println(v);

		Collections.sort(v);// ascending order

		System.out.println(v);

		Comparator cc = Collections.reverseOrder();// descending order

		Collections.sort(v, cc);

		System.out.println(v);

		String a[] = new String[v1.size()];

		a = v1.toArray(a);

		for (String s : a)
			System.out.println(s);
	}

}