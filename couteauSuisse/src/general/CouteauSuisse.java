package general;

import moduleSportEndurance.ModuleSportDEndurance;
import affichage.Affichage;
import affichage.AffichageConsole;
import interaction.Interaction;
import interaction.InteractionConsole;
import exception.ChoixIncorrectException;

/**
 * @author Anthony
 * 
 */
public class CouteauSuisse
{
	private Interaction interactionUtilise;

	private Affichage affichageUtilise;

	private ModuleSportDEndurance moduleVeloRoute;

	/**
	 * @param interactionUtilise
	 *            interaction de l'utilisateur
	 * @param affichageUtilise
	 *            affichage de l'utilisateur
	 */
	public CouteauSuisse(InteractionConsole interactionUtilise, AffichageConsole affichageUtilise)
	{
		this.affichageUtilise = affichageUtilise;
		this.interactionUtilise = interactionUtilise;
	}

	/**
	 * Utiliser le couteau-suisse et ses fonctionnalité
	 */
	public void utiliserCouteauSuisse()
	{
		Boolean application = true;

		this.affichageUtilise.afficherLeNomDeLApplication();

		while (application)
		{
			this.affichageUtilise.afficherMenuPrincipal();

			switch (this.interactionUtilise.demanderUnInt())
			{
			case 0:
				application = false;
				this.affichageUtilise.notifierArretApplication();
				break;
			case 1:
				this.moduleVeloRoute.utiliserModule();
				break;

			/* TODO Rajouter l'utilisation des autres modules + affichage */

			default:
				try
				{
					throw new ChoixIncorrectException();

				}
				catch (ChoixIncorrectException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
