public class Graph
{
    int n; //node
    int e; //edge
    Edge edge[];

    public Graph(int n, int e)
    {
        this.n = n;
        this.e = e;
        edge = new Edge[e];
        for(int i = 0; i < e; i++)
            edge[i] = new Edge();
    }

    public class Edge
    {
        int beg;
        int end;
        int weight;
        Edge()
        {
            beg = 0;
            end = 0;
            weight = 0;
        }
    }

    public void BellFord(Graph graph, int beg)
    {
        int n = graph.n;
        int e = graph.e;
        int u = 0, z = 0, r = 0;
        int distance[] = new int[n];
        for(int v = 0; v < n; v++)
            if(v == beg)
                distance[v] = 0;
            else
                distance[v] = Integer.MAX_VALUE;
        for(int v = 1; v < n; v++)
        {
            for(int i = 0; i < e; i++)
            {
                u = graph.edge[i].beg;
                z = graph.edge[i].end;
                r = distance[u] + graph.edge[i].weight;
                if (r < distance[z])
                    distance[z] = r;
            }
        }
        //check for negative weight cycle
        for(int i = 0; i < e; i++)
        {
            u = graph.edge[i].beg;
            z = graph.edge[i].end;
            r = distance[u] + graph.edge[i].weight;
            if (r < distance[z])
                System.out.println("There is a negative weight cycle");
        }
        printBellFord(distance, n);
    }

    public void printBellFord(int dist[], int n)
    {
        System.out.println("Vertex\tDistance from S");
        for(int v = 0; v < n; v++)
            System.out.println(v + "\t" + dist[v]);
    }
}
