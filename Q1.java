import java.util.Scanner;

public class Q1 {
	
	public static int handshake(int num)
	{
		if (num < 2)
			return num - 1;
		else
			return num - 1 + handshake(num - 1);
	}
	
	
	public static void main(String[] args) {
		int j;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number people in room: ");
		j=input.nextInt();
		for (int i = 1; i <= j; i++)
			System.out.println("handshake("+i+")="+handshake(i));
	}

}
