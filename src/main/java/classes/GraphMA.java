/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Luis Carreño
 */
package classes;

/**
 * Esta clase representa un grafo implementado mediante una matriz de adyacencia.
 * Puede ser utilizado para representar grafos dirigidos o no dirigidos.
 */
public class GraphMA{
    private boolean directed;
    private int maxNodes;
    private int numEdges;
    private int [][] matrixAdy;
 /**
     * Crea un nuevo objeto GraphMA.
     *
     * @param directed indica si el grafo es dirigido (true) o no dirigido (false)
     */
    public GraphMA(boolean directed) {
        this.directed = directed;
        maxNodes = numEdges = 0;
    }
     /**
     * Crea un nuevo objeto GraphMA con un número máximo de nodos especificado.
     *
     * @param n        el número máximo de nodos en el grafo
     * @param d indica si el grafo es dirigido (true) o no dirigido (false)
     */
    public GraphMA (int n, boolean d) {
        directed = d;
        maxNodes = n;
        numEdges = 0;
        matrixAdy = new int[n][n];
}
    /**
     * Inserta una arista entre dos nodos del grafo con un valor de relación dado.
     *
     * @param i                el primer nodo de la arista
     * @param j                el segundo nodo de la arista
     * @param relationshipValue el valor de relación entre los nodos
     */
    public void insertArista(int i, int j, int relationshipValue){
        matrixAdy [i][j] = relationshipValue;
        if (!directed){
            matrixAdy [j] [i] = matrixAdy [i] [j];
        }
    }
     /**
     * Elimina una arista entre dos nodos del grafo.
     *
     * @param i el primer nodo de la arista
     * @param j el segundo nodo de la arista
     */
    public void deleteArista(int i, int j){
        matrixAdy [i][j] = 0;
        if (!directed){
            matrixAdy [j] [i] = 0;
        }
    }
    /**
     * Inserta un número específico de vértices en el grafo.
     *
     * @param n el número de vértices a insertar
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
     * Eliminar un vertice especifico del grafo.
     *
     * @param n el número de vértice a insertar
     */
     public void eliminarVertice(int vertice) {
        if (vertice >= 0 && vertice < numEdges) {
            // Eliminar la columna correspondiente al vértice
            for (int i = vertice; i < numEdges - 1; i++) {
                for (int j = 0; j < numEdges; j++) {
                    matrixAdy[j][i] = matrixAdy[j][i + 1];
                }
            }

            // Eliminar la fila correspondiente al vértice
            for (int i = vertice; i < numEdges - 1; i++) {
                for (int j = 0; j < numEdges; j++) {
                    matrixAdy[i][j] = matrixAdy[i + 1][j];
                }
            }

            // Actualizar el número de vértices y la matriz de adyacencia
            numEdges--;
            int[][] nuevaMatriz = new int[numEdges][numEdges];
            for (int i = 0; i < numEdges; i++) {
                for (int j = 0; j < numEdges; j++) {
                    nuevaMatriz[i][j] = matrixAdy[i][j];
                }
            }
            matrixAdy = nuevaMatriz;
        } else {
            System.out.println("Índice de vértice inválido.");
        }
    }
    /**
     * Imprime la tabla de adyacencia del grafo.
     */
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
    /**
     * Verifica si existe una arista entre dos nodos del grafo.
     *
     * @param i el primer nodo de la arista
     * @param j el segundo nodo de la arista
     * @return true si existe una arista entre los nodos, false de lo contrario
     */
    public boolean existeArista (int i, int j){
        return matrixAdy [i] [j] != 0;
    }
    /**
     * Cuenta el número de islas (componentes conectados) en el grafo utilizando el algoritmo DFS.
     *
     * @return el número de islas en el grafo
     */
    public int countIslandsdfs() {
        int islandsCount = 0;
        int rows = matrixAdy.length;
        int cols = matrixAdy[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixAdy[i][j] != 0 && !visited[i][j]) {
                    islandsCount++;
                    dfs(visited, i, j);
                }
            }
        }

        return islandsCount;
    }
    /**
     * Realiza una búsqueda en profundidad (DFS) para explorar los nodos de una isla.
     *
     * @param visited la matriz de nodos visitados
     * @param row     la fila actual
     * @param col     la columna actual
     */
    private void dfs(boolean[][] visited, int row, int col) {
        int rows = this.matrixAdy.length;
        int cols = this.matrixAdy[0].length;
        if (row < 0 || row >= rows || col < 0 || col >= cols || this.matrixAdy[row][col] == 0 || visited[row][col]) {
            return;
        }
        visited[row][col] = true; // Mark as visited
        // Explore adjacent cells
        dfs(visited, row - 1, col); // Up
        dfs(visited, row + 1, col); // Down
        dfs(visited, row, col - 1); // Left
        dfs(visited, row, col + 1); // Right
        dfs(visited, row-1, col -1); // Top Right
        dfs(visited, row-1, col + 1); // Top Left
        dfs(visited, row+1, col-1); // Bottom Right
        dfs(visited, row+1, col + 1); // Bottom Right
    }
    /**
     * Cuenta el número de islas (componentes conectados) en el grafo utilizando el algoritmo BFS.
     *
     * @return el número de islas en el grafo
     */
 public int countIslandsbfs() {
        int islandCount = 0;
        int rows = this.matrixAdy.length;
        int cols = this.matrixAdy[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int[][] offsets = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}, {1,1}, {1,-1},{-1,1},{-1,-1}}; // Neighboring cell offsets

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (this.matrixAdy[i][j] > 1 && !visited[i][j]) {
                    islandCount++;
                    bfs(visited, i, j, offsets);
                }
            }
        }

        return islandCount;
    }
/**
     * Realiza una búsqueda en anchura (BFS) para explorar los nodos de una isla.
     *
     * @param visited la matriz de nodos visitados
     * @param row     la fila actual
     * @param col     la columna actual
     * @param offsets los desplazamientos de las celdas adyacentes
     */
    private void bfs(boolean[][] visited, int row, int col, int[][] offsets) {
        int rows = this.matrixAdy.length;
        int cols = this.matrixAdy[0].length;
        Queue queue = new Queue();
        int vertex = row * cols + col; // Convert 2D coordinates to 1D representation
        queue.addToTheQueue(vertex);
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            int curr = queue.unqueue();
            int currRow = curr / cols;
            int currCol = curr % cols;

            for (int[] offset : offsets) {
                int newRow = currRow + offset[0];
                int newCol = currCol + offset[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && this.matrixAdy[newRow][newCol] >0 && !visited[newRow][newCol]) {
                    int newVertex = newRow * cols + newCol; // Convert 2D coordinates to 1D representation
                    queue.addToTheQueue(newVertex);
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
    /**
     * Encuentra los puentes en el grafo.
     * Un puente es una arista cuya eliminación aumenta el número de islas en el grafo.
     */
     public void  findBridges(){
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
                        System.out.println("La arista de coordenadas: " + i + "," + j+ " es un puente");
                    this.matrixAdy [i][j] = temp;    
                    }
                    
                }
            }}
    }
}