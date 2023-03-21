public class Triangulo extends Figura {
    private int lados = 3;
    private double altura;
    private double base;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }

    public int compareTo(Triangulo triPorComparar){
        double areaPorComparar = triPorComparar.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (this.obtenerLados() == triPorComparar.obtenerLados()){
            return 0;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
            }
            return -1;
        }

    @Override
    public int obtenerLados() {
        return lados;
    }
}
