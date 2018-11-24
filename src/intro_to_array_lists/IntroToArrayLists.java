package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stringz = new ArrayList<String>();
		// 2. Add five Strings to your list
		stringz.add("Vines");
		stringz.add("Memes");
		stringz.add("Oof");
		stringz.add("Fortnite");
		stringz.add("ddd");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringz.size(); i++) {
			String s = stringz.get(i);
			System.out.println(s);
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : stringz) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < stringz.size(); i++) {
			String s = stringz.get(i);
			if (i % 2 == 0) {
				System.out.println(s);
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = stringz.size() - 1; i >= 0; i--) {
			String s = stringz.get(i);
			System.out.println(s);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < stringz.size(); i++) {
			String s = stringz.get(i);
			if (s.indexOf('e')>-1) {
				System.out.println(s);
			}
		}
	}
}
