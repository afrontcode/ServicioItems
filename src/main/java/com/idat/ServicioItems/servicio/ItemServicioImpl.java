package com.idat.ServicioItems.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ServicioItems.model.Items;
import com.idat.ServicioItems.repositorio.ItemRepositorio;

@Service
public class ItemServicioImpl implements ItemServicio {

	@Autowired
	public ItemRepositorio repositorio;
	
	@Override
	public void guardarItem(Items item) {
		// TODO Auto-generated method stub
		repositorio.guardarItem(item);
	}

	@Override
	public void editarItem(Items item) {
		// TODO Auto-generated method stub
		repositorio.editarItem(item);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminarItem(id);
	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		return repositorio.listarItems();
	}

	@Override
	public Items obtenerItemsId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtenerItemsId(id);
	}

}
