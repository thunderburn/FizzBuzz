

/**
 * Created by valentindufermont on 28/03/2014.
 */
public class Jeu {

	public static String jouer(int nombre){
		String reponse = "";
		if(nombre/5 == 1){
			reponse = "Buzz";
		}
		else{
			if(nombre/3 == 1){
				reponse = "Fizz";
			}
			else{
				reponse = String.valueOf(nombre);
			}
			
		}
			
		return reponse;
		
	}
}

