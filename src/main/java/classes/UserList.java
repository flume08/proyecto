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
/**
 * Clase UserList que representa una lista de usuarios.
 */
public class UserList {
    private NodoUser first; 
    private NodoUser last; 
    public int size; 
    /**
     * Crea una nueva instancia de la clase UserList.
     * Inicializa la lista como vacía.
     */
    public UserList(){ 
            this.first = null; 
            this.last = null; 
            this.size = 0; 
    }
    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario
     */
    public boolean isEmpty(){
    return first == null; 
    }
    /**
     * Vacía la lista, eliminando todos los nodos y estableciendo el tamaño a cero.
     */
    public void empty(){            
        this.first = null;            
        this.last = null;            
        this.size = 0;
    }
    /**
     * Obtiene el primer nodo de la lista.
     *
     * @return el primer nodo de la lista
     */
    public NodoUser first(){
        return this.first;
    }
     /**
     * Obtiene el último nodo de la lista.
     *
     * @return el último nodo de la lista
     */
    public NodoUser last(){
        return this.last;
    }
     /**
     * Inserta un nuevo nodo con el usuario dado después del nodo especificado.
     * Si el nodo especificado es el último nodo de la lista, el nuevo nodo se agrega al final de la lista.
     *
     * @param x el usuario a insertar en el nuevo nodo
     * @param pValor el nodo después del cual se debe insertar el nuevo nodo
     */
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
     /**
     * Inserta un nuevo nodo con el usuario dado al principio de la lista.
     *
     * @param x el usuario a insertar en el nuevo nodo
     */
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
    /**
     * Agrega un nuevo nodo al final de la lista.
     *
     * @param newNodo el nodo a agregar al final de la lista
     */
    public void addAtTheEnd(NodoUser newNodo){        
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    /**
     * Elimina el primer nodo de la lista.
     */
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
    /**
     * Elimina el nodo especificado de la lista.
     *
     * @param pValue el nodo a eliminar
     */
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
     /**
     * Accede al elemento en el índice especificado.
     *
     * @param index el índice del elemento a acceder
     * @return el usuario en el índice especificado
     */
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
