import java.util.*;

class Rotate90{
	public static void main(String [] args){
		int row,col;
		row = col = 3;
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
		System.out.println();
		for(int j=0;j<col;j++){
			for(int i=row-1;i>-1;i--){
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
	}
}