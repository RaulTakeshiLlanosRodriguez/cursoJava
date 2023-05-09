/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ClasesMetodosFinal;

/**
 *
 * @author USER
 */
public class FiguraCerrada extends Figura{
    
    public FiguraCerrada(double tamaño) {
        super(tamaño);
    }
    
    @Override
    public void pintar(){
        System.out.println("Pintando figura cerrada del tamaño"+tamaño);
    }
}
