import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author Ognjen Bosic - Loris Demicheli
 * @version 2.3
 */
public class Segreteria
{
    // Storage for an arbitrary number of notes.
    private ArrayList<Persona> persone;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Segreteria()
    {
        persone = new ArrayList<Persona>();
        // addTanti();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public boolean storeStudent(Persona persona)
    {
        if(persone.contains(persona)){
            return false;
        }
        else{
            persone.add(persona);
            return true;
        }
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfStudents()
    {
        return persone.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeStudents(int studentsNumber)
    {
        if(studentsNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else 
        if(studentsNumber < numberOfStudents()) {
            // This is a valid note number.
            persone.remove(studentsNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * Ricerca persone compresti tra i parameti
     * da modificare
     */
    public void searchByAge()
    {
        printPersons(new Controllo<Persona>()
            {
                public boolean test(Persona persona) 
                {
                    return persona.getEta() >= 18;
                }
            });
    }

    /** 
     * Stampa i persone
     */
    public void listNotes()
    {

        for(Persona persona : persone) {
            System.out.println(persona);
        }
    }

    /**
     * Stampa le persone che soddisfano il controllo
     *
     * @param check interfaccia con il controllo
     */
    private void  printPersons(Controllo check)
    {
        for(Persona persona : persone) {
            if(check.test(persona))
                System.out.println(persona.getNome());
        }

    }

    //     /**
    //      * Aggiunge persone nell'ArrayList
    //      */
    //     public void addTanti()
    //     {
    //         storeStudent(new Persona("Pippo","baudo","Via nono","ALexandria","AL","001",15));
    //         storeStudent(new Persona("gino","baudo","Via nono","ALexandria","AL","001",18));
    //         storeStudent(new Persona("paolo","baudo","Via nono","ALexandria","AL","001",16));
    //         storeStudent(new Persona("ploppo","baudo","Via nono","ALexandria","AL","001",20));
    //     }
}
