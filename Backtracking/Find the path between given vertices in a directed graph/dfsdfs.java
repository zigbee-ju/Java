package graphs;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class dfsdfs {
    private LinkedList<Integer> adj[];
    public dfsdfs(int v){
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public boolean dfsUtil(int source, int destination, boolean vis[], Stack<Integer> path){
        if(source == destination) return true;
        for(int neighbor : adj[source]){
            if(!vis[neighbor]){
                vis[neighbor] = true;
                path.add(neighbor);
                boolean isConnected = dfsUtil(neighbor, destination, vis, path);
                if(isConnected) return true;
            }
        }
        return false;
    }



    public boolean dfs(int source, int destination, Stack<Integer> path){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;

        return dfsUtil(source, destination, vis, path);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        dfsdfs graph = new dfsdfs(v);

        Stack<Integer> path = new Stack<>();
        
        System.out.println("Enter "+ e + " edges");
        for(int i = 0; i < e; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }

        System.out.println(("Enter the source and destination:"));
        int source = sc.nextInt();
        int destination = sc.nextInt();

        System.out.println("possible " + graph.dfs(source,destination, path));
        System.out.println("The complete path is:"+path);

        sc.close();

    }
}
