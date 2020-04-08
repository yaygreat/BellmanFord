public class Driver
{
    public static void main(String[] args)
    {
        int n = 5;
        int e = 10;
        Graph graph = new Graph(n, e);

        //s = 0, t = 1, x = 2, y = 3, z = 4
        //s->t = 6
        graph.edge[0].beg = 0;
        graph.edge[0].end = 1;
        graph.edge[0].weight = 6;
        //s->y = 7
        graph.edge[1].beg = 0;
        graph.edge[1].end = 3;
        graph.edge[1].weight = 7;

        //t->x = 5
        graph.edge[2].beg = 1;
        graph.edge[2].end = 2;
        graph.edge[2].weight = 5;
        //t->y = 8
        graph.edge[3].beg = 1;
        graph.edge[3].end = 3;
        graph.edge[3].weight = 8;
        //t->z = -5
        graph.edge[4].beg = 1;
        graph.edge[4].end = 4;
        graph.edge[4].weight = -5;

        //x->t = -2
        graph.edge[5].beg = 2;
        graph.edge[5].end = 1;
        graph.edge[5].weight = -2;

        //y->x = -3
        graph.edge[6].beg = 3;
        graph.edge[6].end = 2;
        graph.edge[6].weight = -3;
        //y->z = 9
        graph.edge[7].beg = 3;
        graph.edge[7].end = 4;
        graph.edge[7].weight = 9;

        //z->x = 7
        graph.edge[8].beg = 4;
        graph.edge[8].end = 2;
        graph.edge[8].weight = 7;
        //z->s = 2
        graph.edge[9].beg = 4;
        graph.edge[9].end = 0;
        graph.edge[9].weight = 2;

        graph.BellFord(graph, 0);
    }
}
