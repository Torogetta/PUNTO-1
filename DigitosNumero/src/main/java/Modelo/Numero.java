/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Tomas
 */
public class Numero {

    int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int contarDigitos() {
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        int n;

        if (numero < 0) {
            n = -numero;
        } else {
            n = numero;
        }

        while (n > 0) {
            n = n / 10;
            contador++;
        }

        return contador;
    }

}
