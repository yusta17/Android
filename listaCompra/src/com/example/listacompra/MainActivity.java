package com.example.listacompra;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	
	private ListView lista;
	private ArrayList<Articulo> datos = new ArrayList<Articulo>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		lista = (ListView)findViewById(R.id.List);
		datos.add(new Articulo("pan", false));
		datos.add(new Articulo("leche", false));
		datos.add(new Articulo("periodico", false));
		datos.add(new Articulo("fruta", false));
		datos.add(new Articulo("carne", false));
		
		
		
		Adaptador adp = new Adaptador(this, datos);
		
		lista.setAdapter(adp);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
