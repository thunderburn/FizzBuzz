/**
 * Created by valentindufermont on 28/03/2014.
 */
public class FizzBuzz {

        public String[] nombreFizzBuzz()
        {
            String[] tableauFizzBuzz = new String[100];

            for(int i = 1; i < 100; i++)
            {
                tableauFizzBuzz[i] = jouer(i);
                System.out.println(tableauFizzBuzz[i]);
            }

            return tableauFizzBuzz;
        }

        public String jouer(int nombre)
        {
            String FizzOuPas = "" ;

            if (nombre %5 == 0 && nombre %3 == 0)
            {
                FizzOuPas = "FizzBuzz";
            }
            else if (nombre % 3 == 0)
            {
                FizzOuPas = "Fizz";
            }
            else if (nombre %5 == 0)
            {
                FizzOuPas = "Buzz";
            }
            else
            {
                FizzOuPas = String.valueOf(nombre);
            }

            return FizzOuPas;

        }
}
