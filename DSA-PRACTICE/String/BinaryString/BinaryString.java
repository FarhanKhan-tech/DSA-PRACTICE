import java.util.*;
class BinaryString{
	public static void main(String []args){
		String bool = new String("010101");
		int len = bool.length(),i=0,j=0,k=0;
		char []zero = new char[len];
		char []ones = new char[len]; 
		char[] bol_val = bool.toCharArray();
		for(;k<bol_val.length;k++){
			if(bol_val[k]=='0'){
				zero[i] = bol_val[k];
				i++;
			}
			else{
				ones[j] = bol_val[k];
				j++;
			}
		}
		for( i=0;i<zero.length;i++){
			System.out.print(zero[i]+" ");
		}
		for( j=0;j<ones.length;j++){
			System.out.print(ones[j]+" ");
		}
	}
}