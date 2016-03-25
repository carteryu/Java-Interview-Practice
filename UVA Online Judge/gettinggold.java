/* 11561 - Getting Gold */


import java.util.*;
import java.io.*;
public class GettingGold {
	static int gp = 0;
	static char[][] graph;
	static boolean[][] visited;

	public static void main(String[] args){	
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()){
			gp = 0;
			int row = scan.nextInt();
			int col = scan.nextInt();
			int startx = 0;
			int starty = 0;
			graph = new char[col][row];
			visited = new boolean[col][row];
			for (int i = 0; i < col; i++){
				String l = scan.next();
				for (int j = 0; j < row; j++){
					if(l.length() > 0){
						graph[i][j] = l.charAt(j);
						if(graph[i][j] == 'P'){
							startx = i;
							starty = j;
						}
						
					}
				}
			
			}
			dfs(startx,starty);
			System.out.println(gp);
		}
	}
	public static void dfs(int x, int y){
		if(visited[x][y] == true) return;
		if (graph[x][y] == '#') return;
		if (graph[x][y] == 'G') gp++;
		visited[x][y] = true;
		if (graph[x-1][y] == 'T') {
			visited[x-1][y] = true;
			return;
		}
		if (graph[x+1][y] == 'T') {
			visited[x+1][y] = true;
			return;
		}
		if (graph[x][y-1] == 'T') {
			visited[x][y-1] = true; 
			return;
		}
		if (graph[x][y+1] == 'T') {
			visited[x][y+1] = true;
			return;
		}
		dfs(x+1,y);
		dfs(x-1,y);
		dfs(x,y-1);
		dfs(x,y+1);

	}
}
