/*  Instituto Tecnológico de Costa Rica
 *  Escuela de Ingeniería en Computación
 *  Realizado por Santiago Moreno Granados
 *  c.2022040858*/

public class Main {
    public static void main(String[] args){
        Rectangulo r = new Rectangulo(2, 5);
        System.out.println(r.compareTo(new Rectangulo (2,5)));

        Circulo c = new Circulo(5);
        System.out.println(c.compareTo(new Circulo(7)));

        Triangulo t = new Triangulo(5,7);
        System.out.println(t.compareTo(new Triangulo(1,2)));
    }
}
