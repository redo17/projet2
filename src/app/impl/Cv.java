package app.impl;

import java.util.Collection;

import app.beans.ICv;

public class Cv implements ICv {
	
	private int id_cv;
	private int user_id;
	private Collection<Activite> activite_list;
	
	/* (non-Javadoc)
	 * @see app.impl.ICv#getId_cv()
	 */
	@Override
	public int getId_cv() {
		return id_cv;
	}
	/* (non-Javadoc)
	 * @see app.impl.ICv#setId_cv(int)
	 */
	@Override
	public void setId_cv(int id_cv) {
		this.id_cv = id_cv;
	}
	/* (non-Javadoc)
	 * @see app.impl.ICv#getUser_id()
	 */
	@Override
	public int getUser_id() {
		return user_id;
	}
	/* (non-Javadoc)
	 * @see app.impl.ICv#setUser_id(int)
	 */
	@Override
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/* (non-Javadoc)
	 * @see app.impl.ICv#getActivite_list()
	 */
	@Override
	public Collection<Activite> getActivite_list() {
		return activite_list;
	}
	/* (non-Javadoc)
	 * @see app.impl.ICv#setActivite_list(java.util.Collection)
	 */
	@Override
	public void setActivite_list(Collection<Activite> activite_list) {
		this.activite_list = activite_list;
	}
	
}
