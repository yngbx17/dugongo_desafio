/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diegodesouzaado1.newpackage;

/**
 *
 * @author YNGBX
 */
public class criaDugongo {
     public static void main(String[] args) {
       
        //instanciando objeto
        dugongo dugongo1 = new dugongo("Douglas", 5, true,true, true, 10.5);
        dugongo dugongo2 = new dugongo("Djola", 3, false, false, false, 0);

        dugongo1.comerAlgas(); 
        dugongo2.comerAlgas(); 
        
        
        dugongo1.vocalizar(); 
        dugongo2.vocalizar(); 
        
        dugongo1.nadar(10.5);
        dugongo2.nadar(0);
                
        
        System.out.println("\nNome: " + dugongo1.getNome());
        System.out.println("Idade: " + dugongo1.getIdade());
        System.out.println("Macho: " + dugongo1.isMacho());
        System.out.println("Nadador: " + dugongo1.isNadador());
        System.out.println("Velocidade de Nado: " + dugongo1.getVelocidadeNado());
        
        System.out.println("\nNome: " + dugongo2.getNome());
        System.out.println("Idade: " + dugongo2.getIdade());
        System.out.println("Femea: " + dugongo2.isFemea());
        System.out.println("Nadador: " + dugongo2.isNadador());
        System.out.println("Velocidade de Nado: " + dugongo2.getVelocidadeNado());
    
    }
}


