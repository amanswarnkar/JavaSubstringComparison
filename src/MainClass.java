import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("aman");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();
		
		System.out.println(getSmallestAndLargest(s,k));
	}

	private static List<String> getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		List<String> stringList = new ArrayList<>();
		for(int i=0; i<(s.length()-k); i++) {
			stringList.add(s.substring(i, i+k));
		}
		
		return stringList;
	}

}
