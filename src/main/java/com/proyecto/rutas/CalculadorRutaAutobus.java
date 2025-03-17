package com.proyecto.rutas;

import com.proyecto.rutas.backend.ConsumoCombustible;
import com.proyecto.rutas.backend.ConsumoEnergia;
import com.proyecto.rutas.backend.TiempoViaje;

public class CalculadorRutaAutobus {
    public static void main(String[] args) {
       /* double distancia = 150.0; // km
        int pasos = 1000; // Precisión de la integración

        double resultadoCombustible = ConsumoCombustible.calcularConsumo(distancia,40, pasos);
        System.out.println("Consumo de combustible estimado: " + resultadoCombustible + " litros");

        double resultadoEnergia = ConsumoEnergia.calcularConsumo(distancia,20, pasos);
        System.out.println("Consumo de energía estimado: " + resultadoEnergia + " kWh");*/
        
        TiempoViaje viaje =  new TiempoViaje();
        
        double Tiempo = viaje.calcularTiempo(2, 10000);
        double min =  Math.floor(Tiempo / 60);
        double seg = Math.floor( Tiempo % 60);
        System.out.println("El tiempo estimado es  " +(int) min + " minutos y " + (int)seg +" segundos.");              
    }
}
