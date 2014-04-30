package com.android.precalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText num1, num2;
	private String numero1, numero2;
	private double res;
	private TextView resultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// recuperamos objetos Editext del layout
		num1 = (EditText) findViewById(R.id.edt_num1);
		num2 = (EditText) findViewById(R.id.edt_num2);

		resultado = (TextView) findViewById(R.id.txt_resultado);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void sumar(View view) {
		numero1 = num1.getText().toString().trim();
		numero2 = num2.getText().toString().trim();

		if (!numero1.equals("") || !numero2.equals("")) {
			res = Double.parseDouble(numero1) + Double.parseDouble(numero2);
			resultado.setText("la suma de " + numero1 + " y " + numero2
					+ " es " + res);
			num1.setText("");
			num2.setText("");
			
			num1.requestFocus();
		} else {
			Toast.makeText(getApplicationContext(),
					"Ingrese los numeros correctamente", Toast.LENGTH_SHORT)
					.show();
		}

	}

	public void restar(View view) {
		numero1 = num1.getText().toString().trim();
		numero2 = num2.getText().toString().trim();

		if (!numero1.equals("") || !numero2.equals("")) {
			res = Double.parseDouble(numero1) - Double.parseDouble(numero2);
			resultado.setText("la resta de " + numero1 + " y " + numero2
					+ " es " + res);
			
			num1.setText("");
			num2.setText("");
			
			num1.requestFocus();
		} else {
			Toast.makeText(getApplicationContext(),
					"Ingrese los numeros correctamente", Toast.LENGTH_SHORT)
					.show();
		}
	}

	public void multiplicar(View view) {
		numero1 = num1.getText().toString().trim();
		numero2 = num2.getText().toString().trim();
		
		//comparamos si esta en vacio
		if (!numero1.equals("") || !numero2.equals("")) {
			res = Double.parseDouble(numero1) * Double.parseDouble(numero2);
			resultado.setText("la multiplicación de " + numero1 + " y " + numero2
					+ " es " + res);
			
			num1.setText("");
			num2.setText("");
			
			num1.requestFocus();
		} else {
			Toast.makeText(getApplicationContext(),
					"Ingrese los numeros correctamente", Toast.LENGTH_SHORT)
					.show();
		}
	}

	public void dividir(View view) {
		numero1 = num1.getText().toString().trim();
		numero2 = num2.getText().toString().trim();

		if (!numero1.equals("") || !numero2.equals("")) {
			
			if(Integer.parseInt(numero2) != 0){
			res = Double.parseDouble(numero1) / Double.parseDouble(numero2);
			resultado.setText("la dividir de " + numero1 + " y " + numero2
					+ " es " + res);
			
			num1.setText("");
			num2.setText("");
			
			num1.requestFocus();
			}else{
				Toast.makeText(getApplicationContext(),
						"La divición entre 0 no existe", Toast.LENGTH_SHORT)
						.show();
			}
		} else {
			Toast.makeText(getApplicationContext(),
					"Ingrese los numeros correctamente", Toast.LENGTH_SHORT)
					.show();
		}
	}
}
