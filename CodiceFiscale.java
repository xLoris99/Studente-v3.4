import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
/**
 * Classe che crea un nuovo codice fiscale
 * 
 * @author Loris Demicheli
 * @version 3.1
 */
public class CodiceFiscale
{
    private Persona persona;
    private ArrayList<String> mesi;
    private ArrayList<String> consonanti;
    private ArrayList<String> vocali;
    private ArrayList<Codici> codici;
    private ArrayList<Codici> esteri;
    private Map<String, Integer> dispari;
    private Map<String, Integer> pari;
    private Map<Integer, String> resto;

    /**
     * Aggiunge i dati di uno persona in delle liste
     */
    public CodiceFiscale(Persona persona)
    {
        this.persona = persona;
        mesi = new ArrayList(12);
        consonanti = new ArrayList(21);
        vocali = new ArrayList(5);
        codici = new ArrayList();
        esteri = new ArrayList();
        dispari = new HashMap();
        pari = new HashMap();
        resto = new HashMap();
        consonanti();
        vocali();
        mesi();
        pari();
        dispari();
        resto();
        try{
            letturaCodici();
        }catch(Exception e){}
    }

    /**
     * lettura di un file con: citta, provincia e codice catastale 
     */
    private void letturaCodici() throws FileNotFoundException, IOException
    {
        BufferedReader italiani = new BufferedReader(new FileReader("codiciCatastali.txt"));
        String line = italiani.readLine();
        while(line!=null) {
            String[] tutto = line.split("\t");
            codici.add(new Codici(tutto[0],tutto[1],tutto[2]));
            line = italiani.readLine();
        }
        BufferedReader letturaEsteri = new BufferedReader(new FileReader("codiciCatastaliEsteri.txt"));
        line = letturaEsteri.readLine();
        while(line!=null) {
            String[] tutto = line.split("\t");
            esteri.add(new Codici(tutto[0],tutto[1]));
            line = letturaEsteri.readLine();
        }
    }

    /**
     * Aggiunta consonanti
     */
    private void consonanti()
    {
        consonanti.add("B");
        consonanti.add("C");
        consonanti.add("D");
        consonanti.add("F");
        consonanti.add("G");
        consonanti.add("H");
        consonanti.add("L");
        consonanti.add("M");
        consonanti.add("N");
        consonanti.add("P");
        consonanti.add("Q");
        consonanti.add("R");
        consonanti.add("S");
        consonanti.add("T");
        consonanti.add("V");
        consonanti.add("Z");
        consonanti.add("J");
        consonanti.add("K");
        consonanti.add("W");
        consonanti.add("X");
        consonanti.add("Y");
    }

    /**
     * Aggiunta vocali
     */
    private void vocali()
    {
        vocali.add("A");
        vocali.add("E");
        vocali.add("I");
        vocali.add("O");
        vocali.add("U");
    }

    /**
     * Aggiunta mesi
     */
    private void mesi()
    {
        mesi.add("A");
        mesi.add("B");
        mesi.add("C");
        mesi.add("D");
        mesi.add("E");
        mesi.add("H");
        mesi.add("L");
        mesi.add("M");
        mesi.add("P");
        mesi.add("R");
        mesi.add("S");
        mesi.add("T");
    }

    /**
     * Aggiunta numeri dispari
     */
    private void dispari()
    {
        dispari.put("0", 1);
        dispari.put("1", 0);
        dispari.put("2", 5);
        dispari.put("3", 7);
        dispari.put("4", 9);
        dispari.put("5", 13);
        dispari.put("6", 15);
        dispari.put("7", 17);
        dispari.put("8", 19);
        dispari.put("9", 21);
        dispari.put("A", 1);
        dispari.put("B", 0);
        dispari.put("C", 5);
        dispari.put("D", 7);
        dispari.put("E", 9);
        dispari.put("F", 13);
        dispari.put("G", 15);
        dispari.put("H", 17);
        dispari.put("I", 19);
        dispari.put("J", 21);
        dispari.put("K", 2);
        dispari.put("L", 4);
        dispari.put("M", 18);
        dispari.put("N", 20);
        dispari.put("O", 11);
        dispari.put("P", 3);
        dispari.put("Q", 6);
        dispari.put("R", 8);
        dispari.put("S", 12);
        dispari.put("T", 14);
        dispari.put("U", 16);
        dispari.put("V", 10);
        dispari.put("W", 22);
        dispari.put("X", 25);
        dispari.put("Y", 24);
        dispari.put("Z", 23);
    }

