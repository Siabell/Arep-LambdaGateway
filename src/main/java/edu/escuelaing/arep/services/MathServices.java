package edu.escuelaing.arep.services;

import edu.escuelaing.arep.client.Client;

public class MathServices {
	
	public static  Integer square(Integer i) {
		//return i*i;
		int answer = 0;
		try {
			answer = Client.sendGet(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return answer;
	}

}
