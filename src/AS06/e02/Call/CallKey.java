package AS06.e02.Call;

public class CallKey {

    public int id;
    public CustomerCategory customerType;
    public CallCategory callType;


    public CallKey(int id, CustomerCategory customerType, CallCategory callType){
        this.id = id;
        this.customerType = customerType;
        this.callType = callType;
    }

}
