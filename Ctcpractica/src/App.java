//Aldo josue Aviles Espinoza
//1M7S
//CARNET 2024-1632U

import java.util.Scanner;

public class App {
 // inicialice las variables que vmaos a ocupar en la clase pero me di cuenta de algo y es q no me daba si solo las declaraba asi por asi
  static Scanner leer = new Scanner (System.in);    //pero les agregue un static a las 3 y me funcionaron no se pq
  static int []arreglito;
  static int tamano=0;

 

    public static void main(String[] args) throws Exception {
      
 do {
                         // aqui solo pedi el tamano del arreglo y los valores
  try {    // en el que a los dos les agregue try catch junto con do while porq los usuarios como q no leen aveces
    
    System.out.println("Ingrese la cantidad de enteros a ingresar para ordenarlos");
    tamano=leer.nextInt();
    arreglito =new int [tamano];
  break;


  } catch (Exception e) {
    System.out.println(e);
    System.out.println("Valor invalido INTENTE DE NUEVO");
    leer.nextLine();
  }

 } while (true);

 


//pedir los enteros
do {
  
  try {

    for (int i=0; i<tamano;i++){
      System.out.println(" ingrese el valor numero "+(i+1));
      arreglito[i]=leer.nextInt();
        }
      break;
    
  } catch (Exception e) {
    System.out.println(" valor invalido INTENTE DE NUEVO");
    leer.nextLine();
  }

} while (true);
  

// aqui solamente imprimo los valores que me dio el usuario y luego imprimo los valores ordenados

  
  System.out.println("Su vector");

  for (int i: arreglito){
  System.out.print(i+",");
      }
  
System.out.println("");

  Insertionsort(arreglito);   //invocacion:0 al insersion sort pa ordenar el arreglito dado por el usuario
  System.out.println("Valores ordenados");  


for (int i: arreglito){
System.out.print(i+",");
    }
}

// y listo profe ahi quedaria el codigo jaja


public static void Insertionsort (int arrai[]) {  // metodo para ordenar los valore

for (int i =1;i<arrai.length;i++){ // inicializamos una variable i en 1
int find = arrai[i];// guardamos el el arreglo i en una variable find
int j = (i-1);//luego creamos la variable j, que simboliza los valores de la izq para comparar

while (j>=0 && arrai[j]>find) {   // creamos un while en el que mientras el valor de j sea mayor q el find 
                      
  arrai[j+1]=arrai[j];// ps movemos la variable j y le sumamos uno para moverla a la derecha y va a ser igual a j
  j--;
}

arrai[j+1]=find;   // despue movemos el find hacia la izquierda donde estaba j+1 yya

}

}



}


