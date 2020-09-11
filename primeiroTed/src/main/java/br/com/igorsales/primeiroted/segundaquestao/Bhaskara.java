package br.com.igorsales.primeiroted.segundaquestao;

public class Bhaskara {

    float delta;
    float x1;
    float x2;
    float a;
    float b;
    float c;

    public Bhaskara(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcBhaskara(){
        this.delta = (float) (Math.pow(b, 2) - (4 * a * c));
    }

    public float getDelta() {
        return delta;
    }

    public void calcX1() {
        this.x1 = (float) ((-b  + Math.sqrt(delta))/(2 * a));
    }

    public float getX1() {
        return x1;
    }

    public void calcX2() {
        this.x2 = (float) ((b  + Math.sqrt(delta))/(2 * a));
    }

    public float getX2() {
        return x2;
    }
}
