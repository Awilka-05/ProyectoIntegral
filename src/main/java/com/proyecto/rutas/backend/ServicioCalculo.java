package com.proyecto.rutas.backend;

public class ServicioCalculo {

    /**
     * Método para calcular la integral de dx/c(x) usando el método del trapecio.
     * @param distancia Distancia total a recorrer (km).
     * @param consumoPorKm Consumo de combustible/energía ingresado por el usuario.
     * @param pasos Número de subdivisiones para la integración.
     * @return Consumo estimado basado en la integral.
     */
    public static double integrarConsumo(double distancia, double consumoPorKm, int pasos) {
        double h = distancia / pasos;  // Tamaño de paso
        double consumoTotal = 0.0;

        for (int i = 0; i < pasos; i++) {
            double x1 = i * h;
            double x2 = (i + 1) * h;
            double fx1 = funcionConsumo(x1, consumoPorKm);
            double fx2 = funcionConsumo(x2, consumoPorKm);

            // Aplicamos la regla del trapecio
            consumoTotal += (fx1 + fx2) * h / 2;
        }

        return consumoTotal;
    }

    /**
     * Función que modela el consumo de combustible/energía en función de la distancia.
     * @param x Distancia en km
     * @param consumoPorKm Valor ingresado por el usuario
     */
    private static double funcionConsumo(double x, double consumoPorKm) {
        return consumoPorKm;  // Usamos el valor que ingresó el usuario en la interfaz
    }
}
