package br.edu.iftm.logic;

public class Conversor {
    
    private double tempFahrenheit;
    private double tempCelsius;
    private double tempKelvin;
      
    public Conversor(){
    }

    public double celsiusParaFahrenheit(double tempCelsius) {
        this.tempFahrenheit = (tempCelsius * 9 / 5.0) + 32;
        return this.tempFahrenheit;
    }
    
    public double celsiusParaKelvin(double tempCelsius) {
        this.tempKelvin = tempCelsius + 273.15;
        return this.tempKelvin;
    }
    
    public double fahrenheitParaKelvin(double tempFahrenheit) {
        this.tempKelvin = (tempFahrenheit - 32) * (5/9.0) + 273.15;
        return this.tempKelvin;
    }
    
    public double fahrenheitParaCelsius(double tempFahrenheit) {
        this.tempCelsius = (tempFahrenheit - 32) * (5/9.0);
        return this.tempCelsius;
    }
    
    public double kelvinParaFahrenheit(double tempKelvin){
        this.tempFahrenheit = (tempKelvin - 273.15) * (9/5.0) + 32;
        return this.tempFahrenheit;
    }
    
    public double kelvinParaCelsius(double tempKelvin){
        this.tempCelsius = tempKelvin - 273.15;
        return this.tempCelsius;
    }
}
