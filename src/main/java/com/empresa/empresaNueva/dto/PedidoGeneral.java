package com.empresa.empresaNueva.dto;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

public class PedidoGeneral {
    
    private Integer id;
   
    public PedidoGeneral(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Pedido [id=" +id+ "]";
    }
}