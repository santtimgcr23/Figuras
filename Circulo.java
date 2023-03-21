public class Circulo extends Figura {
    private double radio;
    int lados = 0;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public int compareTo(Circulo circPorComparar){
        double areaPorComparar = circPorComparar.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (this.obtenerLados() == circPorComparar.obtenerLados()){
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
