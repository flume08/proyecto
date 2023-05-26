/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class GraphMA{
    private boolean directed;
    private int maxNodes;
    private int numEdges;
    private int [][] matrixAdy;

    public GraphMA(boolean directed) {
        this.directed = directed;
        maxNodes = numEdges = 0;
    }
    public GraphMA (int n, boolean d) {
        directed = d;
        maxNodes = n;
        numEdges = 0;
        matrixAdy = new int[n][n];
}
    public void insertEdge(int i, int j, int relationshipValue){
        matrixAdy [i][j] = relationshipValue;
        if (!directed){
            matrixAdy [j] [i] = matrixAdy [i] [j];
        }
    }
    public void deleteEdge(int i, int j){
        matrixAdy [i][j] = 0;
        if (!directed){
            matrixAdy [j] [i] = 0;
        }
    }
    public void insertaVertice (int n) {
        if ( n > maxNodes - numEdges )
        System.out.println ("Error, se supera el número de nodos máximo");
        else {
        for (int i=0; i < numEdges + n; i++) {
        for (int j = numEdges; j < numEdges + n; j++)
        matrixAdy [i] [j] = matrixAdy [j] [i] = 0;
        }
        numEdges = numEdges + n;
        }
    }
    
    public void imprimirTable () {
    System.out.println ("La matriz contiene " + numEdges + " vértices: \n");
    for (int i = 0; i < numEdges; i++) {
        for (int j = 0; j < numEdges; j++) {
            if (matrixAdy [i] [j] !=0){
            System.out.print (matrixAdy [i][j]);}
            else {System.out.print ("0 ");
            }
        }
        System.out.println("\n");
    }
    }
}