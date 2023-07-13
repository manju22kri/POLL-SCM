package Java_interview;

public class Reverse_Stringonly {

	//reverse each string in string reverse order


	public static void main(String[] args) {

		String s[] = "Java is a platform independent".split(" ");
		String reverse = "";


		for (int i = s.length-1; i >= 0; i--) {

			reverse +=  s[i]+" ";

		}
		System.out.println("reverse of string =" +reverse);
	}




}
