/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class Queue<T> {
    private Nodo first;
    int size;
    public Queue(){
        first = null;
        size =0;
    }
    public Object getFirst(){
        return first.getElement();
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void addToTheQueue(int x){
        Nodo pNew = new Nodo(x);
        pNew.setNext(this.first);
        this.first = pNew;
    }
    public Object unqueue(){
        Nodo temp = first;
        this.first = first.getNext();
        return temp.getElement();
    }
}
