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
public class NodoUser {
    private NodoUser next;
    private User element;

    public NodoUser(User element) {
        this.next = null;
        this.element = element;
    }

    /**
     * @return the next
     */
    public NodoUser getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoUser next) {
        this.next = next;
    }

    /**
     * @return the element
     */
    public User getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(User element) {
        this.element = element;
    }
}
