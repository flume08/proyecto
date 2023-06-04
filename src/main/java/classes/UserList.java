/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author David Mavares
 */
public class UserList {
    private NodoUser first; 
    private NodoUser last; 
    public int size; 
    
    public UserList(){ 
            this.first = null; 
            this.last = null; 
            this.size = 0; 
    }
    
    public boolean isEmpty(){
    return first == null; 
    }
    
    public void empty(){            
        this.first = null;            
        this.last = null;            
        this.size = 0;
    }
    public NodoUser first(){
        return this.first;
    }
    public NodoUser last(){
        return this.last;
    }
    public void insert(User x, NodoUser pValor){
        NodoUser newNodo = new NodoUser(x);
        if (this.first()==this.last()){
            newNodo.setNext(first);
            this.first = newNodo;
            size++;
        }else{
            if(pValor!=this.last){
                newNodo.setNext(pValor.getNext());
                pValor.setNext(newNodo);
                size++;
            }
        }
    }
    
    public void insertAtTheStart(User x){
        NodoUser newNodo = new NodoUser(x);
        if (!(this.last == this.first))
        {
        newNodo.setNext(this.first());
        this.first = newNodo;
        }
        else
        {
            this.first = newNodo;
            this.last = newNodo;
        }
        size++;
    }
    
    public void addAtTheEnd(NodoUser newNodo){        
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    
    public void deleteAtTheStart(){            
        if(!this.isEmpty()){                
            if (size == 1) {                    
                this.empty();                
            }
            else{                    
                first = first.getNext();                   
                size--;                
            }            
        }        
    }
    public void deleteNodo(NodoUser pValue){
        if (pValue == first())
        {
            this.first = this.first.getNext();
        }
        else
        {
            NodoUser temp = first();
            while(temp.getNext()!=pValue)
            {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }
    public User accessElement(int index){
        if (index==0 || index == -size){
            return this.first.getElement();
        }else{
        if(index> 0 && index <= this.size){
            int i = 0;
            NodoUser temp = this.first;
            while(i<index){
                temp = temp.getNext();
                i++;
            }
            return temp.getElement();
        }else if(index<0 && index > -size){
            return this.accessElement(index + size);
        }
        }
        System.out.println("Index out of range");
        return null;
        
    }
}
