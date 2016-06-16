import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.fastinfoset.stax.events.CharactersEvent;

/*
 * Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.

Examples:

Input: 
set[] = {'a', 'b'}, k = 3

Output:
aaa
aab
aba
abb
baa
bab
bba
bbb


Input: 
set[] = {'a', 'b', 'c', 'd'}, k = 1
Output:
a
b
c
d

the total combination is n^k
 */
public class NToThePowerOfK {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args){
		
		char[] set =  {'a', 'b', 'c','d'};
		int k=2;
		
		printAll(set,k);
	}
	
	public static void printAll(char[] set, int k){
		
		printAllRecursiveNoRepeat(set,"",k);
		for(String s: list)
			System.out.println(s);
	}
	
	
	/*
	 * this allows repeat: aaa, aab
	 * n is the number of choices
	 */
	public static void printAllRecursive(char[] set, String prefix, int k){
		
		if(k==0){
			//System.out.println(prefix);
			list.add(prefix);
			return;
		}
		
		int n = set.length;
		//System.out.println("passin: "+prefix);
		for(int i=0;i<n;i++){
			String newPrefix = prefix+set[i];
			//System.out.println("generate: "+prefix+", while k= "+k);
			printAllRecursive(set,newPrefix,k-1);
		}
	}
	
	/*
	 * if does not allow repeat, then n >=k, i.e., no aab, or abb, only abc, cba, cab,...
	 */
	public static void printAllRecursiveNoRepeat(char[] set, String prefix,int k){
		
		if(k==0){
			//System.out.println(prefix);
			list.add(prefix);
			return;
		}
		
		int n = set.length;
		//System.out.println("passin: "+prefix);
		for(int i=0;i<n;i++){
			if(prefix.contains(String.valueOf(set[i]))) continue;
			String newPrefix = prefix+set[i];
			//System.out.println("generate: "+prefix+", while k= "+k);
			
			printAllRecursiveNoRepeat(set,newPrefix,k-1);
		}
	}
}
