package com.example.centauro.proyectollamadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intentContacts;
    Contacts contacts;

    Button b_zero, b_one, b_two, b_three, b_four, b_five, b_six, b_seven, b_eight, b_nine, b_call, b_star, b_hashtag;
    TextView screen;
    String number;
    int cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new Contacts();

        b_zero = (Button) findViewById(R.id.button_zero);
        b_one = (Button) findViewById(R.id.button_one);
        b_two = (Button) findViewById(R.id.button_two);
        b_three = (Button) findViewById(R.id.button_three);
        b_four = (Button) findViewById(R.id.button_four);
        b_five = (Button) findViewById(R.id.button_five);
        b_six = (Button) findViewById(R.id.button_six);
        b_seven = (Button) findViewById(R.id.button_seven);
        b_eight = (Button) findViewById(R.id.button_eight);
        b_nine = (Button) findViewById(R.id.button_nine);

        b_call = (Button) findViewById(R.id.button_zero);
        b_star = (Button) findViewById(R.id.button_zero);
        b_hashtag = (Button) findViewById(R.id.button_zero);

        screen = (TextView) findViewById(R.id.screen);


        b_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.zero).toString());
            }
        });

        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.one).toString());
            }
        });

        b_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.two).toString());
            }
        });

        b_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.three).toString());
            }
        });

        b_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.four).toString());
            }
        });

        b_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.five).toString());
            }
        });

        b_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.six).toString());
            }
        });

        b_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.seven).toString());
            }
        });

        b_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.eight).toString());
            }
        });

        b_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.nine).toString());
            }
        });

        b_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.star).toString());
            }
        });

        b_hashtag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen.setText(screen.getText() + getText(R.string.hashtag).toString());
            }
        });


        b_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = screen.getText().toString();

                if (NumberOK(number, contacts)){

                    intentContacts= new Intent(getApplicationContext(), Contacts.class);
                    intentContacts.putExtra("Contacts", contacts);
                    startActivity(intentContacts);
                    finish();

                }
            }
        });
    }

    private boolean NumberOK(String Number, Contacts ContactsInstance)
    {
        if(contacts.Numero1().equals(Number))
        {
            cnt = 1;
            return true;
        }

        if (contacts.Numero2().equals(Number)){

            cnt = 2;
            return true;
        }

        if (contacts.Numero3().equals(Number)){

            cnt = 3;
            return true;
        }

        else
        {
            cnt = 0;
            return false;
        }

    }
}
