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
    TextView name, phone;
    MainActivity m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_contacts);

        intentMain = getIntent();
        contacts = (Contacts)intentMain.getSerializableExtra("Contacts");


        name = (TextView)findViewById(R.id.name_field);
        phone = (TextView)findViewById(R.id.number_field);

        if (m.cnt == 1) {

            name.setText(name.getText() + contacts.Nombre1());
            phone.setText(phone.getText() + contacts.Numero1());
        }

        if (m.cnt == 2) {

            name.setText(name.getText() + contacts.Nombre1());
            phone.setText(phone.getText() + contacts.Numero1());
        }

        if (m.cnt == 3) {

            name.setText(name.getText() + contacts.Nombre1());
            phone.setText(phone.getText() + contacts.Numero1());
        }
    }
}
