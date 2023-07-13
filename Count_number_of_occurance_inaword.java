package Java_interview;

public class Count_number_of_occurance_inaword {

	static int countoccurances (String str, String word)
	{


		String a[] = str.split(" ");
		int count = 0;
		for(int i = 0; i<a.length; i++){
			if (word.equals(a[i]))
				count ++;
		}
		return count;

	}
	public static void main(String[] args) {
		String str = "hello world ! hello world 	!";
		String word = "hello";
		String word1 = "world";
		System.out.println("hello: " + countoccurances(str, word));
		System.out.println("world: " + countoccurances(str, word1));

	}
}
