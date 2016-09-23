/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.Convert.Out;

/**
 *
 * @author CASA
 */
public class ResultConvertIn extends Metro{

    public ResultConvertIn(double valor) {
        super(valor);
        
    }

    @Override
    public double toMilimetros() {
   return (valor*1000);
    }

    @Override
    public double toCentimetros() {
    return (valor*100);   
    }

    @Override
    public double toDecimetros() {
    return (valor* 10);   
    }

    @Override
    public double toMetros() {
    return (valor);   
    }

    @Override
    public double toKilometros() {
    return (valor* 0.001);   
    }

    @Override
    public double toMillas() {
    return (valor* 0.000621371);   
}

    @Override
    public double toYardas() {
       return (valor*1.09361);
     }

    @Override
    public double toPies() {
     return (valor*3.28084);
    }
    
}
