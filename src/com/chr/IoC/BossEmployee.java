package com.chr.IoC;

public class BossEmployee implements Employe {
    public String getTasks() {
        return "Gestiono las cuestiones relativas a mis empleados de seccion";
    }

    @Override
    public String getReport() {
        return null;
    }
}
