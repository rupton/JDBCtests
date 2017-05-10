package com.tes;

import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.ConnectionException;

public class TestSFConnection {

	public static void main(String args[]){
		final String USER_NAME = "ryan.upton-lgaa@force.com";
		final String PASSWORD = "timsPW10!_";
		String session = "00D41000000W68b!ARYAQPcikC_ZnzeomZudtobxe6SW2o9WUvt7gYv0pJewUjMUa8hfzY7zFCmyvejt.NtVzxwU8x6QTjRq6a.TwgztMh6vI5eo";
		
		ConnectorConfig config = new ConnectorConfig();
		//config.setUsername(USER_NAME);
		//config.setPassword(PASSWORD);
		config.setSessionId(session);
		
		try {
			EnterpriseConnection connection = Connector.newConnection(config);
			System.out.println("Aut endpoint: " + config.getAuthEndpoint());
			System.out.println("Service endpoint: " + config.getServiceEndpoint());
			System.out.println("Session ID: " + config.getSessionId());
			//System.out.println("Server ur: " + config.ge);
			
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
