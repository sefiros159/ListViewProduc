package com.example.sefir.listviewproduc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView txt;
    private ListView Lista;
    private TextView txtPrecio;

    //datos con los que se llena el ListView
    private String productos[] = {"Computadora", "Mouse", "Dulces", "Hojas", "Lapices", "Lentes",
            "Reloj", "Cuchara", "Celular", "Mesa", "Refrigerador", "Horno", "Audifonos"};
    private String categoria[] = {"Electronica", "Electronica", "Dulceria", "Papeleria",
            "Papeleria", "Moda", "Perfumeria", "Hogar", "Electronicos", "Hogar",
            "Electrdomesticos", "Electrodomesticos", "Electronica"};
    private String precios[] = {"$8,000.00", "$120.00", "$25.00", "$60.00", "$2.00", "$120.00",
            "$320.00", "$5.00", "$4,000.00", "$6,000", "$7,500.00", "$2,100.00", "$200.00",};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txt);
        Lista = (ListView) findViewById(R.id.Lista);
        txtPrecio = (TextView) findViewById(R.id.txtPrecio);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productos);
        Lista.setAdapter(adapter);
        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                txt.setText("Categoria elegido: " + categoria[position]);
                txtPrecio.setText("Precio: "+ precios[position]);
            }
        });
    }
}
