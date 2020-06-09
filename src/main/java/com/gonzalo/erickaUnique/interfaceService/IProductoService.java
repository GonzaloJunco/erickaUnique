package com.gonzalo.erickaUnique.interfaceService;

import java.util.List;
import java.util.Optional;

import com.gonzalo.erickaUnique.model.Producto;

public interface IProductoService{
	
	public List<Producto> listar();
	public Optional<Producto> listarCodigo(int codigo);
	public int save(Producto p);
	public void delete(int codigo);

}
