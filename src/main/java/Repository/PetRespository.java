package Repository;

import java.util.ArrayList;
import java.util.List;

import com.anton.model.Pet;

public class PetRespository {
	
	public List<Pet> listar(){
		
		System.out.println("Estoy en listar");
		
		Pet pet1 = new Pet(1,"Lola","alta",2,"10-12-12", "Pedro Lopez");
		Pet pet2 = new Pet(2,"juana","baja",2,"10-12-12", "Marta Suarez");
		Pet pet3 = new Pet(3,"perrito","alta",2,"10-12-12", "Pedro Duque");
		Pet pet4 = new Pet(4,"gatita","alta",2,"10-12-12", "anton reino");
		
		List<Pet> lista = new ArrayList();
		
		lista.add(pet1);
		lista.add(pet2);
		lista.add(pet3);
		lista.add(pet4);
		
		return lista;
		
	}
}
