package model;

public class Rectangulo {

    private float base;
    private float altura;
    private float area;

    public Rectangulo() {
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

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float calcularArea() {
        setArea(getBase() * getAltura());
        return getArea();
    }

}
