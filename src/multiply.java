import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class multiply {
    public List<Integer> Sol(List<Integer> n1, List<Integer>n2){
        List<Integer> res = new ArrayList<>(Collections.nCopies(n1.size() + n2.size(), 0));

        Integer sign = n1.get(0) * n2.get(0) < 0 ? -1 : 1;
        n1.set(0, Math.abs(n1.get(0)));
        n2.set(0, Math.abs(n2.get(0)));

        for(int i = n1.size() -1; i >= 0; --i){
            for(int j = n2.size() -1; j >= 0; --j){
                res.set(i+j+1, res.get(i+j+1) + n1.get(i) * n2.get(j));
                res.set(i+j, res.get(i+j) + res.get(i+j+1) / 10);
                res.set(i+j+1, res.get(i+j+1) % 10);
            }
        }

        int firstNotZero = 0;
        while(firstNotZero < res.size() && res.get(firstNotZero) == 0){
            firstNotZero++;
        }

        res.subList(firstNotZero, res.size());
        res.set(0, res.get(0) * sign);
        return res;
    }
}
