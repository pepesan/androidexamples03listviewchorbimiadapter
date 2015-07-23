package com.plexxoo.android.test;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;

public class Androidexamples03listviewActivity 
extends ListActivity {
    private ChorbiAdapter adapter;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  
	  /*
	  List<String> listado=new ArrayList<String>();
	  listado.add("cadena");
	  listado.add("cadena");
	  listado.add("cadena");
	  listado.add("cadena");
	  System.out.println(listado.size());
	  String cad=listado.get(1);
	  System.out.println(cad);
	  listado.remove(1);
	  System.out.println(listado.size());
	  */
	  adapter=new ChorbiAdapter(
			  this,R.layout.list_item, CHORBIS);
	  setListAdapter(adapter);

	  ListView lv = getListView();
	  //lv.setTextFilterEnabled(true);

	  lv.setOnItemClickListener(new OnItemClickListener() {
	    public void onItemClick(AdapterView<?> parent, 
	    		View view,
	        int position, long id) {
	    	TextView tv=(TextView) view;
	      // When clicked, show a toast with the TextView text
	      Toast.makeText(	getApplicationContext(), 
	    		  			adapter.getItem(position).getNumero(),
	    		  			Toast.LENGTH_SHORT).show();
	    }


	  });
	}
	static final Chorbi[] CHORBIS = new Chorbi[] {
			new Chorbi("Laura","+24 656661489",(long)30),
			new Chorbi("Begoña","+34 656661499",(long)31),
			new Chorbi("Luis","+34 656661569",(long)32),
			new Chorbi("Iban","+34 656666985",(long)1),
			new Chorbi("Laura","+24 656661489",(long)3),
			new Chorbi("Begoña","+34 656661499",(long)6),
			new Chorbi("Luis","+34 656661569",(long)9),
			new Chorbi("Iban","+34 656666985",(long)10),
			new Chorbi("Laura","+24 656661489",(long)11),
			new Chorbi("Begoña","+34 656661499",(long)12),
			new Chorbi("Luis","+34 656661569",(long)13),
			new Chorbi("Iban","+34 656666985",(long)14),
			new Chorbi("Laura","+24 656661489",(long)15),
			new Chorbi("Begoña","+34 656661499",(long)16),
			new Chorbi("Luis","+34 656661569",(long)17),
			new Chorbi("Iban","+34 656666985",(long)18),
			new Chorbi("Laura","+24 656661489",(long)19),
			new Chorbi("Begoña","+34 656661499",(long)20),
			new Chorbi("Luis","+34 656661569",(long)21),
			new Chorbi("Iban","+34 656666985",(long)22)
	    };
}