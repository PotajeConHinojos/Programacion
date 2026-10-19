import java.util.Scanner;
public class Main
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Ejercicio1 //Revisar github de anuar

        /*
        IO.println("Introduce una cadena de texto");
        String texto = sc.nextLine();

        String palabra = "";

        for (int i = 0; i < texto.length(); i++)
        {
            if (texto.charAt(i) != ' ')
            {
                palabra = palabra + texto.charAt(i);
            } else
            {
                IO.println(palabra);
                palabra = "";
            }
        }

        IO.println(palabra);
        */
/*
        //Ejercicio2
        IO.println("Introduce la primera cadena de texto");
        String texto1 = sc.nextLine();
        IO.println("Introduce la segunda cadena de texto");
        String texto2 = sc.nextLine();

        if (texto1.equalsIgnoreCase(texto2))
        {
            IO.println("Las cadenas de texto son iguales");
        }else
            {
             IO.println("Las cadenas de textos no son iguales");
            }
  */
        /*
        //Ejercicio3
        IO.println("Introduce nombre");
        String nombre = sc.nextLine();
        IO.println("Introduce apellido1");
        String apellido1 = sc.nextLine();
        IO.println("Introduce apellido2");
        String apellido2 = sc.nextLine();

        String s1= nombre.substring(0,3);
        String s2= apellido1.substring(0,3);
        String s3= apellido2.substring(0,3);

        IO.println(s1.toUpperCase() + s2.toUpperCase() + s3.toUpperCase());
*/


        //Ejercicio4

        sc = new Scanner(System.in);
/*
        int contadorDeA = 0, contadorDeE = 0, contadorDeI = 0, contadorDeO = 0, contadorDeU = 0;
        System.out.println("Introduce una frase");
        String texto = sc.nextLine();
        texto = texto.toLowerCase();
        for(int i = 0; i < texto.length(); i++)
        {
            char letra = texto.charAt(i);

            if(letra == 'a')
                {
                contadorDeA++;
                }
            else if(letra == 'e')
                {
                contadorDeE++;
                }
            else if (letra == 'i')
                {
                contadorDeI++;
                }
            else if (letra == 'o')
                {
                contadorDeO++;
                }
            else if (letra == 'u')
                {
                contadorDeU++;
                }
        }
        IO.println(" Nº de A´s: " + contadorDeA + " Nº de E´s: " + contadorDeE + " Nº de I´s: " +  contadorDeI + " Nº de O´s: " + contadorDeO + " Nº de U´s: " + contadorDeU);
    */
        //Ejercicio5
        boolean Palindromo = false;
        sc = new Scanner(System.in);
        IO.println("Introduce una frase");
        String frase = sc.nextLine();

        String fraseProcesada = frase.replace(" ", "").toLowerCase();
//comprobar si el primer y ultimo caracter son iguales, asi sucesivamente

        int izquierda = 0;
        int derecha = fraseProcesada.length() - 1;

        while(izquierda < derecha)
        {
            if(fraseProcesada.charAt(izquierda) == fraseProcesada.charAt(derecha))
            {
                Palindromo = true;
            }
            izquierda++;
            derecha--;
        }
    }
}