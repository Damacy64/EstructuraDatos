/*
 * Implementacion de una lista enlazada simple con ayuda de la clase
 * Nodo anteriormente creada
 */
package estructurasdatos;

/**
 *
 * @author pzx64
 */
public class Lista {
    protected Nodo inicio, fin; //punteros de la lista
    public Lista(){
        inicio = null;
        fin = null;
    }
    //Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        } else{
            return false;
        }
    }
    //Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        //Creando un nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    //Metodo para insertar al final de la lista
    public void agregarAlFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else{
            inicio = fin = new Nodo(elemento);
        }
    }
    //Metodo para mostrar los datos de la lista
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer != null){
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        }
    }
}
