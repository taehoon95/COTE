package DFS;

public class TenToBinary {
    public void DFS(int n){
        if(n > 0){
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
}
