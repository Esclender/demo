
package com.jpa.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.models.Categoria;
import com.jpa.demo.models.Usuarios;
import com.jpa.demo.repository.interfaces.UsusarioRepository;
import com.jpa.demo.services.IUsuarioService;

@Service
class UsuarioServiceImpl implements IUsuarioService {

  @Autowired
  private UsusarioRepository usuarioRepository;

  @Override
  public void guardar(Usuarios usuarios) {
    usuarioRepository.save(usuarios);
  }

  @Override
  public void guardarTodo(Iterable<Usuarios> usuarioss) {
    usuarioRepository.saveAll(usuarioss);
  }

  @Override
  public Iterable<Usuarios> buscarTodos() {
    return usuarioRepository.findAll();
  }

  @Override
  public Optional<Usuarios> buscarId(Integer id) {
    return usuarioRepository.findById(id);
  }

  @Override
  public boolean existe(Integer id) {
    return usuarioRepository.existsById(id);
  }

  @Override
  public void modificar(Integer id) {
    Optional<Usuarios> optionalUsuario = usuarioRepository.findById(id);
    if (optionalUsuario.isPresent()) {
      Usuarios usuario = optionalUsuario.get();
      // Modify the usuario object as needed
      usuarioRepository.save(usuario);
    }
  }

  @Override
  public void eliminar(Integer id) {
    usuarioRepository.deleteById(id);
  }

  @Override
  public void eliminarTodos() {
    usuarioRepository.deleteAll();
  }

  @Override
  public Iterable<Usuarios> generateUsuariossMockData() {
    Usuarios usuario = new Usuarios();
    usuario.setNombre("Juan");
    usuario.setEmail("");

    return List.of(
        usuario);
  }
}
