
/**
 * Classe che contiene i dati di uno studente
 * 
 * @author Loris Demicheli  
 * @version 3.1
 */
public abstract class Persona
{
    private CodiceFiscale codice;
    private String nome;
    private String cognome;
    private String citta;
    private String provincia;
    private String annoDiNascita;
    private Sesso sesso;
    private String codiceFiscale;
    private int eta;

    public enum Sesso {
        MALE, FEMALE
    }

    /**
     * Inizializza i dati di uno studente in base ai parametri
     */
    public Persona(String nome, String cognome, String citta, String provincia, String annoDiNascita, Sesso sesso)
    {
        this.nome = nome.toUpperCase();
        this.cognome = cognome.toUpperCase();
        this.citta = citta.toUpperCase();
        this.provincia = provincia.toUpperCase();
        this.annoDiNascita = annoDiNascita;
        this.sesso = sesso;
        codice = new CodiceFiscale(this);
        codiceFiscale = codice.getCodiceFiscale();
        eta=2017-Integer.parseInt(getAnno());
    }
    
    /**
     * Cambia il nome
     * 
     * @param nome il nuovo nome
     */
    public void setNome(String nome)
    {
        this.nome = nome.toUpperCase();
    }

    /**
     * Cambia il cognome
     * 
     * @param cognome il nuovo cognome
     */
    public void setCognome(String cognome)
    {
        this.cognome = cognome.toUpperCase();
    }

    /**
     * Cambia la citta
     * 
     * @param citta la nuova citta
     */
    public void setCitta(String citta)
    {
        this.citta = citta.toUpperCase();
    }

    /**
     * Cambia la provincia
     * 
     * @param provincia la nuova provincia
     */
    public void setProvincia(String provincia)
    {
        this.provincia = provincia.toUpperCase();
    }

    /**
     * Cambia l'anno di nascita
     * 
     * @param annoDiNascita il nuovo anno di nascita
     */
    public void setAnnoDiNascita(String annoDiNascita)
    {
        this.annoDiNascita = annoDiNascita;
    }

    /**
     * cambia il sesso
     * 
     * @param sesso il sesso del'studente
     */
    public void setSesso(Sesso sesso)
    {
        this.sesso = sesso;
    }

    /**
     * 
     *
     * @return  nome   il valore restituito
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * 
     *
     * @return   cognome  il valore restituito
     */
    public String getCognome()
    {
        return cognome;
    }

    /**
     * 
     *
     * @return  citta   il valore restituito
     */
    public String getCitta()
    {
        return citta;
    }

    /**
     * 
     *
     * @return  provincia   il valore restituito
     */
    public String getProvicia()
    {
        return provincia;
    }

    /**
     * 
     *
     * @return  annoDiNascita   il valore restituito
     */
    public String getAnnoDiNascita()
    {
        return annoDiNascita;
    }

    /**
     * 
     *
     * @return  anno il giorno della data di nascita
     */
    public String getGiorno()
    {
        String anno[];
        anno = annoDiNascita.split("/");
        return anno[0];
    }

    /**
     * 
     *
     * @return  anno il mese della data di nascita
     */
    public String getMese()
    {
        String anno[];
        anno = annoDiNascita.split("/");
        return anno[1];
    }

    /**
     * 
     *
     * @return  anno l'anno della data di nascita
     */
    public String getAnno()
    {
        String anno[];
        anno = annoDiNascita.split("/");
        return anno[2];
    }

    /**
     * 
     *
     * @return eta   il valore restituito
     */
    public int getEta()
    {
        return eta;
    }
    
    /**
     * 
     *
     * @return sesso    il valore restituito
     */
    public Sesso getSesso()
    {
        return sesso;
    }

    /**
     * 
     *
     * @return codiceFiscale    il valore restituito
     */
    public String getCodiceFiscale()
    {
        return codiceFiscale;
    }

    /**
     * stampa il nome
     */
    public void print()
    {
        System.out.println("il Nome");
    }

    /**
     * Esegue un controllo sul coide fiscali di uno studente
     *
     * @param  Object - lo studente da conftontare
     * @return true se i codici sono uguali, false se non lo sono 
     */
    public boolean equals(Object obj)
    {
        if(obj == null ) return false;
        if(obj instanceof Studente){
            Studente studente = (Studente)obj;
            return this.codiceFiscale.equals(studente.getCodiceFiscale());
        }
        else{
            return false;
        }
    }

}
