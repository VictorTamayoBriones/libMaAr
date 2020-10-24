package libmaar;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arrayClass {
    
    //Metodo para llenar arreglos
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
        
        System.out.print("\nDatos del arreglo: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
    
    //Metodo de busqueda lineal
    public void busquedalenial(int a[], int b){
        
        System.out.println("\nComenzando busqueda\n"); 
        
        for(int i = 0; i<a.length; i++){

            if(a[i] == b){
                System.out.println("Se encontro el elemento " + b);
            }
        }
       
    }
    
    //Metodo de busqueda binaria
    public void busquedaBinaria(){   
        Scanner entra = new Scanner(System.in);
        
        int numero[] = new int[8];
        
        System.out.println("Escribe 8 nùmeros\n");
        
        for( int i=0; i<8; i++){
            System.out.print("\nEscribe el numero de la posicion " +(i+1));
            numero[i] = entra.nextInt();
        }
        
        System.out.println("Ahora ingresa tu numero a buscar");
        int numBuscar = entra.nextInt();
        
        int n=numero.length, inf=0, centro=0;
        int sup=n-1;
        boolean elemento=false;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(numero[centro]==numBuscar){
                elemento=true;
                break;
            }
            else if(numBuscar<numero[centro]){
                sup=centro-1;
            }
            else{
                inf=centro+1;
            }
        }
        if(elemento=true){
            System.out.println("Ya encontre tu numero, estaba en la posicion "+(centro+1));
        }else{
            System.out.println("Lo siento no encontre tu numerito");
        }

    }
    
    //Metodo para eliminar elementos de un arreglo
    public void eliminarElemento(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(i != j){
                    if(a[i] == a[j]){
                        
                        a[j]=0;
                        a[i]=0;
                    }
                }
                
            }
        }
        
        for(int i=0; i<a.length; i++){
            System.out.println("["+a[i]+"]");
        }
    }
    
    //Metodo para sacar la moda de un arreglo
    public void moda(int[]a){
        
        for(int i = 0; i<a.length; i++){
            
            for(int x = i + 1; x<a.length; x++){
                
                
                if(a[i] == a[x]){
                    
                    System.out.println("La moda es: " + a[i]);
                    
                }
                
            }
            
        }
    }
    
    //Metodo para el lemento mayor
    public void elementoMAyor(int a[]){
        int menor, mayor;
        
        menor=mayor=a[0];
        for(int j=1; j<a.length; j++){
            if(a[j]>mayor){
                mayor=a[j];
            }
            if(a[j]<menor){
                menor=a[j];
            }
        }
        
        System.out.println("elemento mayor: "+mayor);
        System.out.println("elemento menor: "+menor);
    }
    
    //Metodo para el shell sort
    public void Shell(int[] mat) {
	for(int incre=mat.length/2; incre>0; incre=(incre==2) ? 1: (int)Math.round(incre/2.2)) {
            for(int i=incre; i<mat.length; i++) {
		for(int j=i; j >= incre && mat[j-incre] > mat[j]; j -= incre) {
                    int temp= mat[j];
                    mat[j]= mat[j - incre];
                    mat[j - incre] = temp;
		}
            }
        }
    }
    
    //Metodo para Bubble sort
    public int[] burbuja(int[] arreglo){
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 0; i < arreglo.length-1; i++){
        for(int j = 0;j < arreglo.length-1;j++)
        {
          if(arreglo[j] > arreglo[j+1]){
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
