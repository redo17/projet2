package app.beans;

import java.util.Date;

public interface IUser {

	/**
	 * @return the id
	 */
	int getId();

	/**
	 * @param id the id to set
	 */
	void setId(int id);

	/**
	 * @return the nom
	 */
	String getNom();

	/**
	 * @param nom the nom to set
	 */
	void setNom(String nom);

	/**
	 * @return the prenom
	 */
	String getPrenom();

	/**
	 * @param prenom the prenom to set
	 */
	void setPrenom(String prenom);

	/**
	 * @return the mail
	 */
	String getMail();

	/**
	 * @param mail the mail to set
	 */
	void setMail(String mail);

	/**
	 * @return the website
	 */
	String getWebsite();

	/**
	 * @param website the website to set
	 */
	void setWebsite(String website);

	/**
	 * @return the birthday
	 */
	Date getBirthday();

	/**
	 * @param birthday the birthday to set
	 */
	void setBirthday(Date birthday);

	/**
	 * @return the pwd
	 */
	String getPwd();

	/**
	 * @param pwd the pwd to set
	 */
	void setPwd(String pwd);

}