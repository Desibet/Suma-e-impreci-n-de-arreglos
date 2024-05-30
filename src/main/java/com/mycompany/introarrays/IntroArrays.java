
package com.mycompany.introarrays;


public class IntroArrays {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //declaracion del arreglo
        int[] numeros;
        //iniciar el 
        numeros=new int[5];
                
                //valore
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        
        //imprimir los valores del arreglo->
        System.out.println("El elemento del indice 0: "+ numeros[0]);
        System.out.println("El elemento del indice 1: "+ numeros[1]);
        System.out.println("El elemento del indice 2: "+ numeros[2]);
        System.out.println("El elemento del indice 3: "+ numeros[3]);
        System.out.println("El elemento del indice 4: "+ numeros[4]);
        
        //int suma= numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];
        //System.out.println("La suma del Array es: "+suma);
        
        //sumatoria con ciclo for
        //int suma=0;
        //for(int i=0; i<numeros.length; i++){
            //suma+=numeros[i];
        //}
        //System.out.println("La suma con ciclo for es "+suma);
        
        //imprimir los valores en ciclo for 
        for(int i=0; i< numeros.length; i++){
            System.out.println("la suma con ciclo for es: la posicion es:  " +i  +numeros[i] );
        }
    }
}
