package com.empresa.empresaNueva.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empresaNueva.service.PedidoMujerService;
import com.empresa.empresaNueva.dto.PedidoGeneral;
import com.empresa.empresaNueva.repository.PedidoMujerRepository;
import com.empresa.empresaNueva.dao.PedidoMujer;

@Service
public class PedidoMujerServiceImpl implements PedidoMujerService {

	@Autowired
	PedidoMujerRepository repository;

	@Override
	public PedidoGeneral getPedido(Integer id) {
		
		Optional<PedidoMujer> data=repository.findById(id);
        PedidoGeneral pedido;
        
		if (data.isPresent())
            pedido = new PedidoGeneral(data.get().getDemoID());	
		else
            pedido= new PedidoGeneral(0);

		return pedido;
	}

    /* 
    @Override
    public PedidoMujer getPedido(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPedido'");
    }
    */



	
}