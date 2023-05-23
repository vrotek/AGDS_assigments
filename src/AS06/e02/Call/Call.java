package AS06.e02.Call;

public class Call  {
    private int id;
    private CustomerCategory customerType;
    private CallCategory callType;

    private CallKey key;

    public Call(CustomerCategory customerType, CallCategory callType,int id){
        this.customerType = customerType;
        this.callType = callType;
        this.id = id;

        this.key = new CallKey(id,customerType,callType);
    }


    public CustomerCategory getCustomerCategory() {
        return this.customerType;
    }


    public int getId() {
        return this.id;
    }


    public CallCategory getCallCategory() {
        return this.callType;
    }

    public CallKey getKey(){
        return this.key;
    }


}
