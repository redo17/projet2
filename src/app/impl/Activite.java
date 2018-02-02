package app.impl;

import app.beans.IActivite;

public class Activite implements IActivite {

	private int id_actvite;
	private int annee;
	private String nature;
	private String titre;
	private String description;
	private String website_activite;
	
	/* (non-Javadoc)
	 * @see app.impl.IActivite#getId_actvite()
	 */
	@Override
	public int getId_actvite() {
		return id_actvite;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#setId_actvite(int)
	 */
	@Override
	public void setId_actvite(int id_actvite) {
		this.id_actvite = id_actvite;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#getAnnee()
	 */
	@Override
	public int getAnnee() {
		return annee;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#setAnnee(int)
	 */
	@Override
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#getNature()
	 */
	@Override
	public String getNature() {
		return nature;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#setNature(java.lang.String)
	 */
	@Override
	public void setNature(String nature) {
		this.nature = nature;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#getTitre()
	 */
	@Override
	public String getTitre() {
		return titre;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#setTitre(java.lang.String)
	 */
	@Override
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#getWebsite_activite()
	 */
	@Override
	public String getWebsite_activite() {
		return website_activite;
	}
	/* (non-Javadoc)
	 * @see app.impl.IActivite#setWebsite_activite(java.lang.String)
	 */
	@Override
	public void setWebsite_activite(String website_activite) {
		this.website_activite = website_activite;
	}

}
