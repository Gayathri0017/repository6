import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Add{
	public static void main(String args[]) {
		try {
			File file=new File("input.txt");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int odd=0;
			int even=0;
			for(int i=0;i<n;i++) {
				if(arr[i]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
			System.out.println("Odd: "+odd);
			System.out.println("Even: "+even);
	}
	catch(Exception e){
		System.out.println("File not found");
	}
	}
}
