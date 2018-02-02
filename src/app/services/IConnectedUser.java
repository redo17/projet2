package app.services;

import javax.ejb.Remote;

@Remote
public interface IConnectedUser {
   void login(String login, String pwd);

   void logout();
}