    /**
     * Aggiunta numeri pari
     */
    private void pari()
    {
        pari.put("0", 0);
        pari.put("1", 1);
        pari.put("2", 2);
        pari.put("3", 3);
        pari.put("4", 4);
        pari.put("5", 5);
        pari.put("6", 6);
        pari.put("7", 7);
        pari.put("8", 8);
        pari.put("9", 9);
        pari.put("A", 0);
        pari.put("B", 1);
        pari.put("C", 2);
        pari.put("D", 3);
        pari.put("E", 4);
        pari.put("F", 5);
        pari.put("G", 6);
        pari.put("H", 7);
        pari.put("I", 8);
        pari.put("J", 9);
        pari.put("K", 10);
        pari.put("L", 11);
        pari.put("M", 12);
        pari.put("N", 13);
        pari.put("O", 14);
        pari.put("P", 15);
        pari.put("Q", 16);
        pari.put("R", 17);
        pari.put("S", 18);
        pari.put("T", 19);
        pari.put("U", 20);
        pari.put("V", 21);
        pari.put("W", 22);
        pari.put("X", 23);
        pari.put("Y", 24);
        pari.put("Z", 25);
    }

    /**
     * Inserisce le lettere dell'alfabeto in un hashmap
     */
    private void resto()
    {
        resto.put(0 ,"A");
        resto.put(1 ,"B");
        resto.put(2 ,"C");
        resto.put(3 ,"D");
        resto.put(4 ,"E");
        resto.put(5 ,"F");
        resto.put(6 ,"G");
        resto.put(7 ,"H");
        resto.put(8 ,"I");
        resto.put(9 ,"J");
        resto.put(10 ,"K");
        resto.put(11 ,"L");
        resto.put(12 ,"M");
        resto.put(13 ,"N");
        resto.put(14 ,"O");
        resto.put(15 ,"P");
        resto.put(16 ,"Q");
        resto.put(17 ,"R");
        resto.put(18 ,"S");
        resto.put(19 ,"T");
        resto.put(20 ,"U");
        resto.put(21 ,"V");
        resto.put(22 ,"W");
        resto.put(23 ,"X");
        resto.put(24 ,"Y");
        resto.put(25 ,"Z");
    }

    /**
     * Prende le prime tre consonati e le restiuisce
     * return le 3 consonanti
     */
    private String cifreCognome()
    {
        String cifre="";
        int cont=0;
        String persona = this.persona.getCognome();
        for(int i=0;i<persona.length();i++){
            if(cont<3){
                if(consonanti.contains("" + persona.charAt(i))){
                    cifre = cifre.concat("" + persona.charAt(i));
                    cont++;
                }
            }
        }
        if(cont<3){
            for(int i=0;i<persona.length();i++){
                if(cont<3){
                    if(vocali.contains("" + persona.charAt(i))){
                        cifre = cifre.concat("" + persona.charAt(i));
                        cont++;
                    }
                }
            }
            if(cont<3){
                for(int i=cont;i<3;i++){
                    cifre = cifre.concat("X");
                }
            }
        }
        return cifre.toUpperCase();
    }

