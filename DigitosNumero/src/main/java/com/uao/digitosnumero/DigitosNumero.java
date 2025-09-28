/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.uao.digitosnumero;
import Modelo.Numero;
import javax.swing.JOptionPane;
/**
 *
 * @author Tomas
 */
public class DigitosNumero {

    public static void main(String[] args) {
        System.out.println("Contador de digitos \n");
        int pregunta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        Numero numero = new Numero(pregunta);
        numero.contarDigitos();
        
        
        JOptionPane.showMessageDialog(null, "El numero tiene "+ numero.contarDigitos() + " digitos");
        }
    
    }

