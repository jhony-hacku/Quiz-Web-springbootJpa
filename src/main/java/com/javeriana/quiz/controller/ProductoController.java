package com.javeriana.quiz.controller;

import com.javeriana.quiz.entity.Producto;
import com.javeriana.quiz.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> registrarProducto(@Valid @RequestBody Producto producto) {
        Producto productoGuardado = productoService.registrarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoGuardado);
    }

    @GetMapping("/buscar/{categoria}")
    public ResponseEntity<List<Producto>> buscarPorCategoria(@PathVariable String categoria) {
        List<Producto> productos = productoService.buscarPorCategoria(categoria);
        return ResponseEntity.ok(productos);
    }
}
