package collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Using_Iterator {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Bingo");
		al.add(11);
		al.add(null);

		// System.out.println(al);
		// Fetching data using Iteator cursor
		Iterator itr = al.iterator();// creating iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// fetching data using ListIterator cursor

		ListIterator listItr = al.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr);

		}
	}
}
