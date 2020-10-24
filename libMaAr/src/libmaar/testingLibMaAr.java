package libmaar;


import java.util.Scanner;

public class testingLibMaAr {
    
    public static void main(String[] args){
        matricesClass manejadorMatrices = new matricesClass();
        arrayClass manejadorArreglos = new arrayClass();
        
        int a[][];
        int b[][];
        int c[][];
        int d[];
        /*
         //--M A T R I C E S--
        a=manejadorMatrices.llenarMatriz();
        manejadorMatrices.imprimirMatriz(a);
        
        b=manejadorMatrices.llenarMatriz();
        manejadorMatrices.imprimirMatriz(b);
        
        c=manejadorMatrices.sumaMatrices(a, b);
        manejadorMatrices.imprimirMatriz(c);
        
        manejadorMatrices.traspuesta(c);
        manejadorMatrices.imprimirMatriz(c);
        */
        
        //--Arreglos--
        d=manejadorArreglos.llenarArreglo();
        manejadorArreglos.elementoMAyor(d);
        manejadorArreglos.burbuja(d);
        manejadorArreglos.moda(d);
        manejadorArreglos.imprimirArreglo(d);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        //--M A T R I C E S--
        a=manejadorMatrices.llenarMatriz();
        manejadorMatrices.imprimirMatriz(a);
        
        b=manejadorMatrices.llenarMatriz();
        manejadorMatrices.imprimirMatriz(b);
        
        c=manejadorMatrices.sumaMatrices(a, b);
        manejadorMatrices.imprimirMatriz(c);
        manejadorMatrices.traspuesta(c);
        manejadorMatrices.imprimirMatriz(c);
        */
        
        /*
        //--Arreglos--
        d=manejadorArreglos.llenarArreglo();
        manejadorArreglos.elementoMAyor(d);
        manejadorArreglos.burbuja(d);
        manejadorArreglos.moda(d);
        manejadorArreglos.imprimirArreglo(d);
        */
        
    }
    
}
