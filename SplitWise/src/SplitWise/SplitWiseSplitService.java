package SplitWise;

import java.util.ArrayList;

public abstract class SplitWiseSplitService implements SplitWiseServices {
	int UserWhoPaid;
	ArrayList<Integer> SplitBWUserIDs;
	ArrayList<Double> ExactPaymentByEach;
	Database db;
	
	public void execute() {
		int n = SplitBWUserIDs.size();
		for (int i = 0;i<n;i++) {
			db.pay(UserWhoPaid,SplitBWUserIDs.get(i),ExactPaymentByEach.get(i));
		}
	}
}
