package AS06.e02.Comparators;

import AS06.e02.Call.Call;
import AS06.e02.Call.CustomerCategory;

import java.util.Comparator;

public class CustomerCategoryComparator implements Comparator<CustomerCategory> {

    private int getCustomerWeight(CustomerCategory customerType){
        return switch(customerType){
            case Business -> 1;
            case Private -> 0;
        };
    }
    @Override
    public int compare(CustomerCategory a, CustomerCategory b) {
        if(getCustomerWeight(a) > getCustomerWeight(b) ){
            return -1;
        }else if(getCustomerWeight(a) < getCustomerWeight(b)){
            return 1;
        }else {
            return 0;
        }
    }
}
