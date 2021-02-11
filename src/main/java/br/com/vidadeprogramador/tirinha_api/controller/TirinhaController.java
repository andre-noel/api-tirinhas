package br.com.vidadeprogramador.tirinha_api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vidadeprogramador.tirinha_api.dao.TirinhaDao;
import br.com.vidadeprogramador.tirinha_api.model.Tirinha;

@RestController
public class TirinhaController {
	@Autowired
	private TirinhaDao dao;

	@GetMapping("/tirinhas")
	public ArrayList<Tirinha> recuperarTudo() {
		ArrayList<Tirinha> lista;
		lista = (ArrayList<Tirinha>) dao.findAll();
		return lista;
	}
}
