package com.ever.recetario;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mFragmet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mFragmet = (FragmentTabHost) findViewById(android.R.id.tabhost);
				
		mFragmet.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		
		mFragmet.addTab(mFragmet.newTabSpec("tag1").setIndicator(("Recetario"),
                getResources().getDrawable(android.R.drawable.ic_popup_sync)),
                RecetarioFragment.class, null);
		
		mFragmet.addTab(mFragmet.newTabSpec("tag1").setIndicator(("Categorias"),
                getResources().getDrawable(android.R.drawable.ic_popup_sync)),
                CategoriasFragment.class, null);
		
		mFragmet.addTab(mFragmet.newTabSpec("tag1").setIndicator(("Platos"),
                getResources().getDrawable(android.R.drawable.ic_popup_sync)),
                PlatosFragment.class, null);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
