import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph(){
        adjList=new HashMap<>();
    }
    void addVertex(int v){
        adjList.putIfAbsent(v,new ArrayList<>());
    }
    void addEdge(int src,int dest){
        adjList.putIfAbsent(src,new ArrayList<>());
        adjList.putIfAbsent(dest,new ArrayList<>());
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    void removeVertex(int v){
        if(!adjList.containsKey(v)) return;
        adjList.values().forEach(e -> e.remove(Integer.valueOf(v)));
        adjList.remove(v);
    }
    void removeEdge(int src,int dest){
        if(adjList.containsKey(src))
            adjList.get(src).remove(Integer.valueOf(dest));
        if(adjList.containsKey(dest))
            adjList.get(dest).remove(Integer.valueOf(src));
    }

    void bfs(int start){
        Set<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");
        while(!q.isEmpty()){
            int v=q.poll();
            System.out.print(v+" ");
            for(int n:adjList.get(v)){
                if(!visited.contains(n)){
                    visited.add(n);
                    q.add(n);
                }
            }
        }
        System.out.println();
    }
    void dfs(int start){
        Set<Integer> visited=new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(start,visited);
        System.out.println();
    }

    void dfsHelper(int v,Set<Integer> visited){
        visited.add(v);
        System.out.print(v+" ");
        for(int n:adjList.get(v)){
            if(!visited.contains(n)){
                dfsHelper(n,visited);
            }
        }
    }
    void display(){
        System.out.println("Graph adjacency list:");
        for(int v:adjList.keySet()){
            System.out.println(v+" -> "+adjList.get(v));
        }
    }
}
public class MidlevelTask8 {
    public static void main(String[] args){
        Graph g=new Graph();
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,5);
        g.addEdge(4,5);
        g.display();
        g.bfs(1);
        g.dfs(1);
        System.out.println("\nRemoving edge between 1 and 3...");
        g.removeEdge(1,3);
        g.display();
        System.out.println("\nRemoving vertex 5...");
        g.removeVertex(5);
        g.display();
    }
}
