

/**
 * Created by valentindufermont on 28/03/2014.
 */
public class Jeu {

	public String jouer(int nombre){
		String reponse = "";
		if(nombre%5 == 0){
			reponse = "Buzz";
		}
		else{
			if(nombre%3 == 0){
				reponse = "Fizz";
			}
			else{
				reponse = String.valueOf(nombre);
			}
			
		}
			
		return reponse;
		
	}
}

