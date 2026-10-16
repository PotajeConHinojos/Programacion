import java.util.Arrays;
import java.util.Scanner;
public class Main
{
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        double numeros[] = new double[10];
        for (int i = 0; i < numeros.length; i++)
        {
            IO.println("Introduce número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++)
        {
            IO.print(numeros[i] + " ");
        }

        //for(double n : numeros) { IO.println(n)};

        //Ejercicio 2
        sc = new Scanner(System.in);
        int[] n = new int[10];
        double suma = 0.0;
        for (int i = 0; i < n.length; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            n[i] = sc.nextInt();
            suma = suma + n [i];
        }
         IO.println(suma);
        */


        //Ejercicio3
         /*
        sc = new Scanner(System.in);
        double[] n1 = new double[10];
        for (int i = 0; i < n1.length; i++)
        {
            IO.println("Introduce un número");
            n1[i] = sc.nextDouble();
        }
        double maximo = - Double.MAX_VALUE; //Es = al numero mas pequeño posible "-" para que siempre el que se introduzca sea igual o mayor
        double minimo = Double.MIN_VALUE;

        for (int i = 1; i< n1.length; i ++)
        {
            if (n1[i] > maximo)
            {
                maximo = n1[i];
            }
            if (n1[i] < minimo)
            {
                minimo = n1[i];
            }
        }

        // también: maximo = Math.max(n1[i], maximo);
        IO.println("El mínimo es: " + minimo);
        IO.println("El máximo es: "  + maximo);
*/



        /*
        //Ejercicio4
        int n4[] = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;
        sc = new Scanner(System.in);

        for (int i = 0; i < n4.length; i++)
        {
            IO.println("Introduce un número");
            n4[i] = sc.nextInt();
            if (n4[i] < 0)
            {
                sumaNeg = sumaNeg + n4[i];
            }
            if (n4[i] >= 0)
            {
                sumaPos = sumaPos + n4[i];
            }
        }
        IO.println("Suma de negativos: " + sumaNeg);
        IO.println("Suma de positivos: " + sumaPos);
        */

        //Ejercicio5
         /*
        sc = new Scanner(System.in);
        int[] n = new int[20];
        int suma = 0;
        double media=0;
        for (int i = 0; i < n.length; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++)
        {
            suma = suma + n [i];
            media = suma/n.length;
        }
        IO.println(suma);
        IO.println(media);
        */
        /*
        //Ejercicio6
        sc = new Scanner(System.in);
        int N = 0;
        double M = 0;
        IO.println("Introduce el tamaño que quieras que tenga el array");
        N = sc.nextInt();
        IO.println("Introduce lo que quieras que se escriba en el array");
        M = sc.nextDouble();
        double [] tamanoArray = new double[N];

        Arrays.fill(tamanoArray, M);

        for (int i = 0; i < tamanoArray.length; i++)
        {
            IO.println(tamanoArray[i]);
        }
*/
/*
        //Ejercicio 7
         sc = new Scanner(System.in);

        IO.println("Introduce P (Valor desde el que se parte):");
        int p = sc.nextInt();

        IO.println("Introduce Q (Valor al que se llega):");
        int q = sc.nextInt();

        int dimension = Math.abs(p - q) +1;
        int valores[] = new int[dimension];

        for (int i = 0; i < valores.length; i++)
        {
            if(q > p)
            {
                valores[i] = p+1;
            }else {
                valores[i] = q+1;
            }
            IO.println(valores[i]);
        }
*/


        /*
        //Ejercicio8
        sc = new Scanner(System.in);
        double aleatorios[] = new double[100];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = Math.random();

        }
        IO.println("Introduce un valor real");
        double r = sc.nextDouble();
        int contador = 0;

        for (int i = 1; i < aleatorios.length; i++) //for(double n : aleatorios
        {
            if (aleatorios[i] >= r)
            {
            contador++;
            }
        }
        IO.println("Hay " + contador + " números iguales o superiores a el valor real introducido");

        //Ejercicio 9
         /*
        sc = new Scanner(System.in);
        double aleatorios[] = new double[100];

        for (int i = 0; i < aleatorios.length; i++)
        {
            aleatorios[i] = (int) (Math.random() * 10) + 1;
            IO.println(aleatorios[i]);

        }

        IO.println("Introduce N");
        double n = sc.nextDouble();
        int contador = 0;
        for (int i = 0; i < aleatorios.length; i++)
        {
            if (aleatorios[i] == n)
            {
                contador++;
            }
        }
        IO.println(contador);
             */
        //Ejercicio10
        /*
        sc = new Scanner(System.in);
        IO.println("Introduce el tamaño que quieras que tenga el array");
        int N = sc.nextInt();
        int altura = 0;
        double tamanoArray []  = new double [N];
        double suma = 0;
        double media = 0;
        int encima = 0;
        int debajo = 0;

        double minimo = tamanoArray[0];
        double maximo = tamanoArray[0];
        for (int i = 0; i < tamanoArray.length; i++)
        {
            IO.println("Introduce altura " + (i+1) );

            tamanoArray[i] = sc.nextDouble();

            suma = suma + tamanoArray [i];

            if (tamanoArray[i] > maximo)
            {
                maximo = tamanoArray[i];
            }
            if (tamanoArray[i] < minimo)
            {
                minimo = tamanoArray[i];
            }
        }
        media = suma/tamanoArray.length;
        for (int i = 0; i < tamanoArray.length; i++)
        {
            if (tamanoArray[i] < media)
            {
                debajo++;
            }else if (tamanoArray[i] >= media)
                {
                    encima++;
                }
        }

        IO.println("La media de las alturas es: " + media);
        IO.println("La altura mínima es: " + minimo);
        IO.println("La altura máxima es: "  + maximo);
        IO.println(encima + " personas están por encima o en la media");
        IO.println(debajo + " personas están por debajo de la media");
        */

        //Ejercicio11
        int array1[] = new int[100];
        int array2[] = new int[100];

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = i + 1;
        }

        for (int i = 0; i < array1.length; i++)
        {
            array2[i] = array1[array1.length - 1 - i];
        }

        IO.println("Array1 y Array 2");
        for (int i = 0; i < array1.length; i++)
        {
            IO.print(array1[i] + " ");
            IO.print(array2[i] + " ");
        }

        //Ejercicio12

         sc = new Scanner(System.in);
        int numerosEJ12[] = new int[10];
         String opcion = "c";
        do
        {
            IO.println("Bienvenido, escoja una de las opciones.");
            IO.println("a) Mostrar valores");
            IO.println("b) Introducir valor");
            IO.println("x) Salir");
            switch(opcion)
            {
                case "a" ->
                {
                    for (int i = 0; i < array1.length; i++)
                    {
                        IO.print(numerosEJ12[i] + " ");

                    }

                }
                case "b" ->
                {
                    sc.nextLine();
                    IO.println("Introduzca el valor del número entero.");
                    int v = sc.nextInt();
                    IO.println("Introduzca la posicion del array donde quiera instertar el valor.");
                    int p = sc.nextInt();
                    if (p <= 0 && p < numerosEJ12.length) {
                        numerosEJ12[p] = v;
                    } else {
                        IO.print("No es un valor correcto");
                    }
                }
                case "c" ->
                {
                IO.println("Po mevoy");
                }
                default ->{

            }


            }
        }while (!opcion.equals("c"));


        //Ejercicio13

         sc = new Scanner(System.in);
         IO.println("Introduce el valor inicial v:");
         int v = sc.nextInt();
         IO.println("Introduce el incremento");
         int incremento = sc.nextInt();
         IO.println("Introduce el número de elementos a crear");
         int nEJ13 =sc.nextInt();

         int numerosEJ13[] = new int[nEJ13];
            numerosEJ13[0] = v;
         for(int i = 1; i < numerosEJ13.length; i++)
             {
                 IO.println(numerosEJ13[i] = numerosEJ13[i-1] + incremento);

             }


         //Ejercicio 14
        int numE14 = 10;
         int tamanoArray = numE14 + (numE14 + 1) /2; //Formula suma serie
        int numerosE14[] = new int[tamanoArray];

        int posicionActual = 0;
        for(int numero = 1; numero <= numE14; numero++)
        {
            for (int i = 0; i < numero; i++)
            {
                numerosE14[posicionActual] =numero;
                posicionActual++;
            }
        }
        IO.println(Arrays.toString(numerosE14));
    }

}
