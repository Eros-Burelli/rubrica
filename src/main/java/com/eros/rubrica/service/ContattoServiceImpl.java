package com.eros.rubrica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eros.rubrica.model.Contatto;
import com.eros.rubrica.repository.ContattoRepository;

@Service("contattoService")
public class ContattoServiceImpl implements ContattoService{

	@Autowired
	private ContattoRepository contattoRepository;
	
	@Override
	public void salvaContatto(Contatto contatto) {
		contattoRepository.save(contatto);
	}

	@Override
	public void eliminaContatto(Long id) {
		contattoRepository.deleteById(id);
	}

	@Override
	public List<Contatto> getAll() {
		return contattoRepository.findAll();
	}

}
