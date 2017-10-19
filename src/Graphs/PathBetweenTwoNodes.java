package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class PathBetweenTwoNodes {
	
	public static void main(String[] args) {
		
		MyGraph newGraph = new MyGraph(6);
		
		newGraph.setEdge(1, 2);
		newGraph.setEdge(2, 3);
		newGraph.setEdge(3, 5);
		newGraph.setEdge(4, 2);
		newGraph.setEdge(5, 4);
		newGraph.setEdge(6, 4);
		
		// System.out.println(isTherePath(newGraph, 5, 3));;
		
		System.out.println(reverse(123));
		
	}
	
	
	public static int reverse(int x) {
        
        int len = String.valueOf(x).length();
        
        int result = 0;
        
        int i = 1;
        int j = len;
        while(i < len){
            result += (x % Math.pow(10, i)) * Math.pow(10, j);
            i++;
            j--;
        }
        
        return result;
        
    }
	public static boolean isTherePath(MyGraph g, int s, int d){
		Queue<Integer> q = new LinkedList<Integer>();
		int[] visited = new int[g.graphSize()];
		q.add(s);
		while(!q.isEmpty()) {
			int x = q.poll();
			LinkedList<Integer> neighList = g.getNeighs(x);
			for(int i=0; i<neighList.size(); i++) {
				if(visited[neighList.get(i) - 1] != 1) {
					if(neighList.get(i) == d)
						return true;
					q.add(neighList.get(i));	
				}
			}
			visited[x - 1] = 1;
		}
		
		return false;
		
	}

}
