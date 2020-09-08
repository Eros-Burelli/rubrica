package com.eros.rubrica.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eros.rubrica.model.Contatto;
import com.eros.rubrica.service.ContattoService;

@Controller
public class ContattoController {

	@Autowired
	private ContattoService contattoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listaContatti() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listacontatti");
		mv.addObject("contatti", contattoService.getAll());
		return mv;
	}
	
	@RequestMapping(value = "/nuovocontatto", method = RequestMethod.GET)
	public ModelAndView nuovoContatto() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("contatto", new Contatto());
		return mv;
	}
	
	@RequestMapping(value = "/salvacontatto", method = RequestMethod.POST)
	public ModelAndView salvaContatto(@Valid Contatto contatto, BindingResult br) {
		contattoService.salvaContatto(contatto);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/eliminacontatto/{id}", method = RequestMethod.GET)
	public ModelAndView eliminaContatto(@PathVariable Long id) {
		contattoService.eliminaContatto(id);
		return new ModelAndView("redirect:/");
	}
}
