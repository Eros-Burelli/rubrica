package com.eros.rubrica.service;

import java.util.List;

import com.eros.rubrica.model.Contatto;

public interface ContattoService {
	public void salvaContatto(Contatto contatto);
	public void eliminaContatto(Long id);
	public List<Contatto> getAll();
}
