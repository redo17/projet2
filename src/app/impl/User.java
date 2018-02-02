package app.impl;

import java.util.Date;

import app.beans.IUser;

public class User implements IUser{
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String website;
	private Date birthday;
	private String pwd;
	
	/* (non-Javadoc)
	 * @see app.beans.IUser#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#getMail()
	 */
	@Override
	public String getMail() {
		return mail;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setMail(java.lang.String)
	 */
	@Override
	public void setMail(String mail) {
		this.mail = mail;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#getWebsite()
	 */
	@Override
	public String getWebsite() {
		return website;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setWebsite(java.lang.String)
	 */
	@Override
	public void setWebsite(String website) {
		this.website = website;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#getBirthday()
	 */
	@Override
	public Date getBirthday() {
		return birthday;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setBirthday(java.util.Date)
	 */
	@Override
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#getPwd()
	 */
	@Override
	public String getPwd() {
		return pwd;
	}
	/* (non-Javadoc)
	 * @see app.beans.IUser#setPwd(java.lang.String)
	 */
	@Override
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
