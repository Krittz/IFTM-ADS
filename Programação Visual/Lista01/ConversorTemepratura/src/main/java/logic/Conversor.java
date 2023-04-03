/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author crist
 */
public class Conversor {

    private double resultado;

    public Conversor() {
    }

    public Conversor(double resultado) {
        this.resultado = resultado;
    }
// ===============================================================================================================================

    public double celsiusFahrenheit(double temp) {

        return resultado = temp * 9 / 5 + 32;
    }

    public double celsiusKelvin(double temp) {
        return resultado = temp + 273.15;
    }

    public double fahrenheitCelsius(double temp) {
        return resultado = (temp - 32) * 5 / 9;
    }

    public double fahrenheitKelvin(double temp) {
        return resultado = ((temp - 32) * 5 / 9) / 273.15;
    }

    public double kelvinCeslius(double temp) {
        return resultado = (temp - 273.15);
    }

    public double kelvinFahrenheit(double temp) {
        return resultado = ((temp - 273.15) * 9 / 5) + 32;
    }

    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
