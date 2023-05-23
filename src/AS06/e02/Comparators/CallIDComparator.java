package AS06.e02.Comparators;

import AS06.e02.Call.Call;

import java.util.Comparator;

public class CallIDComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if(a > b){
            return 1;
        }else if(a < b){
            return -1;
        }else {
            return 0;
        }
    }
}
