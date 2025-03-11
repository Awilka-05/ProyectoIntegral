package com.proyecto.rutas.backend;

public class ConsumoCombustible {
    
    public static double calcularConsumo(double distancia, double consumoPorKm, int pasos) {
        return ServicioCalculo.integrarConsumo(distancia, consumoPorKm, pasos);
    }
}
