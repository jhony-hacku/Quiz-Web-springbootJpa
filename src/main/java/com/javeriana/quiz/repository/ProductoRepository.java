package com.javeriana.quiz.repository;

import com.javeriana.quiz.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio de Producto que extiende JpaRepository.
 * Proporciona operaciones CRUD heredadas y una consulta JPQL personalizada.
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    /**
     * Consulta JPQL personalizada: obtiene todos los productos
     * que pertenecen a una categoría específica.
     *
     * @param categoria nombre de la categoría a filtrar
     * @return lista de productos de esa categoría
     */
    @Query("SELECT p FROM Producto p WHERE p.categoria = :categoria")
    List<Producto> findByCategoria(@Param("categoria") String categoria);
}
