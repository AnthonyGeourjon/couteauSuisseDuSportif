package affichage;

/**
 * @author geourjoa
 * 
 */
public interface Affichage
{
	/**
	 * Demander un choix num�rique
	 */
	public abstract void demanderUnChoix();

	/**
	 * Afficher le nom de l'application
	 */
	public abstract void afficherLeNomDeLApplication();

	/**
	 * Demander un nom
	 */
	public abstract void demanderUneChaineDeCaractere();

	/**
	 * Dire � l'utilisateur qu'une fonction n'est pas disponible
	 */
	public abstract void messageDErreur();

	/**
	 * Afficher le menu principal
	 */
	public abstract void afficherMenuPrincipal();

	/**
	 * Montrer � l'utilisateur que l'action s'est bien d�roul�e
	 */
	public abstract void notifierActionReussie();

	/**
	 * Demander une date � l'utilisateur
	 */
	public abstract void demanderUneDate();

	/**
	 * Montrez � l'utilisateur que l'action � echou�
	 */
	public abstract void notifierEchec();

	/**
	 * Montrer � l'utilisateur que l'application se termine
	 */
	public abstract void notifierArretApplication();

	/**
	 * Afficher le menu v�lo route
	 */
	public abstract void afficherMenuVeloRoute();

}
