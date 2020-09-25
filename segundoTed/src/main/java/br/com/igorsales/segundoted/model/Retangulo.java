package br.com.igorsales.segundoted.model;

public class Retangulo {

    private float base;
    private float altura;
    private float espessura;

    public Retangulo(float base, float altura, float espessura) {
        this.base = base;
        this.altura = altura;
        this.espessura = espessura;
    }

    public Retangulo() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea(){
        return this.altura * this.base;
    }

    public float getMolduraArea(){
        float areaRetanguloInterno = (this.base - (2 * this.espessura)) * (this.altura - (2 * this.espessura));
        return this.getArea() - areaRetanguloInterno;
    }
}
