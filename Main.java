import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive integer");
		int N = sc.nextInt();
		printRandom3(N);


  }

  // write your methods here
}

public static void printRandom3(int num)
	{
		int m = n + 1;

    System.out.println( (int) ((Math.random() * m) + 2) );
    System.out.println( (int) ((Math.random() * m) + 2) );
    System.out.println( (int) ((Math.random() * m) + 2) );
	}