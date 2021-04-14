import java.util.*;
class Kth_MN{
	void input(int arr[],int size){
		
		
	}
	void sort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		show(arr);
	}
	void show(int arr[]){
		int max_pos = 0, min_pos = 0;
		System.out.println("Complete Array...");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nPosition Must Be In Between 0 To "+ arr.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Position To Get Kth Max Value..");
		max_pos = sc.nextInt();
		System.out.println("Enter The Position To Get Kth Min Value..");
		min_pos = sc.nextInt();
		System.out.println(arr[max_pos-1] + " "+arr[arr.length-min_pos]);
	}
	public static void main(String[] args){
		int size = 0;
		Kth_MN obj = new Kth_MN();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter Element In Array");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		obj.sort(arr);
	}
}