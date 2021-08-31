package SplitWise;

import java.util.ArrayList;

public class EqualSplitService extends SplitWiseSplitService{
	EqualSplitService(int UserWhopaid,ArrayList<Integer> SplitBWUsers,double totalAmount,Database DB){
		UserWhoPaid = UserWhopaid;
		SplitBWUserIDs = SplitBWUsers;
		ExactPaymentByEach = new ArrayList<Double>();
		db = DB;
		int NumberOfUsers = SplitBWUsers.size()+1;
		double splitAmount = totalAmount/(NumberOfUsers);
		for (int i = 0;i<NumberOfUsers-1;i++) {
			ExactPaymentByEach.add(splitAmount);
		}
	}
	
	

}
