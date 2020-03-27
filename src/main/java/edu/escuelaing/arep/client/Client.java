package edu.escuelaing.arep.client;

import java.io.*;
import java.net.*;

public class Client {

	
	public static Integer sendGet(int number) throws Exception {
		URL url = new URL("https://pdwbqerx4c.execute-api.us-east-1.amazonaws.com/MathService?value="+number);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//System.out.println(response.toString());
			String answer = response.toString();
			Integer ans = Integer.parseInt(answer);
			return ans;
		} else {
			System.out.println("Get request not worked");
		}
		return null;

    }
	
}

