import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        String fecha1 = sc.nextLine();

        String dia1 = fecha1.substring(0,2);
        String mes1 = fecha1.substring(3,5);
        String ano1 = fecha1.substring(6);
        int dia1n = Integer.parseInt(dia1);
        int mes1n = Integer.parseInt(mes1);
        int ano1n = Integer.parseInt(ano1);

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        String fecha2 = sc.nextLine();

        String dia2 = fecha2.substring(0,2);
        String mes2 = fecha2.substring(3,5);
        String ano2 = fecha2.substring(6);
        int dia2n= Integer.parseInt(dia2);
        int mes2n=Integer.parseInt(mes2);
        int ano2n=Integer.parseInt(ano2);

        if (ano1n>ano2n) {
            System.out.println("persona 2 es mayor");
        } else if (ano2n>ano1n){
            System.out.println("persona 1 es mayor");
        } else if ( mes1n>mes2n){
            System.out.println("persona 2 es mayor");
        } else if (mes2n>mes1n) {
            System.out.println("persona 1 es mayor");
        } else if (dia1n>dia2n) {
            System.out.println("persona 2 es mayor");
        } else if (dia2n>dia1n) {
            System.out.println("persona 1 es mayor");
        } else
            System.out.println("Tienen la misma edad");
    }
}
