/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

public class App {
    public static void main(String[] args) {

        Caneta bic = new Caneta();

        System.out.println(bic.isTampada());

        bic.tamparDestampar();

        System.out.println(bic.isTampada());

        bic.definirCor("azul");

        System.out.println(bic.getCor());

    }
}
