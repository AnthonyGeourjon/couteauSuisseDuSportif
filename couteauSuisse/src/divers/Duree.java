package divers;

import exception.DureeIncorrecteException;

/**
 * 
 * @author Anthony
 */

public class Duree
{

	private int minute;

	private int heure;

	private int jour;

	/**
	 * @return le nombre de minute
	 */
	public int obtenirMinute()
	{
		return this.minute;
	}

	/**
	 * @return le nombre d'heure
	 */
	public int obtenirHeure()
	{
		return this.heure;
	}

	/**
	 * @return le nombre de jour de la durée
	 */
	public int obtenirJour()
	{
		return this.jour;
	}

	/**
	 * @param heure
	 *            heure de l'heure
	 * @param minute
	 *            minute de l'heure
	 * @throws DureeIncorrecteException
	 *             levée si heure incorrecte
	 */
	public Duree(int heure, int minute) throws DureeIncorrecteException
	{
		this.testerHeure(heure);
		this.testerMinute(minute);
		this.heure = heure;
		this.minute = minute;
		this.jour = 0;
	}

	/**
	 * @param jour
	 *            nombre de jour de la durée
	 * @param heure
	 *            nombre d'heure de la durée
	 * @param minute
	 *            nombre de minute de la durée
	 * @throws DureeIncorrecteException
	 *             levée si la durée est impossible
	 */
	public Duree(int jour, int heure, int minute) throws DureeIncorrecteException
	{
		this.testerHeure(heure);
		this.testerMinute(minute);
		this.testerJour(jour);
		this.heure = heure;
		this.minute = minute;
		this.jour = jour;
	}

	public Duree()
	{
		this.heure = 0;
		this.jour = 0;
		this.minute = 0;
	}

	private void testerJour(int jour2) throws DureeIncorrecteException
	{
		if (jour < 0)
			throw new DureeIncorrecteException();
	}

	/**
	 * @param heureFin
	 *            heure à tester
	 * @return vrai l'heure en parametre est avant avant ou égale à l'heure
	 *         courante, faux sinon.
	 */
	public boolean avant(Duree heureFin)
	{
		if (this.heure > heureFin.heure)
			return false;
		else if (this.heure < heureFin.heure)
			return true;
		else
		{
			if (this.minute < heureFin.minute)
				return true;
			return true;
		}
	}

	/**
	 * @param minute
	 *            minute à tester
	 * @throws DureeIncorrecteException
	 */
	private void testerMinute(int minute) throws DureeIncorrecteException
	{
		if (minute < 0 || minute > 59)
			throw new DureeIncorrecteException();
	}

	/**
	 * @param heure
	 *            heure à tester
	 * @throws DureeIncorrecteException
	 */
	private void testerHeure(int heure) throws DureeIncorrecteException
	{
		if (heure > 23 || heure < 0)
			throw new DureeIncorrecteException();
	}

	/**
	 * @param duree
	 *            additionne cette durée à la durée courante
	 */
	public void ajouterDuree(Duree duree)
	{
		if (this.minute + duree.minute > 59)
		{
			this.minute = this.minute + duree.minute - 60;
			this.heure++;
		}
		else
			this.minute += duree.minute;

		if (this.heure + duree.heure > 23)
		{
			this.heure = this.heure + duree.heure - 24;
			this.jour++;
		}
		else
			this.heure += duree.heure;
		this.jour += duree.jour;

	}
}
