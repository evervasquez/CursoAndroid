package com.android.login.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.login.R;
import com.android.login.model.Item;

public class GridAdapter extends BaseAdapter {
	private Context actividad;
	private ArrayList<Item> arrayitems;

	public GridAdapter(Context activity, ArrayList<Item> items) {
		this.actividad = activity;
		this.arrayitems = items;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayitems.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	static class ViewHolder {
		ImageView imagen;
		TextView titulo;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewholder;
		View v = convertView;
		viewholder = new ViewHolder();
		//inflamos el layout
		//
		if (convertView == null) {
			LayoutInflater inf = (LayoutInflater) actividad
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inf.inflate(R.layout.grid_item, null);
			viewholder.titulo = (TextView) v.findViewById(R.id.txt_content);
			viewholder.imagen = (ImageView) v.findViewById(R.id.img_content);
			v.setTag(viewholder);
		}
		
		 Item dir = arrayitems.get(position);
		
		//Rellenamos la información utilizando el ViewHolder
	        viewholder = (ViewHolder) v.getTag();
	        viewholder.titulo.setText(dir.getTitulo());
	        viewholder.imagen.setImageResource(dir.getImagen());
	 
	        // Retornamos la vista
	        return v;
	}

}