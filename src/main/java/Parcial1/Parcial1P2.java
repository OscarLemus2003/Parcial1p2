/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;

/**
 *
 * @author Oscar
 */
public class Parcial1P2 {
    //private static String[][] comisionesT = new String[2][11];
    private static String[][] comisiones = new String[6][11];
    
    
    private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TVENTAS=5;
    private static final int P20=6;
    private static final int P35=7;
    private static final int TVC=8;
    private static final int ISR=9;
    private static final int LRECIBIR=10;
    
    
    private static void cargaInfo(){
       
        comisiones[0][NOMBRE]=("Oscar");
        comisiones[1][NOMBRE]=("Jose");
        comisiones[2][NOMBRE]=("Bertony");
        comisiones[3][NOMBRE]=("Gisselle");
        comisiones[4][NOMBRE]=("Francisco");
        comisiones[5][NOMBRE]= ("TOTAL");
        
                
        comisiones[0][ENERO]=("1000");
        comisiones[1][ENERO]=("2000");
        comisiones[2][ENERO]=("150");
        comisiones[3][ENERO]=("2200");
        comisiones[4][ENERO]=("550");
        
                
        comisiones[0][FEBRERO]=("100");
        comisiones[1][FEBRERO]=("600");
        comisiones[2][FEBRERO]=("250");
        comisiones[3][FEBRERO]=("960");
        comisiones[4][FEBRERO]=("100");
        
        comisiones[0][MARZO]=("100");
        comisiones[1][MARZO]=("600");
        comisiones[2][MARZO]=("250");
        comisiones[3][MARZO]=("700");
        comisiones[4][MARZO]=("550");
        
        comisiones[0][ABRIL]=("100");
        comisiones[1][ABRIL]=("600");
        comisiones[2][ABRIL]=("250");
        comisiones[3][ABRIL]=("700");
        comisiones[4][ABRIL]=("550");
        
        
        
  
    }//Cierre CargaInfo
    
    
    private static void Imprimirmodel(){
        System.out.print("\n");
       
        
        for(int x=0;x<comisiones.length;x++){
                System.out.print("|");
                for(int y=0;y<comisiones[x].length;y++){
                    System.out.print(comisiones[x][y]);
                    if(y!=comisiones[x].length-1){
                        System.out.print("\t\t");
                    }//cierre condicional if
                }//cierre for Y
                System.out.println("|");
        }
    }
    
        public static void Operaciones(){
            int totalVentas=0,VentasComision=0,Isr=0,Totaliquido=0;
            
            for(int i=0;i<5;i++){
                
                totalVentas= Integer.valueOf(comisiones[i][ENERO]);
                totalVentas = totalVentas +  Integer.valueOf(comisiones[i][FEBRERO]);
                totalVentas = totalVentas+  Integer.valueOf(comisiones[i][MARZO]);
                totalVentas = totalVentas +  Integer.valueOf(comisiones[i][ABRIL]);
                
                comisiones[i][TVENTAS]=totalVentas+"";

             }
        }

 private void main (){
     cargaInfo();
     Imprimirmodel();
     Operaciones();
 } 
 
}
