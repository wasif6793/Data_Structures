package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("c");
        g.addEdge("a","b");
        g.addEdge("a","c");
        g.addEdge("b","c");
        g.printGraph();
        g.removeEdge("a","b");
        g.removeVertex("c");
        g.printGraph();
    }

    public void printGraph(){
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String from, String to ){
        if(adjList.get(from) != null && adjList.get(to) != null){
            adjList.get(from).add(to);
            adjList.get(to).add(from);
            return true;
        }
         return false;
    }

    // Removing Edge
    public boolean removeEdge(String from, String to){
        if(adjList.get(from) != null && adjList.get(to) != null){
            adjList.get(from).remove(to);
            adjList.get(to).remove(from);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjList.get(vertex) ==null) return false;

        for(String s : adjList.get(vertex)){
            adjList.get(s).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
