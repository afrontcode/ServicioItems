package com.idat.ServicioItems.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.ServicioItems.model.Items;


@Repository
public class ItemRepositorioImpl implements ItemRepositorio {
	
	public List<Items> listar = new ArrayList<Items>();

	@Override
	public void guardarItem(Items item) {
		// TODO Auto-generated method stub
		listar.add(item);
	}

	@Override
	public void editarItem(Items item) {
		// TODO Auto-generated method stub
		listar.remove(obtenerItemsId(item.getIdItem()));
		listar.add(item);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerItemsId(id));
	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Items obtenerItemsId(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(item ->item.getIdItem() == id).findFirst().orElse(null);
	}

}
