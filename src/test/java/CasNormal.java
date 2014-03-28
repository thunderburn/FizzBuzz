import static org.junit.Assert.*;

import org.junit.Test;


public class CasNormal {

	@Test
	public void casNormal() {
		Jeu jeu = new Jeu();
		String reponse = jeu.jouer(2);
		assertEquals("2", reponse);
	}
	
	@Test
	public void casMultiple5(){
		Jeu jeu = new Jeu();
		String reponse = jeu.jouer(20);
		assertEquals("Buzz", reponse);
	}
	
	@Test
	public void casMultiple3(){
		Jeu jeu = new Jeu();
		String reponse = jeu.jouer(3);
		assertEquals("Fizz", reponse);
	}

}
