/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
//COMENTARIO DE EJEMPLO

//EJEMPLO1
    int i=0;
    while(i<5){
        System.out.println("Hola Pedro");
        i++;
    }//fin while
    
    //EJEMPLO2
    int x=0;
    while(x<5){
        System.out.println("@@@@@@@@");
        x++;
    }//fin while
    
    //EJEMPLO 3 - FOR
    for(int g=0;g<5;g++){
        System.out.println("G vale: "+g);
    }//fin for
    
    //EJMPLO 4
    for(int n=5;n>0;n--){
        System.out.println("N vale: "+n);
    }//fin for
    
    //EJEMPLO 5 - do-while
    int m=0;
    do{
        System.out.println("M vale: "+m);
        m++;
    }while(m<5);
    
    //EJEMPLO 6 - CICLOS ANIDADOS
    int k = 0;
    while(k<6){
        System.out.println("Ejecutando while"
                + " externo, k vale: "+k);
        //while interno
        int j=0;
        while(j<4){
            System.out.println("Ejecutando while "
                    + "interno, j vale: "+j);
            
        }//fin while interno   
        k++;
    }//fin while externo
    
    
    }//fin main
    
}//fin de la clase
