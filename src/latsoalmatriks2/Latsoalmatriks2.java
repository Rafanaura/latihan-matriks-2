/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsoalmatriks2;

/**
 *
 * @author MOKLET-2
 */
public class Latsoalmatriks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriksA[][]= {{6,3,2}, {4,2,3}};
        int matriksB[][]= {{1,2}, {2,3}, {3,1}};
        int hasil[][]= new int [matriksA.length][matriksB[0].length];
        
        for (int barisA=0; barisA<matriksA.length; barisA++){
            for(int kolomB=0; kolomB<matriksB[0].length; kolomB++){
                for (int a=0; a<matriksB.length; a++){
                    hasil[barisA][kolomB] += matriksA[barisA][a] * matriksB[a][kolomB];
                }
                System.out.print(hasil [barisA][kolomB] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
