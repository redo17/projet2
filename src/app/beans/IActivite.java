package app.beans;

public interface IActivite {

	/**
	 * @return the id_actvite
	 */
	int getId_actvite();

	/**
	 * @param id_actvite the id_actvite to set
	 */
	void setId_actvite(int id_actvite);

	/**
	 * @return the annee
	 */
	int getAnnee();

	/**
	 * @param annee the annee to set
	 */
	void setAnnee(int annee);

	/**
	 * @return the nature
	 */
	String getNature();

	/**
	 * @param nature the nature to set
	 */
	void setNature(String nature);

	/**
	 * @return the titre
	 */
	String getTitre();

	/**
	 * @param titre the titre to set
	 */
	void setTitre(String titre);

	/**
	 * @return the description
	 */
	String getDescription();

	/**
	 * @param description the description to set
	 */
	void setDescription(String description);

	/**
	 * @return the website_activite
	 */
	String getWebsite_activite();

	/**
	 * @param website_activite the website_activite to set
	 */
	void setWebsite_activite(String website_activite);

}