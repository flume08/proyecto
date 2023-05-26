/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class Stack {
    private Nodo top;
    private int size;
    public Nodo getTop() {
        return top;
    }

    public int getSize(){
        return this.getSize();
    }

    public Stack() {
        size = 0;
        top = null;
    }
    public void destructor(){
        while(top != null){
            Nodo temp = this.getTop();
            this.top = getTop().getNext();
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void pileUp(int x){
        Nodo pNew = new Nodo(x);
        pNew.setNext(this.top);
        this.top = pNew;
        size++;
    }
    public int unstack(){
        Nodo temp = this.top;
        this.top = this.top.getNext();
        size--;
        return temp.getElement();
    }
    public int peek(){
        return this.top.getElement();
    }
}
