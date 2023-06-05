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
    public int [][] matrixAdy;
/**
     * Crea un nuevo objeto GraphMA con la opción de grafo dirigido especificada.
     *
     * @param directed Indica si el grafo es dirigido (true) o no dirigido (false).
     */
    public GraphMA(boolean directed) {
        this.directed = directed;
        maxNodes = numEdges = 0;
    }
    /**
     * Crea un nuevo objeto GraphMA con el número de nodos y la opción de grafo dirigido especificados.
     *
     * @param n        El número máximo de nodos en el grafo.
     * @param directed Indica si el grafo es dirigido (true) o no dirigido (false).
     */
    public GraphMA (int n, boolean d) {
        directed = d;
        maxNodes = n;
        numEdges = 0;
        matrixAdy = new int[n][n];
}
    /**
     * Inserta una arista en el grafo con el valor de relación especificado.
     *
     * @param i                 El índice del nodo origen de la arista.
     * @param j                 El índice del nodo destino de la arista.
     * @param relationshipValue El valor de relación asociado a la arista.
     */
    public void insertArista(int i, int j, int relationshipValue){
        matrixAdy [i][j] = relationshipValue;
        if (!directed){
            matrixAdy [j] [i] = matrixAdy [i] [j];
        }
    }
    /**
     * Elimina una arista del grafo.
     *
     * @param i El índice del nodo origen de la arista.
     * @param j El índice del nodo destino de la arista.
     */
    public void deleteArista(int i, int j){
        matrixAdy [i][j] = 0;
        if (!directed){
            matrixAdy [j] [i] = 0;
        }
    }
    /**
     * Inserta un vértice en el grafo.
     *
     * @param n El número de vértices a insertar.
     */
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
    /**
     * Imprime la matriz de adyacencia del grafo.
     */
    public void imprimirTable () {
    System.out.println ("La matriz contiene " + numEdges + " vértices: \n");
    for (int i = 0; i < numEdges; i++) {
        for (int j = 0; j < numEdges; j++) {
            if (matrixAdy [i] [j] !=0){
            System.out.print (matrixAdy [i][j] + " ");}
            else {System.out.print ("0 ");
            }
        }
        System.out.println("\n");
    }
    }
    public boolean existeArista (int i, int j){
        return matrixAdy [i] [j] != 0;
    }


     public int countIslandsdfs() {
        int islandsCount = 0;
        int rows = matrixAdy.length;
        int cols = matrixAdy[0].length;
        boolean[]visited = new boolean[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixAdy[i][j] != 0 && !visited[i]) {
                    islandsCount++;
                    recorrerProfundidad(i,visited);
                }
            }
        }

        return islandsCount;
    }

    
    public void recorrerProfundidad (int v, boolean [ ] visitados) {
    //se marca el vértice v como visitado
    GraphMA g = this;
    visitados [v] = true;
    //el tratamiento del vértice consiste únicamente en imprimirlo en pantalla
    //se examinan los vértices adyacentes a v para continuar el recorrido
    for (int i = 0; i < g.numEdges; i++) {
    if ((v != i) && (!visitados [i]) && (g.existeArista (v, i)) )
    recorrerProfundidad (i, visitados);
}
}
 public int contarIslas1() {
    boolean[] visitados = new boolean[this.numEdges];
    int contadorIslas = 0;
    
    for (int v = 0; v < this.numEdges; v++) {
        if (!visitados[v]) {
            if (amplitud1(v, visitados)) {
                contadorIslas++;
            }
        }
    }
    
    return contadorIslas;
}

public boolean amplitud1(int v, boolean[] visitados) {
    Queue<Integer> cola = new Queue<>();
    boolean nuevaIslaEncontrada = false;

    cola.addToTheQueue(v);
    visitados[v] = true;

    while (!cola.isEmpty()) {
        int verticeActual = (int) cola.unqueue();
        for (int j = 0; j < this.numEdges; j++) {
            if (verticeActual != j && this.existeArista(verticeActual, j) && !visitados[j]) {
                cola.addToTheQueue(j);
                visitados[j] = true;
                nuevaIslaEncontrada = true;
            }
        }
    }

    return nuevaIslaEncontrada;
}
     public List<int []>  findBridges(){
        List <int []> list = new List<>();
        int islands = countIslandsdfs();
        int rows = this.matrixAdy.length;
        int cols = this.matrixAdy[0].length;
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (this.matrixAdy [i][j] !=0){
                    int temp = this.matrixAdy [i][j]; 
                    this.matrixAdy [i][j] = 0;
                    int islandstemp = this.countIslandsdfs();
                    if (islands != islandstemp){
                        int [] coords = {i,j};
                        list.addAtTheEndT(coords);
                    this.matrixAdy [i][j] = temp;    
                    }
                    
                }
            }}
    return list;
     }
}