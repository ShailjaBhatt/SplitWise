package SplitWise;

import java.util.ArrayList;

public class SplitWiseShowAllService extends SplitWiseShowService{
	SplitWiseShowAllService(Database DB){
		db = DB;
		UserIds = new ArrayList<Integer>();
//		System.out.println(db.getAllData().size());
		for (Integer i : db.getAllData().keySet()) {
			UserIds.add(i);
		}
		
	}
}
