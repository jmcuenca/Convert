/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.Convert.In;

/**
 *
 * @author CASA
 */
public class ResultConvertOut extends CIn {

    public ResultConvertOut(double valor) {
        super(valor);
    }

    @Override
    public double milimetros() {
       return(valor*0.01);
               }

    @Override
    public double Centimetros() {
       return(valor*0.01);
   }

    @Override
    public double Decimetros() {
       return(valor*0.1);
      
    }

    @Override
    public double Metros() {
       return(valor);
    
    }

    @Override
    public double Kilometros() {
       return(valor*1000);
    }

    @Override
    public double Millas() {
        return (valor *1609.34); }

    @Override
    public double Yardas() {
       return(valor*0.9144);
    }

    @Override
    public double Pies() {
      return(valor*0.3048);
    }

    
}
