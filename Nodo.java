/*
 * Creacion de un nodo
 */
package estructurasdatos;

/**
 *
 * @author pzx64
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;//puntero del enlace
    //Constructor para insertar el final
    public Nodo(int d){
        this.dato = d;
        this.siguiente = null;
    }
    //Construcror para insertar el inicio
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
    }
}
