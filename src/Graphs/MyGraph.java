package Graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class MyGraph {
	
	HashMap<Integer, LinkedList<Integer>> adjList = new HashMap<Integer, LinkedList<Integer>>();
	
	MyGraph(int vertexCt){
		for(int i= 1; i<= vertexCt; i++) {
			adjList.put(i, new LinkedList<Integer>());
		}
	}
	
	void setEdge(int source , int dest) {
		LinkedList<Integer> src = adjList.get(source);
		LinkedList<Integer> dt = adjList.get(dest);
		
		if(src != null && dt != null) {
			src.add(dest);	
		}
		
	}
	
	int graphSize() {
		return adjList.size();
	}
	
	LinkedList<Integer> getNeighs(int vertex){
		return adjList.get(vertex);
	}

}
