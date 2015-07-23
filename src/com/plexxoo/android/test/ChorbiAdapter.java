package com.plexxoo.android.test;

import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ChorbiAdapter extends BaseAdapter {
	
	private Context c;
	private int vista;
	private List<Chorbi> listado;
	
	public ChorbiAdapter(Context c,int vista,List<Chorbi> lista){
		this.listado=lista;
		this.vista=vista;
		this.c=c;
	}
	public ChorbiAdapter(Context c,int vista,Chorbi[] lista){
		try{
			listado=new LinkedList<Chorbi>();
			for(int i=0;i<lista.length;i++){
				listado.add(lista[i]);
			}
		}catch(Exception e){
			Log.d("Excepcion!", e.getLocalizedMessage());
		}
		this.vista=vista;
		this.c=c;
	}

	@Override
	public int getCount() {
		return listado.size();
	}

	@Override
	public Chorbi getItem(int position) {
		if(null == listado){
			return null;
		}else{
			return listado.get(position);
		}
	}

	@Override
	public long getItemId(int position) {
		return listado.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, 
						ViewGroup parent) {
		Log.d("getView",""+position);
		TextView tli;
		if (null == convertView) {
			tli = (TextView)View.inflate(c,vista, null);
		} else {
			tli = (TextView)convertView;
		}
		Chorbi choni=listado.get(position);
		String texto=choni.getNombre();
		tli.setText(texto);
		return tli;
	}

}
