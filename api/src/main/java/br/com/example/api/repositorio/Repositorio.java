package br.com.example.api.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.example.api.modelo.Pessoa;

public interface Repositorio extends CrudRepository<Pessoa, Integer>{

}