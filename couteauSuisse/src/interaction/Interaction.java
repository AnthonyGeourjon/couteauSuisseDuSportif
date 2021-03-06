package interaction;

import java.util.Date;

import divers.Duree;
import exception.DureeIncorrecteException;

/**
 * @author Anthony 
 *  M�thode d'interaction par la console avec l'utilisateur
 */
public interface Interaction
{
	/**
	 * @return Demande un nombre � l'utilisateur
	 */
	public abstract int demanderUnInt();

	/**
	 * @return un flotant saisie par l'utilisateur
	 */
	public float demanderUnFloat();

	/**
	 * @return une chaine de caractere
	 */
	public abstract String demanderUneChaineDeCaractere();

	/**
	 * @return une date saisie par l'utilisateur
	 */
	public abstract Date demanderUneDate();

	/**
	 * @return une date saisie par l'utilisateur
	 * @throws DureeIncorrecteException
	 *             lev�e si l'heure est incorrecte
	 */
	public abstract Duree demanderUneHeure() throws DureeIncorrecteException;

}
