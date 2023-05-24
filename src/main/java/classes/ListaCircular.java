/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author carre
 */
public class ListaCircular {
    private Nodo first;
    private Nodo last;
    private int size;
    
    public ListaCircular(){
        first = null;
        last = null;
        size = 0;
    }
    public boolean isEmpty(){
        return first ==null;
    }
    public int getSize(){
        return size;
    }

    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }
    public void addAtTheEnd(int x){
        Nodo newValue = new Nodo(x);
        if (isEmpty())
        {
            this.setFirst(newValue);
            this.setLast(newValue);
            this.getLast().setNext(this.getFirst());
        }
        else{
            this.getLast().setNext(newValue);
            newValue.setNext(this.getFirst());
            this.setLast(newValue);
        }
        size++;
    }
    public void AddAtTheStart(int x){
        Nodo newValue = new Nodo(x);
        if (isEmpty())
        {
            this.setFirst(newValue);
            this.setLast(newValue);
            this.getLast().setNext(this.getFirst());
        }
        else{
           newValue.setNext(this.getFirst());
           this.setFirst(newValue);
           this.setLast(this.getFirst());
           
        }
        size++;
    }
}
