/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.Convert.Out;

import espe.edu.ec.Convert.ConvertIn;


/**
 *
 * @author SONY
 */
public abstract class Metro implements ConvertIn{
    protected double valor;

    public Metro(double valor) {
        this.valor = valor;
    }

    public Metro() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
