package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao extends JpaRepository<Producto,Long>{
    
    //Una consulta ampliada por precio
    public List<Producto> findByPrecioBetweenOrderByDescripcion (double precioInf, double precioSup); //introductores son maneras de filtrar lo que quiero buscar
    
    //una consulta mediante JPQL
    @Query(value="SELECT a FROM Producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> consultaJPQL (double precioInf, double precioSup);
    
    //una consulta mediante SQL
    @Query(nativeQuery=true, value="SELECT * FROM producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> consultaSQL (double precioInf, double precioSup);
}
