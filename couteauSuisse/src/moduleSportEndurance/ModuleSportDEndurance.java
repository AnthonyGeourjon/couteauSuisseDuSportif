package moduleSportEndurance;

import java.util.Date;
import java.util.Hashtable;

import affichage.Affichage;
import interaction.Interaction;
import exception.ChoixIncorrectException;
import general.Module;

/**
 * @author Anthony
 * 
 */
public class ModuleSportDEndurance implements Module
{

	private Interaction interactionUtilise;

	private Affichage affichageUtilise;

	private CarnetDeSortie carnetDeSortieDEntrainement;

	/**
	 * @param interactionUtilise
	 * @param affichageUtilise
	 */
	public ModuleSportDEndurance(Interaction interactionUtilise, Affichage affichageUtilise)
	{
		this.affichageUtilise = affichageUtilise;
		this.interactionUtilise = interactionUtilise;
		this.carnetDeSortieDEntrainement = new CarnetDeSortie();
	}

	@Override
	public void utiliserModule()
	{
		Boolean application = true;

		while (application)
		{
			affichageUtilise.afficherMenuVeloRoute();

			switch (interactionUtilise.demanderUnInt())
			{
			case 0:
				application = false;
				break;
			case 1:
				break;
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
