package affichage;

/**
 * @author geourjoa
 * 
 */
public interface Affichage
{
	/**
	 * Demander un choix numérique
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
	 * Dire à l'utilisateur qu'une fonction n'est pas disponible
	 */
	public abstract void messageDErreur();

	/**
	 * Afficher le menu principal
	 */
	public abstract void afficherMenuPrincipal();

	/**
	 * Montrer à l'utilisateur que l'action s'est bien déroulée
	 */
	public abstract void notifierActionReussie();

	/**
	 * Demander une date à l'utilisateur
	 */
	public abstract void demanderUneDate();

	/**
	 * Montrez à l'utilisateur que l'action à echoué
	 */
	public abstract void notifierEchec();

	/**
	 * Montrer à l'utilisateur que l'application se termine
	 */
	public abstract void notifierArretApplication();

	/**
	 * Afficher le menu vélo route
	 */
	public abstract void afficherMenuVeloRoute();

}
