
/**
 * Classe che contiene i dati di uno studente
 * 
 * @author Loris Demicheli - Ognjen Bosic
 * @version 3.1
 */
public class Studente extends Persona
{
    /**
     * Inizializza i dati di uno studente in base ai parametri
     */
    public Studente(String nome, String cognome, String citta, String provincia, String annoDiNascita, Sesso sesso)
    {
        super(nome,cognome,citta,provincia,annoDiNascita,sesso);
    }
}
