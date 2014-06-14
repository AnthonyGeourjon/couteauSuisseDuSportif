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
	}

	private void mettreAJourCarnet(int distance, int denivele, Duree duree)
	{
		this.distanceTotal += distance;
		this.deniveleTotal += denivele;
		this.dureeTotale.ajouterDuree(duree);
	}

	/**
	 * @param sortieAAjouter sortie à mettre en mémoire		
	 * @throws SortieDejaEnMemoireException levée si la sortie est déja en mémoire
	 */
	public void ajouterUneSortie(Sortie sortieAAjouter) throws SortieDejaEnMemoireException
	{
		if (this.carnet.containsKey(sortieAAjouter.obtenirDate()))
			throw new SortieDejaEnMemoireException();
		else
		{
			this.carnet.put(sortieAAjouter.obtenirDate(), sortieAAjouter);
			this.mettreAJourCarnet(sortieAAjouter.obtenirDistance(), sortieAAjouter.obtenirDenivele(), sortieAAjouter.obtenirDuree());
		}
	}
}