     /**
     * Prende le prime tre consonati e le restiuisce
     * in caso non ci siano abbastanza consonanti prende le vocali
     * return le 3 consonanti
     */
    private String cifreNome()
    {
        String cifre="";
        int contConsonanti=0;
        int cont=0;
        String persona = this.persona.getNome();
        for(int i=0;i<persona.length();i++){
            if(consonanti.contains(""+ persona.charAt(i))){
                contConsonanti++;
            }
        }
        for(int i=0;i<persona.length();i++){
            // piu di 4 consonanti
            if(contConsonanti > 3){
                if(cont<4){
                    if(cont==1){
                        cont++;
                    }
                    else{
                        if(consonanti.contains("" + persona.charAt(i))){
                            cifre = cifre.concat("" + persona.charAt(i));
                            cont++;
                        }
                    }
                }
            }
            // 3 consonanti
            else{
                if(cont<3){
                    if(consonanti.contains("" + persona.charAt(i))){
                        cifre = cifre.concat("" + persona.charAt(i));
                        cont++;
                    }
                }
            }   
        }
        if(cont<3){
            for(int i=0;i<persona.length();i++){
                if(cont<3){
                    if(vocali.contains("" + persona.charAt(i))){
                        cifre = cifre.concat("" + persona.charAt(i));
                        cont++;
                    }
                }
            }
            if(cont<3){
                for(int i=cont;i<3;i++){
                    cifre = cifre.concat("X");
                }
            }
        }
        return cifre.toUpperCase();
    }

    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    private String cifreAnno()
    {
        int anno = Integer.parseInt(persona.getAnno());
        if(anno<2000){
            return "" + (anno - 1900);
        }
        else{
            if(anno==2000){
                return "00";
            }
            if(anno<2010){
                return "0" + (anno - 2000);
            }
            return "" + (anno - 2000);
        }
    }

    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    private String cifreMese()
    {
        return mesi.get(Integer.parseInt(persona.getMese()) -1 );
    }

    /**
     * Esempio di metodo - sostituisci questo commento con i tuoi
     *
     * @param  y   un parametro di esempio per un metodo
     * @return     il valore restituito
     */
    private String cifreGiorno()
    {
        int giorno = Integer.parseInt(persona.getGiorno());
        if(persona.getSesso() == Persona.Sesso.FEMALE){
            giorno = giorno + 40;
        }
        if(giorno < 10){
            return "0" + giorno;
        }
        return "" + giorno;
    }

    /**
     * return le cifre assegnate alla propria provincia o nazione
     */
    private String cifreCatasto()
    {
        boolean ver=false;
        for(int i=0;i<codici.size();i++){
            if(codici.get(i).getCitta().equals(persona.getCitta()) && codici.get(i).getProvincia().equals(persona.getProvicia())){
                ver=true;
                return codici.get(i).getCodice();
            }
        }
        if(ver==false){
            for(int i=0;i<esteri.size();i++){
                if(esteri.get(i).getCitta().equals(persona.getCitta())){
                    return esteri.get(i).getCodice();
                }
            }
        }
        return "";
    }

    /**
     * return il resto della somma di tutte le lettere / 26
     */
    private String cifreCarattereControllo()
    {
        String codice = getCodice().toUpperCase();
        int valore=0;
        for(int i=1;i <= codice.length();i++){
            if(i%2==0){
                valore = valore + pari.get("" + codice.charAt(i-1));
            }
            else{
                valore = valore + dispari.get("" + codice.charAt(i-1));
            }
        }
        return resto.get(valore%26);
    }

    /**
     * return il codice fiscale senza l'ultima lettera
     */
    private String getCodice()

    {
        return cifreCognome() + cifreNome() + cifreAnno() + cifreMese() + cifreGiorno() + cifreCatasto();
    }

    /**
     * return il codice fiscale 
     */
    public String getCodiceFiscale(){
        return cifreCognome() + cifreNome() + cifreAnno() + cifreMese() + cifreGiorno() + cifreCatasto() + cifreCarattereControllo();
    }
}

