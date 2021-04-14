import java.util.*;
class Max_Min{
	public static void main(String[] args)
	{
		int max, min;
		int[] arr = {4,3,5,-2,1};
		max = min = arr[0];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
			else if(min>arr[i]){
				min = arr[i];
			}
			
		}
		System.out.println(max+ " "+min);
	}
}