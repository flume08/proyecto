/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 * Clase Queue que representa una cola.
 */
public class Queue {
    private Nodo first;
    int size;
        /**
     * Crea una nueva instancia de la clase Queue.
     * Inicializa la cola como vacía.
     */
    public Queue(){
        first = null;
        size =0;
    }
        /**
     * Obtiene el primer elemento de la cola.
     *
     * @return el primer elemento de la cola
     */
    public int getFirst(){
        return first.getElement();
    }
     /* Verifica si la cola está vacía.
     *
     * @return true si la cola está vacía, false de lo contrario
     */
    public boolean isEmpty(){
        return first == null;
    }
        /**
     * Agrega un elemento a la cola.
     *
     * @param x el elemento a agregar a la cola
     */
    public void addToTheQueue(int x){
        Nodo pNew = new Nodo(x);
        pNew.setNext(this.first);
        this.first = pNew;
    }
        /**
     * Elimina y retorna el primer elemento de la cola.
     *
     * @return el primer elemento de la cola
     */
    public int unqueue(){
        Nodo temp = first;
        this.first = first.getNext();
        return temp.getElement();
    }
}
