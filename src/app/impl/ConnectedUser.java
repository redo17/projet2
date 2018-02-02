package app.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import app.services.IConnectedUser;

@Stateful(name="connectedUser")
public class ConnectedUser implements IConnectedUser {

	@Override
	public void login(String login, String pwd) {
		// TODO Auto-generated method stub
		
	}

	@Remove
	public void logout() {
	   System.out.println("Logout user "+this);
	}
        

}