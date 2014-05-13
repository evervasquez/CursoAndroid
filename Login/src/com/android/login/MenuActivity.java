package com.android.login;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;

import com.android.login.adapters.GridAdapter;
import com.android.login.model.Item;

public class MenuActivity extends Activity {
	private GridView grid;
	private ArrayList<Item> items;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);

		grid = (GridView) findViewById(R.id.gridmenu);
		items = new ArrayList<Item>();

		items.add(new Item(R.drawable.profile, "Perfil"));
		items.add(new Item(R.drawable.facebook, "Facebook"));
		items.add(new Item(R.drawable.skype, "Skype"));
		items.add(new Item(R.drawable.qr, "CodigoQR"));
		items.add(new Item(R.drawable.profile, "Contacto"));

		GridAdapter adapter = new GridAdapter(this, items);
		grid.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
