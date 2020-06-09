package com.gonzalo.erickaUnique.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gonzalo.erickaUnique.interfaceService.IProductoService;
import com.gonzalo.erickaUnique.interfaces.IProducto;
import com.gonzalo.erickaUnique.model.Producto;


@Controller
@RequestMapping
public class ProductoControlller {
	
	@Autowired
	private IProductoService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		List<Producto> productos = service.listar();
		model.addAttribute("productos", productos );
		return "index";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto>productos = service.listar();
		model.addAttribute("productos", productos);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Producto p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{codigo}")
	public String editar(@PathVariable int codigo, Model model) {
		Optional<Producto> producto = service.listarCodigo(codigo);
		model.addAttribute("producto", producto);
		return "form";
	}
	
	@GetMapping("/eliminar/{codigo}")
	public String delete(Model model, @PathVariable int codigo) {
		service.delete(codigo);
		return "redirect:/listar";
	}

}
