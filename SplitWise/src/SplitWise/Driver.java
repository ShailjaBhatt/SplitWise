package SplitWise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Users u1 = new Users(1,"Shailja","sha@gmail.com","1234");
		Users u2 = new Users(2,"Ashish","ash@gmail.com","12345");
		Users u3 = new Users(3,"Soniya","son@gmail.com","123");
		Database database = new Database(new ArrayList<Users>(Arrays.asList(u1,u2,u3)));
		SplitWiseServices service;
		while (true) {
			String[] in = br.readLine().trim().split(" ");
			if (in[0].equals("EXPENSE")) {
				String command = in[4 + Integer.valueOf(in[3])];
				ArrayList<Integer> userList = new ArrayList();
				for (int i = 4;i<Integer.valueOf(in[3])+4;i++) {
					userList.add(Integer.valueOf(in[i]));
				}
				if (command.equals("EXACT")) {
					//EXPENSE u1 1250 2 u2 u3 EXACT 370 880
					ArrayList<Double> exactpayment = new ArrayList();
					for (int i = 0;i<Integer.valueOf(in[3]);i++) {
						exactpayment.add(Double.valueOf(in[Integer.valueOf(in[3])+5+i]));
					}
					service = new ExactSplitService(Integer.valueOf(in[1]),userList,exactpayment,database);
				}
				else if (command.equals("EQUAL")) {
					service = new EqualSplitService(Integer.valueOf(in[1]),userList,Integer.valueOf(in[2]),database);
				}
				else {
					ArrayList<Double> percentpayment = new ArrayList();
					for (int i = 0;i<Integer.valueOf(in[3]);i++) {
						percentpayment.add(Double.valueOf(in[Integer.valueOf(in[3])+5+i]));
					}
					service = new PercentageSplitService(Integer.valueOf(in[1]),userList,percentpayment,Integer.valueOf(in[2]),database);
				}
				
			}
			else {
				if (in.length == 1) {
					service = new SplitWiseShowAllService(database);
				}
				else {
					ArrayList<Integer> showUser = new ArrayList<Integer>();
					showUser.add(Integer.valueOf(in[1]));
					service = new SplitWiseShowService(database,showUser);
				}
			}
			service.execute();
		}

	}

}
