/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;
/**
 *
 * @author Rodriguez
 */
public class Aplicacion {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
    } 
    
    public static void ejercicio_1(){
     int a,b,c;
     System.out.println("ingresa primer numero:");
     a=leer.nextInt();
     System.out.println("ingresa segundo nuemro:");
     b=leer.nextInt();
     System.out.println("ingresa el tercer numero.");
     c=leer.nextInt();
     
    if(a>b && b>c){
        System.out.println(a+", "+b+", "+c);
    }else{ 
        if(a>c && c>b){
            System.out.println(a+", "+c+". "+b);
        }else{
            if(b>a && a>c){
               System.out.println(b+", "+a+", "+c);
            }else{
                if(b>c && c>a){
                    System.out.println(b+", "+c+", "+a);
                }else{
                    if(c>a && a>b){
                        System.out.println(c+", "+a+", "+b);
                    }
                }
            }
        }
        
 
public static void main(Stting[] args) {
    int a;
    Scanner leer = new Scanner(System.in);
    System.out.println("ingresa un numero entero 0 y 99999");
    a= leer.nextInt();
    
    if(a<0 && a>99999){
        System.out.println("el numero esta fuera de rango");
    }else if(a<10){
        System.out.println("el numero tiene 1 cifra");
    }else if(a<100){
        System.out,println("el numero tiene 2 cifras");
    }else if(a<1000){
        System.out.println("el numero tiene 3 cifras");
    }
}




package bol01ej08;
public class Main {
 public static void main(String[] args) {
 int n1,n2;
 System.out.print("Introduce un número: ");
 n1=Entrada.entero();
 System.out.print("Introduce otro número: ");
 n2=Entrada.entero();

 if(n1==n2)
 System.out.println("Son iguales");
 else
 {
 if(n1>n2)
 System.out.println(n1 + " es mayor que " + n2);
 else
 System.out.println(n2 + " es mayor que " + n1);
 }
 }
}


 
public class Main {
 public static void main(String[] args) {
 int h,m,s; // hora, minutos y segundos
 System.out.print("Introduzca hora: ");
 h=Entrada.entero();
 System.out.print("Introduzca minutos: ");
 m=Entrada.entero();
 System.out.print("Introduzca segundos: ");
 s=Entrada.entero();
 // suponemos que la hora introducida es correcta

 // incrementamos los segundos
 s ++;
 // si los segundos superan 59, los reiniciamos a 0 e incrementamos los minutos
 if (s >= 60)
 {
 s = 0;
 m ++;
 // si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
 if (m >= 60)
 {
 m = 0;
 h ++;
 // si la hora supera 23, la reiniciamos a 0
 if (h>=24)
 h=0;
 }
 }
 System.out.println ("Fecha: "+ h + ":"+ m + ":" + s);
 }
}

Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo.

package bol02ej01;
 public class Main {
 public static void main(String[] args) {
 int num,cuadrado;
 // num guardará el número que leamos
 // y cuadrado guardará el cuadrado de num
 System.out.print("Introduzca número: ");
 num=Entrada.entero();
 while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
 cuadrado=num*num;
 System.out.println(num+ "² es igual a "+ cuadrado);
 System.out.print("Introduzca otro número: ");
 num=Entrada.entero(); // volvemos a leer num
 }
 }
}

Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0.
package bol02ej02;
public class Main {
 public static void main(String[] args) {
 int num;
 System.out.print("Introduzca un número: ");
 num=Entrada.entero();
 while(num!=0) // mientras num sea distinto de 0
 {
 if(num>0)
 // mayor que cero: positivo
 System.out.println("Positivo");
 else
 // si no es positivo: es negativo
 System.out.println("Negativo");
 // repetimos el proceso y volvemos a leer num
 System.out.print("Introduzca otro número: ");
 num=Entrada.entero();
 }
 // al salir del mientras tenemos la certeza que num es 0
 }
}



Pedir 15 números y escribir la suma total.

package bol02ej10;
public class Main {
 public static void main(String[] args) {
 int num,suma_total;
 suma_total=0;

 for (int i=1;i<=15;i++)
 {
 System.out.print("Introduzca número: ");
 num=Entrada.entero();
 suma_total=suma_total+num;
 }
 System.out.println("La suma total es de: "+suma_total);
 }
}

  
 
Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€             
 package bol02ej14;
public class Main {
 public static void main(String[] args) {
 int sueldo,suma,mayor_1000;
 suma=0;
 mayor_1000=0;
 for (int i=1;i<10;i++)
 {
 System.out.print("Escribe un sueldo: ");
 sueldo =Entrada.entero();
 if(sueldo>1000)
 mayor_1000++;
  suma=suma+sueldo;
 }
 System.out.println("Mayores de 1000 hay: "+mayor_1000);
 System.out.println("la suma es de: "+suma);
 }
}


Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

package bol02ej16;
public class Main {
 public static void main(String[] args) {
 int num;
 do
 {
 System.out.print("Introduce número (de 0 a 10): ");
 num=Entrada.entero();
 }
while ( ! (0<=num && num<=10));
 System.out.println("\n\nTabla del " + num);

 for (int i=1;i<=10;i++)
 {
 System.out.println(num + " x " + i + " = " + num*i);

 }
 }
}


Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.

package bol02ej21;
public class Main {
 public static void main(String[] args) {
 int num;
 boolean hay_negativo;
 // la variable hay_negativo según los dos posibles valores indica:
 // false: no se ha introducido ningún número negativo
 // true: al menos hay un número negativo
 hay_negativo =false;
 // suponemos que no habrá ningún negativo
 for (int i=1;i<=10;i++)
 {
 System.out.print("Introduce número: ");
 num=Entrada.entero();
 if(num<0)
 hay_negativo =true;
 // si num es menor que cero, cambiamos el valor de hay_negativo a true
 }
 if(hay_negativo == true)
 System.out.println("Se ha introducido algún número negativo");
 else
 System.out.println("No hay ningún número negativo");
 }
}



Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

package bol02ej22;
public class Main {
 public static void main(String[] args) {
 int notas;
 boolean suspensos;
 suspensos=false; // suponemos que en principio no hay ningún suspenso
 for (int i=0;i<5;i++)
 {
 System.out.print("Introduzca nota (de 0 a 10): ");
 notas=Entrada.entero();
 if(notas<5)
 suspensos=true;
 }
 if(suspensos)
 System.out.println("Hay alumnos suspensos");
 else
 System.out.println("No hay suspensos");
 }
}



Pedir 5 números e indicar si alguno es múltiplo de 3.
 
package bol02ej23;
public class Main {
public static void main(String[] args) {
 int num;
 boolean multiplo_3;
 multiplo_3=false;
 for (int i=0;i<5;i++){
 System.out.print("Introduzca número: ");
 num=Entrada.entero();
 if(num %3 == 0)
 multiplo_3=true; // si se ejecuta esta instrucción significa que al menos hay un múltiplo
de 3.
 }
 if(multiplo_3 == false)
 System.out.println("no existen múltiplos de 3");
 else
 System.out.println("Hay múltiplos de 3");
 }
}


Dibuja un cuadrado de n elementos de lado utilizando *.

package bol03ej04;
public class Main {
 public static void main(String[] args) {
 int n; // tamaño del lado
 int fila, col;
 System.out.print ("Lado del cuadrado: ");
 n = Entrada.entero();
 for (fila=1; fila<=n; fila++)
 {
 for (col=1; col<=n; col++)
 System.out.print ("* ");
 System.out.println ("");
 }
 }
}


Leer 5 números y mostrarlos en el mismo orden introducido.

package bol04ej01;
public class Main {
 public static void main(String[] args) {
 int t[];

 t = new int[5];
 for (int i=0;i<5;i++)
 {
 System.out.print("Introduzca un número: ");
 t[i]=Entrada.entero();
 }
 System.out.println("Los números son:");
 for (int i=0;i<5;i++)
 System.out.println(t[i]);
 }
}


Leer 5 números y mostrarlos en orden inverso al introducido.

package bol04ej02;
public class Main {
 public static void main(String[] args) {
 int t[]=new int[5];

 for (int i=0;i<5;i++)
 {
 System.out.print("Introduzca un número: ");
 t[i]=Entrada.entero();
 }

 System.out.println("Los números (en orden inverso):");
 for (int i=4;i>=0;i--)
 System.out.println(t[i]);
 }
}


Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a
ser el primero.
        
package bol04ej09;
public class Main {

 public static void main(String[] args) {
 int t[]=new int[10];
 int ultimo;
 // leemos la tabla
 for (int i=0;i<10;i++){
 System.out.print("Introduzca número: ");
 t[i]=Entrada.entero();
 }
 // guardamos el último elemento de la tabla
 ultimo = t[9];
 // desplazamos hacia abajo (de 0 hacia la última posición)
 // al desplazar perdemos el último valor, por eso lo hemos guardado antes.
 for (int i=8;i>=0;i--)
 t[i+1]=t[i];
 // el último valor pasa a ser el primero
 t[0] =ultimo;

 System.out.println("La tabla queda:");
 for (int i=0;i<10;i++)
 System.out.println(t[i]);
 }
}


Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 días.
        
package bol01ej15;
public class Main {
 public static void main(String[] args) {
 int dia,mes,año;
 // para que una fecha sea correcta se tiene que cumplir
 // día en el rango 1..30
 // mes en el rango 1..12
 // año cualquiera distinto del 0
 System.out.print("Introduzca día: ");
 dia=Entrada.entero();
 System.out.print("Introduzca mes: ");
 mes=Entrada.entero();
 System.out.print("Introduzca año: ");
 año=Entrada.entero();

 if (dia >= 1 && dia <=30)
 if (mes >= 1 && mes <= 12)
if (año != 0)
 System.out.println ("Fecha correcta");
 else
 System.out.println ("Año incorrecto");
 else
 System.out.println("Mes incorrecto");
 else
 System.out.println("Día incorrecto");

 }
}


Pedir un número N, y mostrar todos los números del 1 al N.

package bol02ej08;
public class Main {
 public static void main(String[] args) {
int i,num;
 System.out.print("Introduce un número: ");
 num=Entrada.entero();
 i=1;
 // i es el contador que tomará los valores de 1 a n
 while(i<=num){
 System.out.println(i);
 i++;
 }
 }
}


Escribir todos los números del 100 al 0 de 7 en 7.

package bol02ej09;
public class Main {
 public static void main(String[] args) {
 // inicializamos la i a 100
 // mientras la i sea mayor o igual a 0
 // y en cada vuelta del for la i se decrementa en 7
 for (int i=100;i>=0;i-=7)
 System.out.println(i);
 // el for al llevar una sola instrucción en su cuerpo de ejecución
 // no precisa de llaves { }
 }
}


Diseñar un programa que muestre el producto de los 10 primeros números impares.

package bol02ej11;
public class Main {
 public static void main(String[] args) {
 long producto=1; // producto guardará la multiplicación de los 10 primeros números impares.
 // es muy importante acordarse de inicializarlo a 1. Ya que si lo hacemos a 0,
     el producto siempre valdrá 0.
 // para calcular los 10 primeros números impares utilizamos un for que:
 //
 // comience en 1
 // y en cada vuelta se incremente en 2, así obtenemos
 // 1, 3, 5, 7, 9, 11, 13, 15, 17, 19.
 for (int i=1; i<20; i+=2) {
 producto=producto*i;
 }
 System.out.println("La multiplicación de los 10 primeros impares: " + producto);

 }
}



    

