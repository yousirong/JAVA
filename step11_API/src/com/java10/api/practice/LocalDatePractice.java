package com.java10.api.practice;


import java.util.HashMap;
import java.util.Map;

public class LocalDatePractice{

	public static void main(String[] args) {
		Map <String, User> userMap = new HashMap<>();
		User user1 = new User("abc","2016-12-31");
		User user2 = new User("abd", "2018-12-31");
		userMap.put(user1.getId(), user1);
		userMap.put(user2.getId(), user2);
		for(String id : userMap.keySet()) {
			System.out.println(id+":"+userMap.get(id).getAnniversary()+" ="+userMap.get(id).getRemainString());
		}
	}

}
