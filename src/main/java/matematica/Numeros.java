/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematica;

/**
 *
 * @author marcelapsilverio
 */
public class Numeros {
    
    public Boolean numeroPar(int n){
        return n%2==0;
    }
    
    public int areaQuadrado(int lado){
        return lado*lado;
    }
    
    public Boolean numeroDivisivel(int dividendo, int divisor){
        return dividendo%divisor==0;
    }
}
