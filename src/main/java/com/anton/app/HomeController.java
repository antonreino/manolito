package com.anton.app;

import java.util.List;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anton.model.Pet;

import services.PetServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView listar() {
		
		PetServiceImpl petServiceImpl = new PetServiceImpl();
		
		List<Pet> lista = petServiceImpl.listar();
		
		return new ModelAndView("home", "lista", lista);
				
	}
	
	@RequestMapping(value ="/getPet", method = RequestMethod.GET)
	public ModelAndView verPet(String idPet, Model model) {
		
		PetServiceImpl petServiceImpl = new PetServiceImpl();		
		List<Pet> lista = petServiceImpl.listar();
		
		System.out.println("El id de detalle de mascota: "+ idPet);
		
		int idPetInt = Integer.parseInt(idPet);
		
		Pet detalle = new Pet();
		for (Pet pets: lista) {
			System.out.println("Mascotas"+ pets);
			if(pets.getId() == idPetInt) {
				detalle = pets;
			}		
		}
		
		int id = detalle.getId();
		String nombre = detalle.getNombre();
		String estado = detalle.getEstado();
		int visitas = detalle.getVisitas();
		String fechaNac = detalle.getFechaNac();
		String propietario = detalle.getPropietario();
		
		
		model.addAttribute("id", id );
		model.addAttribute("nombre", nombre );
		model.addAttribute("estado", estado );
		model.addAttribute("visitas", visitas );
		model.addAttribute("fechaNac", fechaNac );
		model.addAttribute("propietario", propietario );
		
		return new ModelAndView("verPet");				
	}
	
}
