import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;
    public Graph() {
        adjacencyList = new HashMap<>();
    }


    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }


    public void removeVertex(int vertex) {
        adjacencyList.remove(vertex);
        for (List<Integer> neighbors : adjacencyList.values()) {
            neighbors.remove(Integer.valueOf(vertex));
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public void removeEdge(int source, int destination) {
        adjacencyList.get(source).remove(Integer.valueOf(destination));
    }
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Graph adjacency list:");
        graph.printGraph();
        graph.bfs(2);
        graph.removeEdge(2, 3);
        System.out.println("After removing edge (2, 3):");
        graph.printGraph();

        graph.removeVertex(3);
        System.out.println("After removing vertex 3:");
        graph.printGraph();
    }
}
