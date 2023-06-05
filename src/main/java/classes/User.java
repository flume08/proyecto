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
public class User {
    
    private String username;
    private int numberOfRelation;
    private List Relations;
    /**
     * Constructor de la clase User.
     * 
     * @param username El nombre de usuario del usuario.
     * @param numberOfRelation El número de relaciones del usuario.
     */

    public User(String username, int numberOfRelation) {
        this.username = username;
        this.numberOfRelation = numberOfRelation;
    }
    
    /**
     * Obtiene el nombre de usuario del usuario.
     * 
     * @return El nombre de usuario.
     */

    public String getUsername() {
        return username;
    }
/**
     * Obtiene el nombre de usuario del usuario.
     * 
     * @return El nombre de usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Obtiene el número de relaciones del usuario.
     * 
     * @return El número de relaciones.
     */

    public int getNumberOfRelation() {
        return numberOfRelation;
    }
    /**
     * Establece el número de relaciones del usuario.
     * 
     * @param numberOfRelation El número de relaciones a establecer.
     */

    public void setNumberOfRelation(int numberOfRelation) {
        this.numberOfRelation = numberOfRelation;
    }
    
    

    public List getRelations() {
        return Relations;
    }
/**
     * Establece la lista de relaciones del usuario.
     * 
     * @param Relations La lista de relaciones a establecer.
     */
    public void setRelations(List Relations) {
        this.Relations = Relations;
    }
    
    /**
     * Agrega una nueva relación al usuario.
     * 
     * @param data El dato de la nueva relación.
     * @param x El objeto GraphMA al que se agrega la relación.
     * @param number El número de la relación.
     */
    
    public void addRelation(int data, GraphMA x, int number){
        this.Relations.addAtTheEndT(data);
        
        x.insertArista(this.getNumberOfRelation(), data, number);
    }
    
}
