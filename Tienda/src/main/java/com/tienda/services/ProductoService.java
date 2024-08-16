package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //Se obtiene los registros de la tabla producto en un array list de objetos producto, todos o solo los activos
    public List<Producto> getProductos(boolean activos);
    
    //Recupera el registro de la tabla producto en un objeto producto si el idProducto existe sino devuelve null
    public Producto getProducto(Producto producto);
    
    //Actualiza un registro en la tabla producto si el idProducto existe
    //crea un registro en la tabla producto si idProducto no tiene valor 
    
    public void save(Producto producto);
    
    //Elimina el registro de la tabla producto si idProducto existe en la tabla
    public void delete(Producto producto);
    
    
    //Recupera un listado de registros producto filtrados por precio y orden de descripcion
    public List<Producto> consulta1 (double precioInf, double precioSup);
    
    //Recupera un listado de registros producto filtrados por precio y orden de descripcion
    public List<Producto> consulta2 (double precioInf, double precioSup);
    
    //Recupera un listado de registros producto filtrados por precio y orden de descripcion
    public List<Producto> consulta3 (double precioInf, double precioSup);
}
