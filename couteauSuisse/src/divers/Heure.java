package divers;

import exception.HeureIncorrecteException;

/**
 * 
 * @author Valentin
 * 
 */

public class Heure
{

	private int minute;

	private int heure;

	/**
	 * @return la minute de l'heure
	 */
	public int obtenirMinute()
	{
		return this.minute;
	}

	/**
	 * @return l'heure
	 */
	public int obtenirHeure()
	{
		return this.heure;
	}

	/**
	 * @param minute
	 *            nouvelle minute
	 * @throws HeureIncorrecteException
	 *             levé si la minute n'est pas correcte
	 */
	public void modifierMinute(int minute) throws HeureIncorrecteException
	{
		this.testerMinute(minute);
		this.minute = minute;
	}

	/**
	 * @param heure
	 *            nouvelle heure
	 * @throws HeureIncorrecteException
	 *             levé si l'heure en parametre est correcte
	 */
	public void modifierHeure(int heure) throws HeureIncorrecteException
	{
		if (heure > 23 || heure < 0)
			throw new HeureIncorrecteException();

		this.heure = heure;
	}

	/**
	 * @param heure heure de l'heure
	 * @param minute minute de l'heure
	 * @throws HeureIncorrecteException levée si heure incorrecte
	 */
	public Heure(int heure, int minute) throws HeureIncorrecteException
	{
		this.testerHeure(heure);
		this.testerMinute(minute);
		this.heure = heure;
		this.minute = minute;
	}

	/**
	 * @param heureFin
	 *            heure à tester
	 * @return vrai l'heure en parametre est avant avant ou égale à l'heure
	 *         courante, faux sinon.
	 */
	public boolean avant(Heure heureFin)
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
	 * @throws HeureIncorrecteException
	 */
	private void testerMinute(int minute) throws HeureIncorrecteException
	{
		if (minute < 0 || minute > 59)
			throw new HeureIncorrecteException();
	}

	/**
	 * @param heure
	 *            heure à tester
	 * @throws HeureIncorrecteException
	 */
	private void testerHeure(int heure) throws HeureIncorrecteException
	{
		if (heure > 23 || heure < 0)
			throw new HeureIncorrecteException();
	}

}
