package AS06.e02.Comparators;

import AS06.e02.Call.Call;
import AS06.e02.Call.CallCategory;
import AS06.e02.Call.CallKey;
import AS06.e02.Call.CustomerCategory;

import java.util.Comparator;

public class CallComparator implements Comparator<CallKey> {
    @Override
    public int compare(CallKey a, CallKey b) {
        Comparator<CustomerCategory> customerComparer = new CustomerCategoryComparator();
        Comparator<CallCategory> callComparer = new CallCategoryComparator();
        Comparator<Integer> idComparer = new CallIDComparator();
        if(customerComparer.compare(a.customerType,b.customerType) != 0){
            return customerComparer.compare(a.customerType,b.customerType);
        }
        if(callComparer.compare(a.callType,b.callType) != 0){
            return callComparer.compare(a.callType,b.callType);
        }

        return idComparer.compare(a.id,b.id);
    }
}
