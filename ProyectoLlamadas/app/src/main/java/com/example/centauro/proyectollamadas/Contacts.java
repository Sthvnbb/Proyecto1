package com.example.centauro.proyectollamadas;

import java.io.Serializable;

public class Contacts implements Serializable {

        private String nombre1 = "Gabriel ";
        private String nombre2 = "Carolina";
        private String nombre3 = "David";

        private String numero1 = "84532386";
        private String numero2 = "89323235";
        private String numero3 = "80974134";

    public String Nombre1() {

        return nombre1;

    }

    public String Numero1() {

        return numero1;

    }

    public String Nombre2() {

        return nombre2;

    }

    public String Numero2() {

        return numero2;

    }

    public String Nombre3() {

        return nombre3;

    }

    public String Numero3() {

        return numero3;

    }

}
