
/**
 * Interfaccia generica per i controlli
 * @author Bosic-Demicheli
 * @version v2.0
 */

public interface Controllo<T>
{
    /** 
     * @param  t oggetto su cui effetuare il test
     * @return l'esito del controllo
     */
   boolean test(T t);
}
