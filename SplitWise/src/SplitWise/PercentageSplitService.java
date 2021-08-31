package SplitWise;

import java.util.ArrayList;

public class PercentageSplitService extends SplitWiseSplitService{
	PercentageSplitService(int UserWhopaid,ArrayList<Integer> SplitBWUsers,ArrayList<Double> PercentPayment,double Amount,Database DB){
		UserWhoPaid = UserWhopaid;
		SplitBWUserIDs = SplitBWUsers;
		ExactPaymentByEach = new ArrayList<Double>();
		db = DB;
		int n = SplitBWUsers.size();
		for (int i = 0;i<n;i++) {
			ExactPaymentByEach.add(Amount*PercentPayment.get(i)/100);
		}
	}
}
