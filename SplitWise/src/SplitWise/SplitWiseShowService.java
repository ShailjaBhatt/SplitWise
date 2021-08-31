package SplitWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SplitWiseShowService implements SplitWiseServices{
	protected Database db;
	protected ArrayList<Integer> UserIds;
	SplitWiseShowService(){
		
	}
	SplitWiseShowService(Database DB,ArrayList<Integer> UserID){
		db = DB;
		UserIds = UserID;
	}
	//private HashMap<Integer,HashMap<Integer,Double>> AllDataGrid;
	//private HashMap<Integer,Users> AllData;
	public void execute() {
		for (int ID : UserIds) {
			for (Entry<Integer,Double> entry : db.getAllDataGrid().get(ID).entrySet()) {
				if (entry.getValue() < 0) {
					System.out.println(db.getAllData().get(entry.getKey()).getName() + " owes " + db.getAllData().get(ID).getName() + " " + (-1*entry.getValue()));
				}
			}
		}
	}
}
