package moduleSportEndurance;

import java.util.Date;
import java.util.Hashtable;

import divers.Duree;
import exception.SortieDejaEnMemoireException;

/**
 * @author Anthony
 *
 */
public class CarnetDeSortie
{
	private Hashtable<Date, Sortie> carnet;

	private int distanceTotal;

	private int deniveleTotal;

	private Duree dureeTotale;

	/**
	 * Construction d'un carnet
	 */
	public CarnetDeSortie()
	{
		this.deniveleTotal = 0;
		this.distanceTotal = 0;
		this.dureeTotale = new Duree();
		this.carnet=new Hashtable<>();
	}

	private void mettreAJourCarnet(float distance, int denivele, Duree duree)
	{
		this.distanceTotal += distance;
		this.deniveleTotal += denivele;
		this.dureeTotale.ajouterDuree(duree);
	}

	/**
	 * @param sortieAAjouter sortie � mettre en m�moire		
	 * @throws SortieDejaEnMemoireException lev�e si la sortie est d�ja en m�moire
	 */
	public void ajouterUneSortie(Sortie sortieAAjouter) throws SortieDejaEnMemoireException
	{
		if (this.trouverUneSortie(sortieAAjouter.obtenirDate()))
			throw new SortieDejaEnMemoireException();
		else
		{
			this.carnet.put(sortieAAjouter.obtenirDate(), sortieAAjouter);
			this.mettreAJourCarnet(sortieAAjouter.obtenirDistance(), sortieAAjouter.obtenirDenivele(), sortieAAjouter.obtenirDuree());
		}
	}
	
	private boolean trouverUneSortie(Date dateDeLaSortie)
	{
		return this.carnet.containsKey(dateDeLaSortie);
	}
	
	/**
	 * @return le denivel� total
	 */
	public int obtenirDeniveleTotal()
	{
		return this.deniveleTotal;
	}
	
	/**
	 * @return la distance total
	 */
	public int obtenirDistanceTotal()
	{
		return this.distanceTotal;
	}
	
	/**
	 * @return la dur�e total
	 */
	public Duree obtenirDureeTotale()
	{
		return this.dureeTotale;
	}
}
