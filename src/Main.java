import DFS.Factorial;
import DFS.TenToBinary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        multiply dfs = new multiply();

        List<Integer> n1 = Arrays.asList(1,9,3,7,0,7,7,2,1);
        List<Integer> n2 = Arrays.asList(-7,6,1,8,3,8,2,5,7,2,8,7);
        List<Integer> sol = dfs.Sol(n1, n2);
        sol.stream().forEach(System.out::print);

    }
}

