package libmaar;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class matricesClass {
       
    //Metodo para llenar Matrices
    public int [][] llenarMatriz(){
    int f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz"));   
    int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz"));
        
        int[][] matriz = new int [f][c];
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nIntroducción de datos ");
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                System.out.print("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    //metodo para llenar la matriz A utilizada en la multiplicacion de matrices
    public int [][] llenarMatrizA(){
    int fA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz -A-"));   
    int cA=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz -A-"));
        
        int[][] matriz = new int [fA][cA];
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nIntroducción de datos ");
        for(int i=0; i<fA; i++){
            for(int j=0; j<cA; j++){
                System.out.print("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    //metodo para llenar la matriz B utilizada en la multiplicacion de matrices
    public int [][] llenarMatrizB(){
        int fB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz -B-"));   
        int cB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz -B-")); 
        
        int[][] matriz = new int [fB][cB];
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nIntroducción de datos ");
        for(int i=0; i<fB; i++){
            for(int j=0; j<cB; j++){
                System.out.print("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    //Metodo para imprimir matrices recibe como parametro una matriz
    public  void imprimirMatriz(int[][]m){
        System.out.println("=== Matriz ===");
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //Metodo para sumar Matrices recibe como parametros dos matrices
    public  int [][] sumaMatrices(int[][]m1, int[][]m2){
        int f=m1.length;   
        int c=m2[0].length;
        
        if(f!=c){
            System.exit(1);
        }
        
        int[][]m3 = new int[f][c];
        System.out.println("\n=== Resultado de suma de matrices ===\n");
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
            
       return m3; 
    }
    
    //Metodo de multiplicacion 
    public int[][] multiplicacionMatrices ( int[][] m1, int[][] m2) {
        
        if(m1[0].length != m2.length){
            System.out.println("Las matrices no son multiplicables");
            System.exit(1);
        }
        
        System.out.println("\nResultado de la multiplicación");
        
        int[][] m3 = new int[m1.length][m2[0].length];
        
        for (int i= 0; i<m3.length; i++)
            for (int j=0; j<m3[0].length; j++)
                for (int k=0; k<m2.length; k++)
                  m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];
        return m3;
    }
    
    //Metodo para llenar un arreglo
    public int[] llenarArreglo(){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo"));
        int[] arreglo = new int[A];
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("\nIntroduce datos al arreglo");
        for(int i=0; i<A; i++){
           System.out.print("Ingresa el valor No."+(i+1)+" del arreglo: ");
           arreglo[i] = entrada.nextInt();
        }
        return arreglo;
    }
    
    //Metodo para imprimir un arreglo
    public void imprimirArreglo(int[]a){
        
        System.out.print("Datos del arreglo: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
    
    //Metodo para comparar un arreglo con una matriz
    public int[][] comparacionArreglo(int[]a, int[][]m){
        int F = m.length;
        int C = m[0].length;
        int[][] comparado = new int [F][C];
        System.out.println("\n=====Comapracion=====\n");
        for(int i=0; i<F; i++){
            for(int j=0; j<C; j++){ 
                if(m[i][j]==a[i]){
                  comparado[i][j] = m[i][j];
                }
            }
        }
      return comparado;
    }
    
    //Metodo para llenar matrices
    public int[][] llenarIrregular(){
        int R = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de renglones"));
        //declaracion de una matriz irregular 
        int[][] datos = new int [R][];

        for(int i=0; i<R; i++){
            int C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas para el renglon numero "+ (i+1)));
            datos[i] = new int[C];
        }
        
        //almacenar valores 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduccionde datos ");
        for(int i=0; i<datos.length; i++){
            for(int j=0; j<datos[i].length; j++){
                System.out.println("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
                datos[i][j] = entrada.nextInt();
            }
        }
        return datos;
    }
    
    //Metodo para hacer una matriz irregular
    public void matrizIrregular(int [][]a){
        System.out.println("Contenido de la matriz datos: ");
        for (int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length;j++)
                System.out.print(a[i][j]+ "  ");
            System.out.println();
                        
                     
        } 
 
    }
    
    //Metodo para transponer una matriz
    public void traspuesta(int a[][]){
        int aux;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<i; j++){
                aux = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = aux;
            }
        }
    }
    
    

}
