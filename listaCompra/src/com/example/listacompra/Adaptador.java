package com.example.listacompra;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Adaptador extends ArrayAdapter<Articulo>{
	Activity contexto;
	ArrayList<Articulo> datos = new ArrayList<Articulo>();
	
	public Adaptador(Activity contexto, ArrayList<Articulo> datos) {
		super(contexto,R.layout.articulos, datos);
		this.contexto = contexto;
		this.datos = datos;
	}
	
	
	public View getView(int position, View convertView, ViewGroup parent){
		View item = convertView;
		
		if(item == null){
			LayoutInflater inflater = contexto.getLayoutInflater();		
			item = inflater.inflate(R.layout.articulos, null);
			
		}
		
		Articulo elemento = getItem(position);
		if(elemento!=null){
			TextView _titulo = (TextView)item.findViewById(R.id.tituloItem);
			_titulo.setText(elemento.getNombre());
			
//			if (datos.get(position).isComprado()) {
//				elemento.getNombre().setPaintFlags(elemento.getNombre().getPaintFlags() |
//				Paint.STRIKE_THRU_TEXT_FLAG);
//				elemento.getNombre().setTextColor(Color.parseColor("#00FF00"));
//				} else {
//				nombreArticulo.setPaintFlags(nombreArticulo.getPaintFlags()
//				&~Paint.STRIKE_THRU_TEXT_FLAG);
//				nombreArticulo.setTextColor(Color.parseColor("#FF0000"));
//			}
			
			
			}
		return item;
	}
	
	
}