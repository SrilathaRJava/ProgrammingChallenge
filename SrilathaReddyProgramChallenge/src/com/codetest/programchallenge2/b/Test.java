package com.codetest.programchallenge2.b;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws NoDataException {
		List<User> userList = loadDataFromDB();
			if(null == userList || userList.size() <= 0){
				throw new NoDataException(1001,"User Data Not Found");
			}
			
			for(User user:userList){
				System.out.println(user);
				System.out.println("*********************************************************************************");
			}
	}
	
	/**
	 * Method to load data from database
	 * @return  List<User>
	 */
	public static List<User> loadDataFromDB(){
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("Andy");
		user.setPhone(2345678901l);
		user.setAddress("Kansas City, MO");
		userList.add(user);

		user = new User();
		user.setId(2);
		user.setName("Nan");
		user.setPhone(9876543312l);
		user.setAddress("Overland Park, Kansas");		
		userList.add(user);
		
		return userList;
	}
}
