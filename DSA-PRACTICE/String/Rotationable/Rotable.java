import java.util.*;
class Rotable{
	public static void main(String[] args){
		boolean flag = false;
		int index = 0;
		String [] arr = {"ABCD","ABDC"};
		char [] str1 = arr[0].toCharArray();
		char [] str2 = arr[1].toCharArray();
		char [] res = new char[str1.length];
		if(str1.length != str2.length){
			System.out.print(arr[0] + " Is Nottt Rotable To String "+arr[1]);
		}
		else{
			for(int j=0;j<str2.length;j++){
				if(str1[0]==str2[j]){
						index = j;
						flag = true;
				}
			}
			for(int j=0;j<str1.length;j++){
				if(str1[j]!=str2[(index+j)%4]){
					flag = false;
					System.out.println(flag);
				}
			}
		}
		if(flag)
			System.out.print(arr[0] + " Is Rotable To String "+arr[1]);
		else
			System.out.print(arr[0] + " Is Not Rotable To String "+arr[1]);
			
	}
}
