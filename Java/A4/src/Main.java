import java.util.Scanner;
public class Main
{
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++)
        {
            IO.print(numeros[i] + " ");
        }

        //Ejercicio 2
        /*sc = new Scanner(System.in);
        int[] n = new int[10];
        int suma = 0;
        for (int i = 0; i < 10; i++)
        {
            IO.println("Introduce número " + (i + 1) + ":");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++)
        {
            suma = suma + n [i];
        }
        IO.println(suma);

         /*

        //Ejercicio3
        sc = new Scanner(System.in);
        double[] n1 = new double[10];
        for (int i1 = 0; i1 < n1.length; i1++)
        {
            IO.println("Introduce un número");
            n1[i1] = sc.nextDouble();
        }
        double maximo = n1[0];
        double minimo = n1[0];

        for (int i1 = 1; i1 < n1.length; i1 ++)
        {
            if (n1[i1] > maximo)
            {
                maximo = n1[i1];
            }
            if (n1[i1] < minimo)
            {
                minimo = n1[i1];
            }
        }
        IO.println("El mínimo es: " + minimo);
        IO.println("El máximo es: "  + maximo);
        */



        /*
        //Ejercicio4
        double[] n4 = new double[20];
        double negativos = n4[0];
        double positivos = n4[0];
        double sumaPos = 0;
        double sumaNeg = 0;
        sc = new Scanner(System.in);

        for (int i = 0; i < n4.length; i++)
        {
            IO.println("Introduce un número");
            n4[i] = sc.nextDouble();
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
        /*
        //Ejercicio5
        sc = new Scanner(System.in);
        int[] n = new int[20];
        int suma = 0;
        double media=0;
        for (int i = 0; i < 10; i++)
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
        int M = 0;
        IO.println("Introduce el tamaño que quieras que tenga el array");
        N = sc.nextInt();
        IO.println("Introduce lo que quieras que se escriba en el array");
        M = sc.nextInt();
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

        int[] valores = new int[q - p +1];

        for (int i = 0; i < valores.length; i++)
        {
            valores[i] = p + i;
        }

        for (int i = 0; i < valores.length; i++)
        {
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

        for (int i = 1; i < aleatorios.length; i++)
        {
            if (aleatorios[i] >= r)
            {
            contador++;
            }
        }
        IO.println("Hay " + contador + " números iguales o superiores a el valor real introducido");
        */
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

        for (int i = 0; i < tamanoArray.length; i++)
        {
            IO.println("Introduce altura " + (i+1) );
            tamanoArray[i] = sc.nextDouble();
        }
        double minimo = tamanoArray[0];
        double maximo = tamanoArray[0];
        for (int i = 0; i < tamanoArray.length; i++)
        {
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
            }else if (tamanoArray[i] > media)
                {
                    encima++;
                }
        }

        IO.println("La media de las alturas es: " + media);
        IO.println("La altura mínima es: " + minimo);
        IO.println("La altura máxima es: "  + maximo);
        IO.println(encima + " personas están por encima de la media");
        IO.println(debajo + " personaes están por debajo de la media");
        */
        /*
        //Ejercicio11
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = i + 1;
        }

        for (int i = 0; i < array1.length; i++)
        {
            array2[i] = array1[array1.length - 1 - i];
        }

        IO.println("Array1");
        for (int i = 0; i < array1.length; i++)
        {
            IO.print(array1[i] + " ");
        }
        IO.println("Array2");
        for (int i = 0; i < array2.length; i++)
        {
            IO.print(array2[i] + " ");
        }
        */

        //Ejercicio12

    }
}
