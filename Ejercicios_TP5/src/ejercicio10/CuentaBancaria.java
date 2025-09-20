/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author 87mar
 */
public class CuentaBancaria {
     private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición: pertenece a la cuenta
    private Titular titular;       // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
    }

    // Getters y Setters
    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public ClaveSeguridad getClave() { return clave; }
    public void setClave(ClaveSeguridad clave) { this.clave = clave; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) { this.titular = titular; }

    @Override
    public String toString() {
        return "Cuenta CBU: " + cbu + ", Saldo: " + saldo +
               "\nTitular: " + titular +
               "\nClave de seguridad: " + clave;
    }
}
