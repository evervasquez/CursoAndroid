package com.android.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrincipalActivity extends Activity {
	private String usuario;
	private ListView lista;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		Bundle bundle = getIntent().getExtras();
		usuario = bundle.getString("usuario");
		lista = (ListView) findViewById(R.id.lista_principal);
		getActionBar().setTitle("Bienvenido "+usuario);
		getActionBar().setSubtitle("Usuario Activo");
		
		String[] items = new String[] { "Menu", "Usuario", "Compartir", "Salir" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, items);
		
		lista.setAdapter(adapter);
		
		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast.makeText(getApplicationContext(), "" + arg2,
						Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}
