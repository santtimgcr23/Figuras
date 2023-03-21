public class Rectangulo extends Figura{
    private double base;
    private double altura;
    private int lados = 4;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (this.obtenerLados() == rectPorComparar.obtenerLados()){
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
