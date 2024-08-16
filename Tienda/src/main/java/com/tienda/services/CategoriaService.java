package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se obtiene los registros de la tabla categoria en un array list de objetos categoria, todos o solo los activos
    public List<Categoria> getCategorias(boolean activos);
    
    //Recupera el registro de la tabla categoria en un objeto categoria si el idCategoria existe sino devuelve null
    public Categoria getCategoria(Categoria categoria);
    
    //Actualiza un registro en la tabla categoria si el idCategoria existe
    //crea un registro en la tabla categoria si idCategoria no tiene valor 
    
    public void save(Categoria categoria);
    
    //Elimina el registro de la tabla categoria si idCategoria existe en la tabla
    public void delete(Categoria categoria);
}
