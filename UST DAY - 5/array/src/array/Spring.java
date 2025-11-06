package array;

public class Spring {
	public static void main(String[] args) {
		int [][]c = {{1,2,3,4,5},
				{16,17,18,19,6},
				{15,24,25,20,7},
				{14,23,22,21,8},
				{13,12,11,10,9}};
		int row=0;
		int rowend = c.length;
		int col=0;
		int colend = c[0].length;
		while(row<rowend  && col < colend) {
			for(int i=col;i<colend;i++) 
				System.out.println(c[row][i]);
			row++;
			for(int j=row;j<rowend;j++)
				System.out.println(c[j][colend-1]);
			colend--;
			for(int k=colend-1; k>=col; k--)
				System.out.println(c[rowend-1][k]);
			rowend --;
			for(int l=rowend-1;l>row;l++)
				System.out.println(c[l][col]);
				col++;
		}
	}
}
