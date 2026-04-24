package model;

public class Cuadrado {

    private float lado;
    private float area;

    public Cuadrado() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float calcularArea() {
        setArea(getLado() * getLado());
        return getArea();
    }
}
