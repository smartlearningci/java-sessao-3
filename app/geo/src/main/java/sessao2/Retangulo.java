
/**
 * A classe Retângulo tem como objetivo criar uma representação
 * desta forma geométrica. Para isso são definidos os seguintes
 * campos privados:
 * <ul>
 * <li>int vn_x</li>
 * <li>int vn_y</li>
 * </ul>
 *
 * que representam as coordenadas x e y do vertice n.
 * <p>
 * Associdado à representação dos vértices a classe possibilita
 * o cálculo de:
 * <ul>
 * <li>perímetro</li>
 * <li>área</li>
 * </ul>
 * através de dois métodos públicos com o mesmo nome.
 * <p>
 * A classe implementa o método toString para descrição do objeto.
 * @author Eduardo Catarino
 * @version 1.0
 * @since 1.0
 * 
 */
public class Retangulo {

    /**
    * Variáveis de instância que representam as coordenadas dos vértices
    */
    private int v1_x;
    private int v1_y;
    private int v2_x;
    private int v2_y;
    private int v3_x;
    private int v3_y;
    private int v4_x;
    private int v4_y;

    /**
    * <p>Construtor por defeito do Retangulo
    * @since 1.0
    */
    public Retangulo(){

        this.v1_x = 0;
        this.v1_y = 0;
        this.v2_x = 3;
        this.v2_y = 0;
        this.v3_x = 3;
        this.v3_y = 4;
        this.v4_x = 0;
        this.v4_y = 4;
    }

    /**
    * <p>Construtor que recebe por parâmetros as coordenadas dos vértices do
    * Retangulo
    * @param v1_x - coordenada x do 1 vértice
    * @param v1_y - coordenada y do 1 vértice
    * @param v2_x - coordenada x do 2 vértice
    * @param v2_y - coordenada y do 2 vértice
    * @param v3_x - coordenada x do 3 vértice
    * @param v3_y - coordenada y do 3 vértice
    * @param v4_x - coordenada x do 4 vértice
    * @param v4_y - coordenada y do 4 vértice
    * @since 1.0
    */
    public Retangulo(int v1_x, int v1_y, int v2_x, int v2_y, int v3_x, int v3_y, int v4_x, int v4_y) {
        this.v1_x = v1_x;
        this.v1_y = v1_y;
        this.v2_x = v2_x;
        this.v2_y = v2_y;
        this.v3_x = v3_x;
        this.v3_y = v3_y;
        this.v4_x = v4_x;
        this.v4_y = v4_y;
    }


    @Override
    public String toString() {
        return "Retangulo [v1_x=" + v1_x + ", v1_y=" + v1_y + ", v2_x=" + v2_x + ", v2_y=" + v2_y + ", v3_x=" + v3_x
                + ", v3_y=" + v3_y + ", v4_x=" + v4_x + ", v4_y=" + v4_y + "]";
    }


    /**
    * <p>Método que cálcula o valor do perímetro do retangulo
    * @since 1.0
    * @return int - valor do perímetro do retângulo
    */
    public int perimetro(){
        return v2_x*2+v3_y*2;
    }

    /**
    * <p>Método que cálcula o valor sa área do retangulo
    * @since 1.0
    * @return int - valor da área do retângulo
    */
    public int area(){
        return v2_x*v3_y;
    }



}