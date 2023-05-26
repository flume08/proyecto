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

    public User(String username, int numberOfRelation) {
        this.username = username;
        this.numberOfRelation = numberOfRelation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumberOfRelation() {
        return numberOfRelation;
    }

    public void setNumberOfRelation(int numberOfRelation) {
        this.numberOfRelation = numberOfRelation;
    }

    public List getRelations() {
        return Relations;
    }

    public void setRelations(List Relations) {
        this.Relations = Relations;
    }
    
    public void addRelation(int data, GraphMA x, int number){
        this.Relations.addAtTheEndInt(data);
        
        x.insertEdge(this.getNumberOfRelation(), data, number);
    }
    
}
