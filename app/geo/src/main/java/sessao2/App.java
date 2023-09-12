
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Retangulo rDefeito = new Retangulo();
    	Retangulo rParam = new Retangulo(0,0,4,0,4,3,0,3);
    	System.out.println(rDefeito.toString());
    	System.out.println(rParam.toString());
        System.out.println("Perimetro do retangulo por defeito: " + rDefeito.perimetro());
        System.out.println("Area do retangulo por parametros: " + rParam.area());
    	
    }
    
    
    private static void charType(){
        System.out.println("\nTipo char:");

        char x1 = '\u0032';
        System.out.println(x1);  //imprime: 2

        char x2 = '2';
        System.out.println(x2);  //imprime: 2
        x2 = 65;
        System.out.println(x2);  //imprime: A

        char y1 = '\u0041';
        System.out.println(y1);  //imprime: A

        char y2 = 'A';
        System.out.println(y2);  //imprime: A
        y2 = 50;
        System.out.println(y2);  //imprime: 2

        System.out.println(x1 + x2);  //imprime: 115
        System.out.println(x1 + y1);  //imprime: 115
    }
    
    private static void minMax() {
        System.out.println("\nMin e max:");

        System.out.println(Byte.MIN_VALUE);           //imprime: -128
        System.out.println(Byte.MAX_VALUE);           //imprime: 127
        System.out.println(Short.MIN_VALUE);          //imprime: -32768
        System.out.println(Short.MAX_VALUE);          //imprime: 32767
        System.out.println(Integer.MIN_VALUE);        //imprime: -2147483648
        System.out.println(Integer.MAX_VALUE);        //imprime: 2147483647
        System.out.println(Long.MIN_VALUE);           //imprime: -9223372036854775808
        System.out.println(Long.MAX_VALUE);           //imprime: 9223372036854775807
        System.out.println((int) Character.MIN_VALUE); //imprime: 0
        System.out.println((int) Character.MAX_VALUE); //imprime: 65535

        System.out.println(Float.MIN_VALUE);  // 1.4E-45
        System.out.println(Float.MAX_VALUE);  // 3.4028235E38
        System.out.println(Double.MIN_VALUE); // 4.9E-324
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
    }
}
