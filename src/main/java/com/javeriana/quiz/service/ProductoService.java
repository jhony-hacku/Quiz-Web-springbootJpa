package com.javeriana.quiz.service;

import com.javeriana.quiz.entity.Producto;

import java.util.List;

/**
 * Interfaz de servicio para la lógica de negocio de Producto.
 * Define el contrato que debe cumplir cualquier implementación.
 */
public interface ProductoService {

    /**
     * Registra (guarda) un nuevo producto en la base de datos.
     *
     * @param producto objeto Producto a guardar
     * @return el Producto guardado con su ID generado
     */
    Producto registrarProducto(Producto producto);

    /**
     * Consulta productos por categoría usando la consulta JPQL
     * definida en el repositorio.
     *
     * @param categoria nombre de la categoría a filtrar
     * @return lista de productos de esa categoría
     */
    List<Producto> buscarPorCategoria(String categoria);
}
