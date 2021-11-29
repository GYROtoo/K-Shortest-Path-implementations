// Adjacency Matrix representation in Java

public class Graph {
    private int adjMatrix[][];
    private int numVertices;

    // Initialize the matrix
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(int i, int j,int weight) {
        adjMatrix[i][j] = weight;
        //adjMatrix[j][i] = j;
    }

    // Remove edges
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (int j : adjMatrix[i]) {
                s.append((j  + " "));
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1,2);
        g.addEdge(0, 2,3);
        g.addEdge(1, 2,1);
        g.addEdge(2, 0,4);
        g.addEdge(2, 3,2);

        System.out.print(g.toString());
    }
}
