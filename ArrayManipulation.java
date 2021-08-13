import java.util.*;
public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt() + 1;
		int array[] = new int[n];
		for (int i = 0; i<n; i++) {
			array[i] = 0;
		}
		int m = input.nextInt();
		for (int i = 0; i<m; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int k = input.nextInt();
			for(int i1 = a; i1<=b; i1++)
			{
				array[i1] = array[i1] + k;
			}
		}
		input.close();
		
		int maximum = array[0];
		for(int i = 1; i<array.length; i++)
			if (array[i] > maximum)
				maximum = array[i];
		
		System.out.println(maximum);
		//This works but it is too slow. We are accessing the array 3 times which is not good.
	}
}
