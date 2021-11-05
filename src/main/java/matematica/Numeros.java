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
        if (n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public int areaQuadrado(int lado){
        return (lado*lado);
    }
    
    public Boolean numeroDivisivel(int dividendo, int divisor){
        if (dividendo%divisor==0){
            return true;
        }else{
            return false;
        }
    }
}
