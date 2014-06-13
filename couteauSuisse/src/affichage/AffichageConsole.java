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
		System.out.println("*****************************************\n" + "   Le couteau suisse de l'etudiant :\n"
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
				+ "\n1-Module alimentation, \n2-Module scolaire, \n3-Module agenda, \n4-Module budget\n0-Quitter.\n");

	}

	@Override
	public void notifierActionReussie()
	{
		System.out.println("Op�ration effectu�e avec succes. \n\n");
	}

	@Override
	public void demanderUneDate()
	{
		System.out.println("Saisissez une date sous la forme jj-mm-aaaa : \n");

	}

	@Override
	public void notifierEchec()
	{
		System.out.println("Echec de l'op�ration.");
	}

	@Override
	public void notifierArretApplication()
	{
		System.out.println("Application termin�e.");
	}

	@Override
	public void demanderUnChoix()
	{
		// TODO Auto-generated method stub

	}

}
