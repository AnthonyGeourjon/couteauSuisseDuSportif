package moduleSportEndurance;

import java.util.Date;

import divers.Duree;

/**
 * @author Anthony
 *
 */
public class Sortie
{
	/**
	 * Distance de la sortie
	 */
	private int distance;
	
	/**
	 * Duree de la sortie
	 */
	private Duree duree;
	
	/**
	 * Denivelé de la sortie
	 */
	private int denivele;
	
	/**
	 * Description textuelle du parcours
	 */
	private String parcours;
	
	/**
	 * Description textuelle du ressenti de la sortie (facile, difficile ...)
	 */
	private String ressenti;
	
	/**
	 * Vrai si l'on est seul 
	 */
	private boolean seul;
	
	/**
	 * Condition de la sortie (Météo etc)
	 */
	private String environnement;
	
	/**
	 * Date de la sortie
	 */
	private Date date;

	@SuppressWarnings("javadoc")
	public Sortie(int distance, Duree duree, int denivele, String parcours, String ressenti, boolean seul,
			String environnement, Date date)
	{
		this.distance = distance;
		this.duree = duree;
		this.denivele = denivele;
		this.parcours = parcours;
		this.ressenti = ressenti;
		this.seul = seul;
		this.environnement = environnement;
		this.date = date;
	}

	@SuppressWarnings("javadoc")
	public int obtenirDistance()
	{
		return this.distance;
	}

	@SuppressWarnings("javadoc")
	public Duree obtenirDuree()
	{
		return this.duree;
	}

	@SuppressWarnings("javadoc")
	public int obtenirDenivele()
	{
		return this.denivele;
	}

	@SuppressWarnings("javadoc")
	public String obtenirParcours()
	{
		return this.parcours;
	}

	@SuppressWarnings("javadoc")
	public String obtenirRessenti()
	{
		return this.ressenti;
	}

	@SuppressWarnings("javadoc")
	public boolean estSeul()
	{
		return this.seul;
	}

	@SuppressWarnings("javadoc")
	public String obtenirEnvironnement()
	{
		return this.environnement;
	}

	@SuppressWarnings("javadoc")
	public Date obtenirDate()
	{
		return this.date;
	}
	
	


	
	
}
