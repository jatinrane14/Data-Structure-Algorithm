import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undirectedgraph {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter no. of vertices: ");
        int v = sc.nextInt();
        System.out.println("Enter no. of Edges: ");
        int e = sc.nextInt();
        int[]  adjLs = new int[n+1];

        List<List<Integer>> adjLs =  new ArrayList<>();
        for (int i = 0; i < v+1; i++) {
            adjLs.add(new ArrayList<Integer>())
        }
        for (int i = 0; i < e; i++) {
            System.out.println("Enter Edge (From): ");
            int v1 = sc.nextInt();
            System.out.println("Enter Edge (To): ");
            int v2 = sc.nextInt();
            adjLs.get(v1).addLast(v2);
            adjLs.get(v2).addLast(v1);
        }
    }    
}
