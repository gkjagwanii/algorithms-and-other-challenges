import java.util.Scanner;
public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println(reduce(s));
	}
	
	static String reduce(String s) {
		char[] string = s.toCharArray();
		for (int i = 0; i < string.length-1;i++)
		{
			if(string[i] == string[i+1])
			{
				string[i] = 0;
				string[i+1] = 0;
			}
		}
		return toString(string);
	}

	private static String toString(char[] string) {
		// TODO Auto-generated method stub
	
		String str = new String(string);
		
		return str;
	}

}
