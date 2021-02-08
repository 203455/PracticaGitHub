import java.util.Scanner;

public class PrincipalJuego{
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        int acumulado=0;
            do{
                acumulado=registrarDatos(acumulado);
        }while(acumulado!=1);
    }
    public static int registrarDatos(int acumulado) {
        Status estado;
        int dato1, dato2;
        Dados dado1;
        Dados dado2;
        do{
            System.out.println("Introduce el valor del primer dado");
            dato1=entrada.nextInt();
        }while(dato1<1 || dato1>6);
        dado1=new Dados(dato1);
        do{
            System.out.println("Introduce el valor del segundo dado");
            dato2=entrada.nextInt();
        }while(dato2<1||dato2>6);
        dado2=new Dados(dato2);
        estado=new Status(dado1.getDado(),dado2.getDado());
        acumulado=acumulado+estado.getPuntos();
        acumulado=imprimirResultado(estado, acumulado);
        return acumulado;
    }
    public static int imprimirResultado(Status estado, int acumulado) {
        int seguir;
        System.out.println("Estado: " + estado.getStatus());
        if(estado.getStatus().equals("puntos acumulados")){
            do{
                System.out.println("puntos: " + acumulado + "\n¿Desea seguir? 1=Si 2=No");
                seguir=entrada.nextInt();
            }while(seguir<1 || seguir>2);
            if(seguir!=1){
                acumulado=1;
            }     
        }
        else{
            acumulado=1;
        }
        return acumulado;
    }

}
