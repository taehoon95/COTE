package DFS;

public class Factorial {
    public int DFS(int n){
        return n == 1 ? 1 : n * DFS(n - 1);
    }
}
