package com.idat.ServicioItems.servicio;

import java.util.List;

import com.idat.ServicioItems.model.Items;

public interface ItemServicio {
	public void guardarItem(Items item);
	public void editarItem(Items item);
	public void eliminarItem(Integer id);
	public List<Items> listarItems(); 
	public Items obtenerItemsId(Integer id);
}
