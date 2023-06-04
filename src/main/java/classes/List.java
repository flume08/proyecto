/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class List<T> { 
    private Nodo first; 
    private Nodo last; 
    private int size; 
    
    public List(){ 
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
    public Nodo first(){
        return this.first;
    }
    public Nodo last(){
        return this.last;
    }
    public Object accessElement(int index){
        if (index==0 || index == -size){
            return this.first.getElement();
        }else{
        if(index> 0 && index <= this.size){
            int i = 0;
            Nodo temp = this.first;
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
    public Nodo accessElementNodo(int index){
        if (index==0 || index == -size){
            return this.first;
        }else{
        if(index> 0 && index <= this.size){
            int i = 0;
            Nodo temp = this.first;
            while(i<index){
                temp = temp.getNext();
                i++;
            }
            return temp;
        }else if(index<0 && index > -size){
            return this.accessElementNodo(index + size);
        }
        }
        System.out.println("Index out of range");
        return null;
        
    }    
    public void insert(int x, Nodo pValor){
        Nodo newNodo = new Nodo(x);
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
    public void insertAtTheStart(T x){
        Nodo newNodo = new Nodo(x);
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
    public void addAtTheEnd(Nodo newNodo){        
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    public void addAtTheEndT(T x){
        Nodo newNodo = new Nodo(x);
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
    public void next(Nodo pValue){
        if(pValue!=last()){
            pValue = pValue.getNext();
        }
    }
    public void deleteIndex(int index){
        if (index == 0)
        {
            this.first = this.first.getNext();
        }
        else{
            Nodo temp = first();
            int contador = 0;
            while(contador < index-1)
            {
                temp = temp.getNext();
                contador++;
            }
            temp.setNext(temp.getNext().getNext());
            if (index == size-1){
                this.last = temp;
            }
        }
        size--;
    }
    public void deleteNodo(Nodo pValue){
        if (pValue == first())
        {
            this.first = this.first.getNext();
        }
        else
        {
            Nodo temp = first();
            while(temp.getNext()!=pValue)
            {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }
    public void print(){        
        Nodo temp = first; 
        if(this.isEmpty()){            
            System.out.println("The list is empty.");        
        }        
        while(temp != null){            
            System.out.println(temp.getElement());            
            temp = temp.getNext();        
        } 
    }
    public int getSize(){
        return this.size;
    }
    public List revertList(){
        List revertedList = new List();
        for(int i= this.getSize(); i > 0;i--){
        Object x = this.accessElement(i);
        Nodo temp = new Nodo(x);
        revertedList.addAtTheEnd(temp);
        }
        return revertedList;
    }
    public void deleteIntN(T x){
        int i = 0;
        while(i<this.size){
        if (x == this.accessElement(i))
            {
            this.deleteIndex(i);
            i--;
            }
        i++;
        }
    }
    public List countFrecuency(){
        List list = new List();
        List list2 = new List();
        list2= this;
        int i = 0;
        while(i<list2.size){
            int j = 0;
            int k = 0;
            while(j< size){
                if(list2.accessElement(i)==list2.accessElement(j)){
                    k++;
                }
                j++;
            }list.addAtTheEndT(k);
                list2.deleteIntN(list2.accessElement(i));
        }
        return list;
    }
    public void changeNforV(Object n, int v){
        int i = 0;
        while(i<size){
            if (this.accessElement(i)== n){
                this.accessElementNodo(i).setElement(v);
            } 
            i++;
        }
    }
    public void switchPositions (int index1, int index2){
        Object temp;
        temp = this.accessElement(index1);
        this.accessElementNodo(index1).setElement(this.accessElement(index2));
        this.accessElementNodo(index2).setElement(temp);
    }
    
    public int solution(List list1, List list2){
        int siz;
        int l = 0;
        int k = 0;
        if (list1.getSize() < list2.getSize()){
            siz = list2.getSize();
            for(int i=0;i<list2.getSize()-siz;i++){
                l = 0;
                if (list1.first().getElement() == list2.accessElement(i)){
                    k =0;
                    for(int j =0;j<siz;j++){
                        if(list1.accessElement(j) == list2.accessElement(i+j)){
                        k++;
                        }
                    }
                }
                if(k==siz){
                    l++;
                }
            }
        }else{
            siz = list1.getSize();
            for(int i=0;i<list1.getSize()-siz;i++){
                l = 0;
                if (list2.first().getElement() == list1.accessElement(i)){
                    k =0;
                    for(int j =0;j<siz;j++){
                        if(list2.accessElement(j) == list1.accessElement(i+j)){
                        k++;
                        }
                    }
                }
                if(k==siz){
                    l++;
                }
            }
        }
        return l;
}
}