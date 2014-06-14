package affichage;

/**
 * @author geourjoa
 * 
 */
public class AffichageConsole implements Affichage
{
	@Override
	public void afficherLeNomDeLApplication()
	{
		System.out.println("*****************************************\n" + "  Couteau-suisse du sportif :\n"
				+ "*****************************************\n");
	}

	@Override
	public void demanderUneChaineDeCaractere()
	{
		System.out.println("Saisissez un nom :\n");

	}

	@Override
	public void messageDErreur()
	{
		System.out.println("Cette fonction n'est pas disponible pour l'instant.\n");
	}

	@Override
	public void afficherMenuPrincipal()
	{
		System.out.println("==========================\n" + "     Menu principal : \n" + "==========================\n"
				+ "\n1-Module vélo route\n0-Quitter.\n");

	}

	@Override
	public void notifierActionReussie()
	{
		System.out.println("Opération effectuée avec succes. \n\n");
	}

	@Override
	public void demanderUneDate()
	{
		System.out.println("Saisissez une date sous la forme jj-mm-aaaa : \n");

	}

	@Override
	public void notifierEchec()
	{
		System.out.println("Echec de l'opération.");
	}

	@Override
	public void notifierArretApplication()
	{
		System.out.println("Application terminée.");
	}

	@Override
	public void demanderUnChoix()
	{
		System.out.println("Saisissez le numéro de la fonction désirée : ");
	}
	
	@Override
	public void afficherMenuVeloRoute()
	{
		// TODO Auto-generated method stub		
	}

}
