package com.example.centauro.proyectollamadas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by Centauro on 02/09/2016.
 */
public class ContactsInfo extends Activity{

    Intent intentMain;
    Contacts contacts;
    Integer cont;
    String num;
    TextView name, phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_contacts);

        intentMain = getIntent();
        contacts = (Contacts)intentMain.getSerializableExtra("ContactsInfo");
        cont = (Integer) intentMain.getSerializableExtra("contador");
        num = (String) intentMain.getSerializableExtra("numero");


        name = (TextView)findViewById(R.id.name_field);
        phone = (TextView)findViewById(R.id.number_field);

        if (cont == 1) {

            name.setText(contacts.Nombre1());
            phone.setText(contacts.Numero1());

        }

        if (cont == 2) {

            name.setText(contacts.Nombre2());
            phone.setText(contacts.Numero2());

        }

        if (cont == 3) {

            name.setText(contacts.Nombre3());
            phone.setText(contacts.Numero3());

        }

        if (cont == 4) {

            name.setText(R.string.desconocido);
            phone.setText(num);
        }

    }
}
