// UVA 11701 Cantor

import java.util.*;
import java.io.*;

public class Cantor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int x = 10000000;
		int[] arr = new int[x+1];
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i <= x; i++){
			arr[i] = 1;
			if (i * 3 < (2 * x) && i * 3 > x) q.add(i);
		}
	
		while(!q.isEmpty()){
			n = q.poll();
			if (arr[n] == 1){
				arr[n] = 0;
				if (n % 3 == 0) q.add(n/3);
				if ((n+x) % 3 == 0) q.add((n+x)/3);
				if ((2*x+n) %3 == 0) q.add((2*x+n)/3);
			}
		}
		while(true){
			String next = scan.next();
			if (next.equals("END")) break;
			else{
				double num = Double.parseDouble(next);
				int index = (int)(num*x);
				if (arr[index] == 1) System.out.println("MEMBER");
				else{
					System.out.println("NON-MEMBER");
				}
			}
		}
	}
}