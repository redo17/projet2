package app.beans;

import java.util.Collection;

import app.impl.Activite;

public interface ICv {

	/**
	 * @return the id_cv
	 */
	int getId_cv();

	/**
	 * @param id_cv the id_cv to set
	 */
	void setId_cv(int id_cv);

	/**
	 * @return the user_id
	 */
	int getUser_id();

	/**
	 * @param user_id the user_id to set
	 */
	void setUser_id(int user_id);

	/**
	 * @return the activite_list
	 */
	Collection<Activite> getActivite_list();

	/**
	 * @param activite_list the activite_list to set
	 */
	void setActivite_list(Collection<Activite> activite_list);

}