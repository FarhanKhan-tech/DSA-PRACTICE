import java.util.*;

class Occurrence{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word To Count Occurrences Of Each Character In The Word");
		String word = sc.next();
		int c=0;
			boolean temp = true; 
			char[] duplicate =new char[word.length()];
			char[] charword = word.toCharArray();
			for(int i=0;i<charword.length;i++)
			{
				duplicate[i] = charword[i];
				for(int k=0;k<i;k++){
					if(charword[i]==duplicate[k]){
						temp = false;
					}
				}
				if(temp){
					for(int j=i; j<charword.length;j++){
						if(charword[i]==charword[j])
						{
							c++;
						}
					}
					System.out.println(charword[i]+ " Occurred  " + c + " Times.");
					c=0;	
				}
				temp =true;
			}
	}
}