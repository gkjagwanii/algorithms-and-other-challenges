import java.util.Scanner;
public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] ans = new String[n+1];
		for (int i = 0; i <= n; i++)
		{
			ans[i] = Integer.toBinaryString(i);
			int count = 0;
			for (int i1 = 0; i1 < ans[i].length(); i1++)
			{
				if (ans[i].charAt(i1) == '1')
				count++;
			}
			System.out.println(count);
			}
		//completed
		}
	}


