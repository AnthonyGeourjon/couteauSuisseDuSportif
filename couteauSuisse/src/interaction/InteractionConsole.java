package interaction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import divers.Duree;
import exception.DureeIncorrecteException;


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
	public Duree demanderUneHeure() throws DureeIncorrecteException
	{		
		return new Duree(this.demanderUnInt(), this.demanderUnInt());		
	}

	
}
