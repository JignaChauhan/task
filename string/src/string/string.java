package string;

public class string {

	public static void main(String[] args) {
		String name="jigna";
		String txt="JignaChauhan Hello java";
		System.out.println("The Lenght of the txt string is:"+ txt.length());
		System.out.println(name);
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());//Outputs "hello world"
		//indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

		System.out.println(txt.indexOf("java")); // Outputs 
		//String concating 
		String firstname="jigna";
		String lastname="Chauhan";
		System.out.println(firstname+""+lastname);
		System.out.println(firstname.concat(lastname));
		String txt1 = "We\'are \\excited for \"java\"learning.";
		System.out.println(txt1);


		

	

	}

}
