package com.chr.IoC;

public class SecretaryEmploye implements Employe {

    @Override
    public String getTasks() {
        return "Gestionar la agenda de los jefes";
    }
}
