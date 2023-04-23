package com.empresa.empresaNueva.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  com.empresa.empresaNueva.service.*;

@RestController
@RequestMapping("/data")
public class PedidoMujerController {

	@Autowired
	PedidoMujerService service;
	
	
	@GetMapping("/pedido")
	public ResponseEntity<Object> pedido(@RequestParam(required = false) Integer id) {
		
		if (id == null) {
			id =0;
		}
		
		return new ResponseEntity<>(service.getPedido(id),HttpStatus.OK);
	}

}
