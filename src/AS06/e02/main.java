package AS06.e02;

import AS06.e02.Call.CallCategory;
import AS06.e02.Call.CustomerCategory;

public class main {

    public static ICallManager callManager = new CallManager();
    public static void main(String[] args) {
        callManager.addCall(0, CustomerCategory.Business, CallCategory.PaymentProblems);
        callManager.addCall(1, CustomerCategory.Private, CallCategory.Claim);
        callManager.addCall(2, CustomerCategory.Private, CallCategory.Claim);
        System.out.println("Next call: " + callManager.getNextCall());
        System.out.println("Next call: " + callManager.getNextCall());
        callManager.addCall(3, CustomerCategory.Private, CallCategory.PaymentProblems);
        callManager.addCall(4, CustomerCategory.Business, CallCategory.Claim);
        System.out.println("Next call: " + callManager.getNextCall());
        System.out.println("Next call: " + callManager.getNextCall());
        callManager.addCall(5, CustomerCategory.Business, CallCategory.PaymentProblems);
        System.out.println("Next call: " + callManager.getNextCall());
        System.out.println("Next call: " + callManager.getNextCall());
    }
}
