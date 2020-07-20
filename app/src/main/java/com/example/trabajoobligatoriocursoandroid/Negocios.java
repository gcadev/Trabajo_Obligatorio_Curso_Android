package com.example.trabajoobligatoriocursoandroid;

public class Negocios {
    private String negocio,ofertas;
    private int imgNegocio;

    public Negocios(String negocio, String ofertas, int imgNegocio) {
        this.negocio = negocio;
        this.ofertas = ofertas;
        this.imgNegocio = imgNegocio;
    }

    public String getNegocio() {
        return negocio;
    }

    public String getOfertas() {
        return ofertas;
    }

    public int getImgNegocio() {
        return imgNegocio;
    }

}

