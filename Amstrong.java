import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Amstrong{
	    public static void main(String[] args) {
	    try{
	    File file=new File("input.txt");
	    Scanner sc=new Scanner(System.in);
	    int number,originalNumber, remainder, result = 0;
	    number=sc.nextInt();
	    originalNumber = number;
	    while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }catch(Exception e){
		System.out.println("error");
	    }
	    }
	}
