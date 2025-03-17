/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.rutas.backend;

/**
 *
 * @author ofloo
 */
public class TiempoViaje {
           public double calcularTiempo(double distanciaTotal , int numTrapecios) {
               double dist = distanciaTotal * 1000;
        double tiempoMaximoEstimado = Math.sqrt(dist);
        double deltaT = tiempoMaximoEstimado / numTrapecios;
        double distanciaCalculada = 0;
        int iteraciones = 0;
        final int MAX_ITERACIONES = 10000;

        while (Math.abs(distanciaCalculada - dist) > 0.001 && iteraciones < MAX_ITERACIONES) {
            distanciaCalculada = 0;
            deltaT = tiempoMaximoEstimado / numTrapecios;

            for (int i = 0; i < numTrapecios; i++) {
                double t1 = i * deltaT;
                double t2 = (i + 1) * deltaT;
                double v1 = 2 * t1;
                double v2 = 2 * t2;
                distanciaCalculada += (v1 + v2) / 2 * deltaT;
            }

            double error = dist - distanciaCalculada;
            tiempoMaximoEstimado += error / 100;

            iteraciones++;
        }

        if (iteraciones == MAX_ITERACIONES) {
            System.out.println("No se pudo converger a la distancia total.");
        }
        
        return (tiempoMaximoEstimado );
        
        
    }

    // Método para obtener el tiempo de viaje redondeado
   
}