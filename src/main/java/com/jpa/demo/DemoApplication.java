package com.jpa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.demo.models.Categoria;
import com.jpa.demo.services.ICategoriaService;
import com.jpa.demo.services.IVacanteService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ICategoriaService categoriaService;

	@Autowired
	private IVacanteService vacanteService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoriaService.buscarTodos();
		categoriaService.guardar(new Categoria("Programación ", "Desarrollo de software"));

	}
}
