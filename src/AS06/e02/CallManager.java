package AS06.e02;

import AS06.e02.Call.Call;
import AS06.e02.Call.CallCategory;
import AS06.e02.Call.CallKey;
import AS06.e02.Call.CustomerCategory;
import AS06.e02.Comparators.CallComparator;
import AS06.e02.PriorityQueue.HeapPriorityQueue;
import AS06.e02.PriorityQueue.IPriorityQueue;

import java.util.Comparator;

public class CallManager implements ICallManager {

    Comparator<CallKey> comp = new CallComparator();
    IPriorityQueue<CallKey, Call> callQueue = new HeapPriorityQueue<>(comp);


    @Override
    public void addCall(int id, CustomerCategory customerType, CallCategory callType) {
        Call call = new Call(customerType,callType,id);
        callQueue.insert(call.getKey(),call);
    }

    @Override
    public int getNextCall() {
        return callQueue.removeMin().getValue().getId();
    }
}
