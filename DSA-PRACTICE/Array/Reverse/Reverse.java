import java.util.*;

class Reverse{
	public static void main(String args[]){
		int SIZE, temp=0,swap=1;
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		SIZE = sc.nextInt();
		int arr[] =	new int[SIZE];
		System.out.println("Enter Array Elements");
		for(int i=0;i<SIZE;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<SIZE/2;i++){
			temp = arr[i];
			arr[i] = arr[SIZE-swap];
			arr[SIZE-swap] = temp;
			swap++;
		}
		for(int i=0;i<SIZE;i++){
			System.out.print(arr[i] + " ");
		}
	}
}