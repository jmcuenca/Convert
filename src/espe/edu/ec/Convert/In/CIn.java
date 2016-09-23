/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.Convert.In;

import espe.edu.ec.Convert.ConvertIn;
import espe.edu.ec.Convert.ConvertOut;


/**
 *
 * @author SONY
 */
public abstract class CIn implements ConvertOut{
    protected double valor;

    public CIn(double valor) {
        this.valor = valor;
    }

    public CIn() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
