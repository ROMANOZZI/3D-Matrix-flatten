/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3d;

/**
 *
 * @author moham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3D
         int[][][] a=new int [4][3][3]; 
         //1D
         int[]b= new int[4*3*3];
         int mm=0;
         for(int i=0;i<4;i++){  for(int j=0;j<3;j++){  for(int k=0;k<3;k++){
         a[i][j][k]=mm;
         b[(i*(3*3))+(j*3)+k]=a[i][j][k];
         mm++;
         
         }}}
       
        
   
    System.out.print(a[1][2][2]==b[17]); }
    
}
