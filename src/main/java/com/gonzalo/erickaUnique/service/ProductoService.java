package com.gonzalo.erickaUnique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonzalo.erickaUnique.interfaceService.IProductoService;
import com.gonzalo.erickaUnique.interfaces.IProducto;
import com.gonzalo.erickaUnique.model.Producto;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> listar() {
		return (List<Producto>) data.findAll();
	}

	@Override
	public Optional<Producto> listarCodigo(int codigo) {
		// TODO Auto-generated method stub
		return data.findById(codigo);
	}

	@Override
	public int save(Producto p) {
		int res=0;
		Producto producto = data.save(p);
		if (!producto.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int codigo) {
		data.deleteById(codigo);
	}

	

}
