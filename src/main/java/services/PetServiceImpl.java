package services;

import java.util.List;

import com.anton.model.Pet;

import Repository.PetRespository;

public class PetServiceImpl implements PetServices {
	
	PetRespository petrepository = new PetRespository();

	@Override
	public List<Pet> listar() {
		
		List<Pet>lista = petrepository.listar();
		
		return lista;
	}

}
