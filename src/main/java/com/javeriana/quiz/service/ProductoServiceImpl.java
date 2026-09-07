package com.javeriana.quiz.service;

import com.javeriana.quiz.entity.Producto;
import com.javeriana.quiz.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Implementación de ProductoService.
 * Contiene la lógica de negocio y delega la persistencia al repositorio.
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    /** Repositorio inyectado mediante @Autowired (inyección por campo) */
    @Autowired
    private ProductoRepository productoRepository;

    /**
     * {@inheritDoc}
     * Persiste el producto usando el método save() heredado de JpaRepository.
     */
    @Override
    @Transactional
    public Producto registrarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    /**
     * {@inheritDoc}
     * Invoca la consulta JPQL definida en el repositorio.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Producto> buscarPorCategoria(String categoria) {
        return productoRepository.findByCategoria(categoria);
    }
}
