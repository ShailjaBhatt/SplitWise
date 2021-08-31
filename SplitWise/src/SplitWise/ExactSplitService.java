package SplitWise;

import java.util.ArrayList;

public class ExactSplitService extends SplitWiseSplitService{
	ExactSplitService(int UserWhopaid,ArrayList<Integer> SplitBWUsers,ArrayList<Double> ExactPayment,Database DB){
		UserWhoPaid = UserWhopaid;
		SplitBWUserIDs = SplitBWUsers;
		ExactPaymentByEach = ExactPayment;
		db = DB;
		
	}
}
