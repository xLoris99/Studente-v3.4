
/**
 * Classe che va a leggere un file contenete i catasti di varie province e nazioni
 * 
 * @author Loris Demicheli 
 * @version 3.1
 */
public class Codici
{
    private String citta;
    private String provincia;
    private String codice;

    /**
     * costrutore per gli studenti italiani
     */
    public Codici(String citta, String provincia, String codice)
    {
        this.citta = citta;
        this.provincia = provincia;
        this.codice = codice;
    }

     /**
     * costrutore per gli studenti stranieri
     */
    public Codici(String citta, String codice)
    {
        this.citta = citta;
        this.codice = codice;
    }

    /**
     * @return citta
     */
    public String getCitta()
    {
        return citta;
    }

    /**
     * @return provincia
     */
    public String getProvincia()
    {
        return provincia;
    }

    /**
     * @return codice
     */
    public String getCodice()
    {
        return codice;
    }
}
