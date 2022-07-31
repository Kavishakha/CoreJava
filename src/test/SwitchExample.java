package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World";
		str = str.toLowerCase();
		int count=0;

		for (int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			switch(ch) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
			
		}
		
		System.out.println("The count of vowel is " + count);
	}

}
