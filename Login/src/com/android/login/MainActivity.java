package com.android.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static final String usuario = "ever";
	private static final String clave = "123";
	private EditText user;
	private EditText pass;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		user = (EditText) findViewById(R.id.txt_usuario);
		pass = (EditText) findViewById(R.id.txt_clave);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void validarAcceso(View view) {
		String usuario = user.getText().toString();
		String clave = pass.getText().toString();

		if (usuario.equals("") | clave.equals("")) {
			Toast.makeText(getApplicationContext(),
					"Ingrese sus datos correctamente" + usuario,
					Toast.LENGTH_SHORT).show();
		} else {
			if (MainActivity.usuario.equals(usuario)
					&& MainActivity.clave.equals(clave)) {
				Intent intent = new Intent(MainActivity.this,
						PrincipalActivity.class);
				intent.putExtra("usuario", MainActivity.usuario);
				startActivity(intent);
			} else {
				Toast.makeText(getApplicationContext(), "Usuario Incorrecto",
						Toast.LENGTH_SHORT).show();
			}
		}

	}
}
