package com.jpa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.jpa.demo.models.Categoria;
import com.jpa.demo.models.Solicitud;
import com.jpa.demo.models.Vacante;
import com.jpa.demo.services.ICategoriaService;
import com.jpa.demo.services.ISolicitudesService;
import com.jpa.demo.services.IVacanteService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ICategoriaService categoriaService;

	@Autowired
	private ISolicitudesService solicitudesService;

	@Autowired
	private IVacanteService vacanteService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Optional<Vacante> vacanteObtenida = vacanteService.buscarId(4);
		System.out.println("Vacante con id 4 encontrada: " + vacanteObtenida.get().getNombre());

		vacanteService.modificar(4);

		Optional<Vacante> vacanteModificada = vacanteService.buscarId(4);
		System.out.println("Vacante con id 4 modificada: " + vacanteModificada.get().getNombre());

		vacanteService.eliminar(5);

		Optional<Vacante> vacanteEliminada = vacanteService.buscarId(5);
		System.out.println("Vacante con id 5 eliminada: " + vacanteEliminada);

	}
}
