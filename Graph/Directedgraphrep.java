import java.util.Scanner;

public class Directedgraphrep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertices: ");
        int v = sc.nextInt();
        System.out.println("Enter no. of edges: ");
        int e = sc.nextInt();
        int[][]  adj = new int[v+1][v+1];
        for (int i = 0; i < e; i++) {
            System.out.println("Enter edge (From): ");
            int v1 = sc.nextInt();
            System.out.println("Enter edge (To): ");
            int v2 = sc.nextInt();
            adj[v1][v2] = 1;
        }
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}
