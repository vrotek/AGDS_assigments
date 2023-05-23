package AS06.e02;

import AS06.e02.Call.CallCategory;
import AS06.e02.Call.CustomerCategory;

public interface ICallManager {

    public void addCall(int id, CustomerCategory customerType, CallCategory callType);

    public int getNextCall();

}
