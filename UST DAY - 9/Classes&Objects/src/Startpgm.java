
public class Startpgm {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4,5},
				        {16,17,18,19,6},
				        {15,24,25,20,7},
		         		{14,25,22,21,8},
			        	{13,12,11,10,9}};
		
		int row = 0;
		int col = 0;
		int rowend = arr.length;
		int colend = arr[0].length;
		while(col<colend && row<rowend) {
			for(int i=col;i<colend;i++) 
				System.out.print(arr[row][i] + " ");
			row++;
			for(int j=row; j<rowend; j++ )
				System.out.print(arr[j][colend-1] + " ");
			colend--;
			for(int k=colend-1;k>=col;k--)
				System.out.print(arr[rowend-1][k] + " ");
			rowend--;
			for(int l=rowend-1;l>=row;l--)
				System.out.print(arr[l][col] + " ");
			col++;
		}
	}
}
