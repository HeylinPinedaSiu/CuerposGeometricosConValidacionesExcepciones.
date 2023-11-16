import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);

    //declaramos las variables a utilizar en el programa
    static double generatriz;
    static double radio;
    static double altura;
    static double apotemaPiramide;
    static double perimetroBase;
    static double Volumen; 
    static double areaTotal;
    static double areaL;
    static double areaBase;
    static double diagonal;
    static double area;
    static double apotema;
    static double longitudLados;
    static double radioM;
    static double aream;
    static double volum;
    static double areaCara;
    static double Apent;
    static double AM;
    static double Am;
    static double Perimetbase;
    static double Areabase;
    static double a,c;
    static int arista;
    static int angulo;
    static int cantidadLados;
    static int intentos = 0;
    static int intentos1;
    static int intentos2;
    static int intentos3;

    public static void main(String[] args) throws Exception {
       menu();
    
    }

    /*HACEMOS UN METODO PARA EL MENU  */
    public static int menu(){
       System.out.println("Calcular el area lateral,total y volumen.");
       System.out.println("*********** Menu de opciones ************ ");
       System.out.println("1)Prisma");
       System.out.println("2)Cilindro");
       System.out.println("3)Pirámide"); 
       System.out.println("4)Cono");
       System.out.println("5)Esfera");
       System.out.println("6)Zona Esférica");
       System.out.println("7)Casquete Esférico");
       System.out.println("8)Huso esférico y cuña esférica");
       System.out.println("9) Ortoedro");
       System.out.println("10)Tetaedro");
       System.out.println("11)Hexaedro");
       System.out.println("12)Octaedro");
       System.out.println("13)Dodecaedro");
       System.out.println("14)Icosaedro");
       System.out.println("15)Tronco de cono");
       System.out.println("16)Tronco de pirámide");
       System.out.println("17)Salir");
       
       int opc=0;
       double a1=0,b1=0,c1=0;
       boolean cerrado = false;
       
       do {
        System.out.print("Ingrese una opción: ");
        try {
            opc = lector.nextInt();
            if (opc <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos++;
            } else {
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor debe ser un número. Intente nuevamente.");
            lector.nextLine();
            intentos++;
        } catch (NoSuchElementException e) {
            System.out.println("Debe introducir un valor.");
            intentos++;
        }

        if (opc < 1 || opc > 17) {
            intentos1++;
            if (intentos1 >= 3) {
                System.out.println("****** Has superado el número de intentos. El programa finalizará.********");
                System.exit(0);
            }
        } else {
            intentos1 = 0;
        }

    } while (intentos < 3 && (opc < 1 || opc > 17));

              
        switch(opc){
            case 1:
                  do {
                        System.out.print("Cantidad de lados: ");
                        try {
                            cantidadLados = lector.nextInt();
                            if (cantidadLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos2++;
                        }
                    } while (intentos2 < 3);
                    if (intentos2 == 3) {
                        System.out.println("Error!! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                
                    do {
                        System.out.print("Longitud de lados: ");
                        try {
                            longitudLados = lector.nextDouble();
                            if (longitudLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos3++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número.");
                            lector.next(); 
                            intentos3++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos3++;
                            cerrado = true; 
                        }
                    } while (intentos3 < 3 && !cerrado); 
                    
                    if (intentos3 == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                  CalcularPrisma (cantidadLados,altura,longitudLados);
           
            break;
            
            case 2:
           
                    do {       
                        System.out.print("Ingrese la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Ingrese el radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                 CalcularCilindro(radio, altura);
      
            break;
            
            case 3:
             
             do {       
                     System.out.print("Ingrese la altura de la piramide: ");
                    if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Error!! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese la cantidad de lados de la piramide: ");
                        try {
                            cantidadLados = lector.nextInt();
                            if (cantidadLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el la longitud de lados de la piramide: ");
                        try {
                            longitudLados = lector.nextDouble();
                            if (longitudLados <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos3++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos3++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos3++;
                            cerrado = true; 
                        }
                    } while (intentos3 < 3 && !cerrado); 
                    
                    if (intentos3 == 3) {
                        System.out.println("Error!! superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                 do {
                        System.out.print("Ingrese el apotema de la piramide: ");
                        try {
                            apotemaPiramide = lector.nextDouble();
                            if (apotemaPiramide <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error!! superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                  
                  CalcularPiramide( altura,cantidadLados,apotemaPiramide,longitudLados);  
                  
            break;
          case 4:
                              do {       
                        System.out.print("Ingrese la altura del cono: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Error!! superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Ingrese el radio del cono: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error!! superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    

              CalcularCono(radio,altura);

          break;

          case 5:
          do {
            System.out.print("Ingrese el valor del radio: ");
            try {
                radio = lector.nextDouble();
                if (radio <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                    intentos++;
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                lector.next(); 
                intentos++;
            } catch (NoSuchElementException e) {
                System.out.println("Debe introducir un valor.");
                intentos++;
                cerrado = true; 
            }
        } while (intentos < 3 && !cerrado); 
        
        if (intentos == 3) {
            System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
            break;
        }
           CalcularEsfera(radio);
          break;

           case 6:

                do {       
                     System.out.print("Ingrese la altura: ");
                    if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
            
                    do {
                        System.out.print("Ingrese el valor del radio Mayor: ");
                        try {
                            radioM = lector.nextDouble();
                            if (radioM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }

                  CalcularZonaEsferica( radio, radioM, altura);
            break;

            case 7:
                 
                    do {       
                        System.out.print("Ingrese la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
            do {
                        System.out.print("Ingrese el valor del radio Mayor: ");
                        try {
                            radioM = lector.nextDouble();
                            if (radioM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
              
               
               calcularCasqueteEsferico(altura,radio,radioM);
            break;

            case 8:
                do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del ángulo: ");
                        try {
                            angulo = lector.nextInt();
                            if (angulo <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos1++;

                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                
                calcularHusoCuñaEsferica(radio,angulo);

            break;

            case 9:
            do {
                   System.out.print("Ingrese el valor de a: ");
                        try {
                            a1 = lector.nextDouble();
                            if (a1 <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                     do {
                        System.out.print("Ingrese el valor de b: ");
                        try {
                            b1 = lector.nextDouble();
                            if (b1 <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos1++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor de c: ");
                        try {
                            c1 = lector.nextDouble();
                            if (c1 <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                  
                 CalcularOrtoedro(a1, b1, c1);
            
            break;

            case 10:
              do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
            calcularTetaedro(arista);
             
            break;

            case 11:
             do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    

                 calcularHexaedro(arista);
            break;

            case 12:
            do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    
                calcularOctaedro(arista);
            
            break;

            case 13:

             do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
              
                calcularDodecaedro(arista);
    
            break;

            case 14:
            do {
                        System.out.print("Ingrese el valor de la arista: ");
                        try {
                            arista = lector.nextInt();
                            if (arista <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número entero. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }

                calcularIcosaedro(arista);

            break;
            
            case 15:
                 do {       
                        System.out.print("Ingrese la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos++;
                        }
                    } while (intentos < 3);
                    if (intentos == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                    do {
                        System.out.print("Ingrese el valor del radio: ");
                        try {
                            radio = lector.nextDouble();
                            if (radio <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos1++;

                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                    do {
                        System.out.print("Ingrese el valor del radio Mayor: ");
                        try {
                            radioM = lector.nextDouble();
                            if (radioM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos2++;
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos2++;
                            cerrado = true; 
                        }
                    } while (intentos2 < 3 && !cerrado); 
                    
                    if (intentos2 == 3) {
                        System.out.println("Error!! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                   
                  calcularTroncodeCono(altura,radio,radioM);

            break;
            
            case 16:
            do {
                        System.out.print("Ingrese la longitud de la arista mayor: ");
                        try {
                            AM = lector.nextDouble();
                            if (AM <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos++;
                            } else {
                                break;
                            }
                            //conn esta excepcion solo se admitiran valores numericos
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Por favor intente nuevamente.");
                            lector.next(); 
                            intentos++;

                            //
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos++;
                            cerrado = true; 
                        }
                    } while (intentos < 3 && !cerrado); 
                    
                    if (intentos == 3) {
                        System.out.println("Error! usted  superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                   
                   do {
                    //pedimos los datos al usuario 
                        System.out.print("Ingrese el valor del radio Menor: ");
                        try {
                            Am = lector.nextDouble();
                            if (Am <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos1++;
                            } else {
                                break;
                            }
                            //utlizamos esta excepcion para solo introducir valores numericos 
                        } catch (InputMismatchException e) {
                            System.out.println("El valor debe ser un número. Intente nuevamente.");
                            lector.next(); 
                            intentos1++;

                            //
                        } catch (NoSuchElementException e) {
                            System.out.println("Debe introducir un valor.");
                            intentos1++;
                            cerrado = true; 
                        }
                    } while (intentos1 < 3 && !cerrado); 
                    
                    if (intentos1 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    }
                     do {
                        //pedimos los datos al usuario 
                        System.out.print("Ingrese el valor de la altura: ");
                        if (lector.hasNextDouble()) {
                            altura = lector.nextDouble(); 
                            if (altura <= 0) {
                                System.out.println("El valor debe ser mayor a cero. Por favor intente nuevamente.");
                                intentos2++;
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("La entrada no es un número válido. Por favor intente nuevamente."); 
                            lector.next(); 
                            intentos2++;
                        }
                    } while (intentos2 < 3);
                    if (intentos2 == 3) {
                        System.out.println("Error! usted superó el número máximo de intentos. El programa finalizará.");
                        break;
                    } 
                   
                  calcularTroncodepiramide(altura,Am,AM);
      
            break;

            case 17:
                   System.out.println("******** Ha decidido salir del programa ******");
            break;
            }
           return opc;
      }
             /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del prisma */
       public static void CalcularPrisma(int cantidadLados,double altura,double longitudLados){
         perimetroBase = cantidadLados * longitudLados;
         areaL = perimetroBase * altura;
         double alfa = (Math.PI/180) * (360/cantidadLados);
          apotema = longitudLados / (2 * Math.tan((alfa)/2));
          areaBase = (perimetroBase * apotema)/2;
         areaTotal = areaL + 2 * areaBase;
          Volumen = areaBase * altura;

           //mostramos los resultados del prisma 
         System.out.println("Area lateral: " + areaL);
         System.out.println("Area total: " + areaTotal);
         System.out.println("Volumen: " + Volumen);
        
       }
            /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del cilindro */
       public static void CalcularCilindro(double radio,double altura){
         perimetroBase = 2*Math.PI*radio;
         areaL = perimetroBase*altura;
         areaBase= Math.PI* (radio*radio);
         areaTotal = 2*Math.PI*radio*(altura + radio);
         Volumen = areaBase*altura;

          //mostramos los resultados del clindro 
        System.out.println("El Area Lateral del cubo es: " + areaL);
        System.out.println("El Area Total del cubo es: " + areaTotal);
        System.out.println("El volumen del cubo es: " + Volumen);
            }
              /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones de la piramide  */
         public static void CalcularPiramide(double altura,int cantidadLados,double apotemaPiramide,double longitudLados){
         perimetroBase = cantidadLados * longitudLados;
         apotemaPiramide = (Math.sqrt(altura*altura)+(apotema*apotema));
         areaL = (perimetroBase*apotemaPiramide)/2;
         areaBase = perimetroBase*2*(apotema+apotemaPiramide);
         areaTotal = (areaL+areaBase);
         Volumen = (areaBase+altura)/3;

          //mostramos los resultados de piramide 
         System.out.println("El area Lateral de la pirámide es: "+areaL);
         System.out.println("El area total de la pirámide es "+areaTotal);
         System.out.println("El volumen de la pirámide es: "+Volumen);
        }

         /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del cono */
        public static void CalcularCono(double radio,double altura){
         perimetroBase = (Math.PI*radio);
         generatriz = Math.sqrt((radio*radio)+(altura*altura));
         areaL = perimetroBase*generatriz;
         areaBase = (Math.PI*(radio*radio));
         areaTotal = areaL + areaBase;
         Volumen = areaBase*altura/3;

          //mostramos los resultados de cono
         System.out.println("El area lateral el cono es: "+areaL);
         System.out.println("El area total del cono es: "+areaTotal);
         System.out.println("el volumen del cono es: "+Volumen);
        }
           /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones de esfera*/
       public static void  CalcularEsfera(double radio){
          area = 4*Math.PI*(radio*radio);
          Volumen = 4.0/3.0*Math.PI*(radio*radio*radio);

           //mostramos los resultados de esfera
         System.out.println("El valor del area es: "+area);
         System.out.println("El valor del volumen es: "+Volumen);
       }

        /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del zona esferica */
       public static void CalcularZonaEsferica(double radio,double radioM,double altura){
         area = 2*Math.PI*radioM*altura;
         Volumen = Math.PI*altura*((altura*altura)+3*radioM+3*radio)/6;

          //mostramos los resultados de zona esferica
         System.out.println("El area de la zona esferica es: "+area);
         System.out.println("El volumen de la zona esferica es: "+Volumen);
       }
         /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del casquete esferico */
       public static void calcularCasqueteEsferico(double altura,double radio,double radioM){
        area = 2*Math.PI*radioM*altura;
        aream = Math.PI*((radio*radio)+(altura*altura));
        Volumen = Math.PI*(altura*altura)*(3*radioM-altura)/3;
        volum= Math.PI*altura/6*(3*(radio*radio)+(altura*altura));

         //mostramos los resultados de  casquete esferico 
        System.out.println("Area en funcion del radio de la esfera: "+area);
        System.out.println("Area en funcion del radio menor: "+aream);
        System.out.println("volumen en funcion del radio de la esfera: "+Volumen);
        System.out.println("Area en funcion del radio menor: "+volum);

       }

        /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del hueso y cuña esferica */
       public static void calcularHusoCuñaEsferica(double radio,double angulo){
         area = 4*(Math.PI*(radio*radio)*angulo/360);
         Volumen = (4.0/3.0)*(Math.PI*(radio*radio*radio)*angulo/360);

          //mostramos los resultados de hueso y cuña esferico
         System.out.println("El area del uso esferico es: "+area); 
         System.out.println("El volumen de una cuña esferica es: "+Volumen);
       }

             /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del ortoedro*/
       public static void CalcularOrtoedro(double a,double b,double c){
         area = 2*(a*b+a*c+b*c);
         diagonal = Math.sqrt((a*a)+(b*b)+(c*c));
         Volumen = a*b*c;

         //mostramos los resultados de ortoedro 
        System.out.println("El valor del area es: "+area);
        System.out.println("El valor del volumen es: "+Volumen);
        System.out.println("El valor de la diagonal es: "+diagonal);
       }

        /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del tetaedro */
       public static void calcularTetaedro(int arista){
             area = ((arista*arista)*Math.sqrt(3));
             altura = (arista*(Math.sqrt(6)/3));
             Volumen = ((Math.sqrt(2)/12)*(arista*arista*arista));

             //mostramos los resultados de tetaedro
             System.out.println("El valor del area es: "+area);
             System.out.println("El valor de la altura es: "+altura);
             System.out.println("El valor del volumen es: "+Volumen);

       }
         /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del thexaedro*/
       public static void calcularHexaedro(int arista){
        area = (6*(arista*arista));
        Volumen = (arista*arista*arista);
       diagonal = (arista*Math.sqrt(3));

        //mostramos los resultados de hexaedro
       System.out.println("El area del hexaedro es: "+area); 
       System.out.println("El volumen del hexaedro es: "+Volumen);
       System.out.println("La diagonal del hexaedro es: "+area);
       }
       
      public static void calcularOctaedro(int arista){
        areaTotal = (2*(arista*arista)*Math.sqrt(3));
        areaCara = areaTotal/8;
        Volumen = Math.sqrt(2)/3*(arista*arista*arista);

         //mostramos los resultados de octaedro
       System.out.println("El valor del area Total es: "+areaTotal);
       System.out.println("El valor del area de la cara es: "+areaCara);
       System.out.println("El valor del volumen es: "+Volumen);
      }
           /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del dodecaedro */
      public static void calcularDodecaedro(int arista){
         double alfa = 36*(Math.PI/180);
         apotema = (arista/2*Math.tan(alfa));
         area = 3*(arista*arista)*Math.sqrt(25+10*Math.sqrt(5));
         Apent = 5/2*arista*apotema;
         Volumen = 1.0/4*(15+7*Math.sqrt(5))*(arista*arista*arista);

         //mostramos los resultados de deodecaedro
         System.out.println("El area del Dodecaedro es: "+area);
         System.out.println("El area de un pentagono del dodecaedro es: "+Apent);
         System.out.println("El volumen del dodecaedro es: "+Volumen);
      }

             /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del icosaedro */
      public static void calcularIcosaedro(int arista){
         areaTotal = (5*(arista*arista)*Math.sqrt(3));
         areaCara = areaTotal/20;
         Volumen = ((5.0/12)*(3+ Math.sqrt(5)*arista*arista*arista));

         //mostramos los resultados de icosaedro
         System.out.println("El valor del area Toltal es: "+areaTotal);
         System.out.println("El valor del area de las caras es: "+areaCara);
      }
            /* creamos un  metodo y dentro del mismo 
            hacemos las operaciones del tronco de cono */
      public static void calcularTroncodeCono(double altura,double radio,double radioM){
         generatriz = Math.sqrt((altura*altura)+(radioM*radioM-radio*radio));
         areaL = Math.PI*generatriz*(radioM+radio);
         areaBase = Math.PI*radioM;
         Areabase = Math.PI*radio;
         areaTotal = areaL + areaBase+ Areabase;
         Volumen = 1.0/3*Math.PI*altura*((radioM*radioM)+(radio*radio)+radioM*radio);


         //mostramos los resultados de tronco de cono
         System.out.println("El area lateral es: "+areaL);
         System.out.println("El area total es: "+areaTotal);
         System.out.println("El volumen es: "+Volumen);
      }
          
            /*Creamos un metodo para hacer las operaciones
             del tornco de piramide
          ' */
      public static void calcularTroncodepiramide(double altura,double Am, double AM){
                c= (AM-Am)/2;

                a = Math.sqrt((altura*altura)+(c*c));
                perimetroBase = AM*altura; 
                Perimetbase = Am*altura;
                areaL = (perimetroBase+Perimetbase)/2*a;
                areaBase = (AM*AM);
                Areabase = (Am*Am);
                areaTotal= areaL+areaBase+Areabase;
                Volumen = 1.0/3*altura*(areaBase+Areabase+Math.sqrt(areaBase*Areabase));

                //mostramos los resultados de  tronco de piramide 
                System.out.println("El area lateral es igual a: "+areaL);
                System.out.println("El area total es igual a: "+areaTotal);
                System.out.println("El volumen es igual a: "+ Volumen );

      }
       
     }
