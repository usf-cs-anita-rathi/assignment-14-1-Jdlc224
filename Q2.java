
public class Q2 {
	
	public static void main(String args[]) 
	{
		int[] board = { 0, 3, 80, 6, 57, 10 };
		int intial = 0;
		intial = cheapestCost(board, 0, intial);
		System.out.print("The board: ");
		for (int i = 0; i < board.length; i++)
			System.out.print(board[i] + " ");
		System.out.println();
		System.out.println("Total cost for shortest path: " + intial);
	}
	
	public static int cheapestCost(int[] board, int a, int b)
	{
		b += board[a];
		if (a == board.length - 1)
			return b;
		
		else if (a == board.length - 2)	
			return cheapestCost(board, a + 1, b);
		
		else {
			int path1 = cheapestCost(board, a + 1, b);
			int path2 = cheapestCost(board, a + 2, b);
			return Math.min(path1, path2);
		}
	}

}
