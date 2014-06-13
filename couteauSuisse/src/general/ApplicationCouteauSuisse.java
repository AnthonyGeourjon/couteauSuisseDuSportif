package general;

import interaction.InteractionConsole;
import affichage.AffichageConsole;


/**
 * @author Anthony
 *
 */
public class ApplicationCouteauSuisse
{

	@SuppressWarnings("javadoc")
	public static void main(String[] args)
	{
		CouteauSuisse couteauSuisse = new CouteauSuisse(new InteractionConsole(), new AffichageConsole());
		
		couteauSuisse.utiliserCouteauSuisse();

	}

}
