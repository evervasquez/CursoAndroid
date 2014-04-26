package com.android.clase2;

import android.content.Context;
import android.widget.Toast;


public class Android {
	private static Context contexto;
	private static Android instancia = null;
	
	private Android() {}
	
	public static Android getInstancia(Context contexto){
		if(instancia == null){
			instancia = new Android();
		}
		
		//inicializamos las variables
		Android.contexto = contexto;
		return instancia;
	}
	
	public void setMensaje(String mensaje) {
		Toast.makeText(contexto,mensaje, Toast.LENGTH_LONG).show();
	}
}
