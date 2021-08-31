package SplitWise;

import java.util.HashMap;
import java.util.List;

public class Database {
	private HashMap<Integer,HashMap<Integer,Double>> AllDataGrid;
	private HashMap<Integer,Users> AllData;
	Database(){
		AllDataGrid = new HashMap<Integer, HashMap<Integer, Double>>();
		AllData = new HashMap<Integer, Users>();
	}
	Database(List<Users> UserList){
		AllDataGrid = new HashMap<Integer, HashMap<Integer, Double>>();
		AllData = new HashMap<Integer, Users>();
		for (Users user : UserList) {
			AllData.put(user.getID(), user);
		}
	}
	public void pay(int UserIDpaid,int UserIdRecieved,double amount) {
		if (!AllDataGrid.containsKey(UserIDpaid)) {
			AllDataGrid.put(UserIDpaid,new HashMap<Integer, Double>());			
		}
		if (!AllDataGrid.containsKey(UserIdRecieved)) {
			AllDataGrid.put(UserIdRecieved,new HashMap<Integer, Double>());			
		}
		AllDataGrid.get(UserIDpaid).put(UserIdRecieved, AllDataGrid.get(UserIDpaid).getOrDefault(UserIdRecieved,0.00)+amount);
		AllDataGrid.get(UserIdRecieved).put(UserIDpaid, AllDataGrid.get(UserIdRecieved).getOrDefault(UserIDpaid,0.00)-amount);
	}
	public HashMap<Integer, HashMap<Integer, Double>> getAllDataGrid() {
		return AllDataGrid;
	}
	public void setAllDataGrid(HashMap<Integer, HashMap<Integer, Double>> allDataGrid) {
		AllDataGrid = allDataGrid;
	}
	public HashMap<Integer, Users> getAllData() {
		return AllData;
	}
	public void setAllData(HashMap<Integer, Users> allData) {
		AllData = allData;
	}
}
