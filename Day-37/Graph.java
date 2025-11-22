import java.util.*;
public class Graph {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void insert(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 5));

        graph[1].add(new Edge(1, 3, 5));
        graph[1].add(new Edge(1, 0, 1));
        //graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 1));
        //graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 2));

        graph[6].add(new Edge(6, 5, 2));
    }

    public static void dfs(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                dfsutil(graph,visited,i);
            }
        }
    }

    public static void dfsutil(ArrayList<Edge> graph[], boolean visited[],int curr){
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfsutil(graph, visited, e.dest);
            }
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                bfsutil(graph,visited,i);
            }
        }
    }

    public static void bfsutil(ArrayList<Edge> graph[], boolean visited[],int curr){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);

        while (!q.isEmpty()) {
            curr = q.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
            
        }
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[7];
        insert(graph);
        bfs(graph);
        System.out.println();
        dfs(graph);
    }
}