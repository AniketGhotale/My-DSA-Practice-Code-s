import java.util.*;
public class GraphQuestions {

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

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 1));
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

        // //graph[0].add(new Edge(0, 3, 5));
        // //graph[0].add(new Edge(0, 2, 5));

        // //graph[1].add(new Edge(1, 0, 1));
        // //graph[1].add(new Edge(1, 3, 3));

        // //graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 2));

        // graph[3].add(new Edge(3, 1, 3));
        // //graph[3].add(new Edge(3, 4, 1));
        // //graph[3].add(new Edge(3, 5, 1));

        // graph[4].add(new Edge(4, 0, 2));
        // graph[4].add(new Edge(4, 1, 2));
        // // graph[4].add(new Edge(4, 5, 2));

        // graph[5].add(new Edge(5, 0, 2));
        // graph[5].add(new Edge(5, 2, 2));
        // // graph[5].add(new Edge(5, 6, 2));

        // // graph[6].add(new Edge(6, 5, 2));
    }

    public static void createGraph(int points[][],ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<points.length; i++){
            int src = points[i][0];
            int dest = points[i][1];
            int wt = points[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
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

    public static boolean Haspath(ArrayList<Edge> graph[],boolean visited[], int src, int dest){
        if(src == dest){
            return true;
        }
        visited[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dest] && Haspath(graph,visited,e.dest,dest)){
                return true;
            }
        }
        return false;
    }

    public static boolean isdetectcycle(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(isdetectcycleutil(graph,visited,i,-1)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isdetectcycleutil(ArrayList<Edge> graph[],boolean visited[],int curr,int par){
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]){
                if(isdetectcycleutil(graph, visited, e.dest, curr)){
                    return true;
                }
            }else if(visited[e.dest] && e.dest != par){
                return true;
            }
        }

        return false;
    }

    public static boolean isBipartiteGraph(ArrayList<Edge> graph[]){
        // if(graph.length%2 == 0){
        //     return true;
        // }
        int col[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                col[i] = 0;
                q.add(i);
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int newcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = newcol;
                            q.add(e.dest);
                        }else if(col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean iscycledetect(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(iscycledetectUtil(graph,i,visited,stack)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean iscycledetectUtil(ArrayList<Edge> graph[],int curr, boolean visited[],boolean stack[]){ //dfs

        visited[curr] = true;
        stack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){
                return true;
            }
            if(!visited[e.dest]){
                if(iscycledetectUtil(graph, e.dest, visited, stack)){
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void topologicalSortDAG(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                topologicalSortDAGutil(graph,i,visited,s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topologicalSortDAGutil(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> s){ //dfs
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topologicalSortDAGutil(graph, e.dest, visited, s);
            }
        }

        s.push(curr);
    }

    public static void topologicalsortKOHNSalgo(ArrayList<Edge> graph[]) {
        //boolean visited[] = new boolean[graph.length];
        int indegree[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        calindegree(graph,indegree);

        for(int i=0; i<indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for(int j=0; j<graph[curr].size(); j++){
                Edge e = graph[curr].get(j);
                indegree[e.dest]--;
                if(indegree[e.dest] == 0){
                    q.add(e.dest);
                }
            }
            
        }
    }

    public static void calindegree(ArrayList<Edge> graph[],int indegree[]){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src == dest){
            System.out.println(path +dest );
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src+" ");
        }
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }

        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void DijkstraAlgo(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!visited[curr.v]){
                visited[curr.v] = true;
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }

                }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.print(i + " -> " + dist[i] + "       ");
        }
    }

    public static void BellmanFordalgo(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i!= src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int NoOfV = graph.length;

        for(int i=0; i<NoOfV-1; i++){
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(i + " -> " + dist[i] + "       ");
        }
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[7];
        insert(graph);
        // bfs(graph);
        // System.out.println();
        // dfs(graph);
        // System.out.println();
        // System.out.println(Haspath(graph,new boolean[graph.length],0,5));
        // System.out.println();
        // System.out.println("Is cycle detected = "+ isdetectcycle(graph));
        // System.out.println("Is BiPArtite Graph  = "+ isBipartiteGraph(graph));
        // System.out.println();
        // System.out.println("Is cycle detected = "+ iscycledetect(graph));
        // System.out.println();
        // System.out.println("Topological sort for Directed Acylic Graph ");
        // topologicalSortDAG(graph);
        ArrayList<Edge> graph1[] = new ArrayList[4];
        int pints[][] = {
            {0,1,4},
            {0,3,1},
            {3,1,2},
            {3,2,3},
            {1,2,4}};
        createGraph(pints, graph1);
        System.out.println("Topological sort for Directed Acylic Graph ");
        topologicalsortKOHNSalgo(graph1);
        System.out.println();
        System.out.println();
        System.out.println("All Path from 0 to 2 : ");
        printAllPath(graph1, 0, 2, "");
        System.err.println();
        System.out.println("Dijkstra Algorithm = ");
        DijkstraAlgo(graph1, 0);
        System.err.println();
        System.out.println("Bellman Ford Algorithm = ");
        DijkstraAlgo(graph1, 0);
    }
}