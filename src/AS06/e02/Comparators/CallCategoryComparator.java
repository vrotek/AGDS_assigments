package AS06.e02.Comparators;

import AS06.e02.Call.Call;
import AS06.e02.Call.CallCategory;

import java.util.Comparator;

public class CallCategoryComparator implements Comparator<CallCategory> {

    private int getCallWeight(CallCategory callType){
        return switch(callType){
            case PaymentProblems -> 1;
            case Claim -> 0;
        };
    }
    @Override
    public int compare(CallCategory a, CallCategory b) {
        if(getCallWeight(a) > getCallWeight(b) ){
            return -1;
        }else if(getCallWeight(a) < getCallWeight(b)){
            return 1;
        }else {
            return 0;
        }
    }
}
