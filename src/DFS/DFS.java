package DFS;

public class DFS {
    public void DFS(int n){
        if(n > 0) {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

}
