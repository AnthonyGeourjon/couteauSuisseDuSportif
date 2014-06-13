package interaction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

import exception.HeureIncorrecteException;
import exception.MatiereSaisieIncorrecteException;
import exception.NoteSaisieIncorrecteException;
import exception.RecetteDejaEnMemoireException;
import module_agenda.Evenement;
import module_agenda.Heure;
import module_alimentation.Aliment;
import module_alimentation.Recette;
import module_scolaire.Matiere;
import module_scolaire.Note;
import module_scolaire.UE;

/**
 * @author geourjoa
 * 
 */
public class InteractionConsole implements Interaction
{
	// ************************
	// ** Fonctions de base **
	// ************************

	@Override
	public int demanderUnInt()
	{
		// sc.close(); Leve l'exception "java.util.NoSuchElementException". Car
		// fermer un scanner ferme Systeme.in.
		// http://stackoverflow.com/questions/20739587/scanner-java-util-nosuchelementexception

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		return sc.nextInt();

	}

	@Override
	public String demanderUneChaineDeCaractere()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	
	
	@Override
	public float demanderUnFloat()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextFloat();
	}
	
	// ************************
	// ** Fonctions composées **
	// ************************
	
	
	

	@Override
	public Date demanderUneDate()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try
		{
			date = df.parse(sc.next());
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}

		return date;

	}

	@Override
	public interaction.Heure demanderUneHeure() throws HeureIncorrecteException
	{
		Scanner sc = new Scanner(System.in);
		
		
	}

	
}
