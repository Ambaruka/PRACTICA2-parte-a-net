/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica02.a;

import java.util.Scanner;
import frmComputadora.java;

/**
 *
 * @author AmbarPC
 */
public class Practica02A {

    public static void main(String[] args) {
Dispositivo[] registro =new Dispositivo[20];

        int respuesta=0;
        int turno=0;
        Scanner leer=new Scanner(System.in);
        while (respuesta!=4||turno==19){
            System.out.println("Sleleccione la operación a realizar" +
                    "\n1-Registrar" +
                    "\n2-Buscar" +
                    "\n3-Consultar" +
                    "\n4-Salir");
            respuesta=leer.nextInt();
            switch (respuesta) {
                case 1:
                    leer.nextLine();
                    System.out.println("Ingrese el modelo");
                    String modelo=leer.nextLine();
                    System.out.println("Ingrese la marca del dispositivo");
                    String marca=leer.nextLine();
                    System.out.println("Ingrese el precio del dispositivo");
                    float precio=(leer.nextFloat());
                    System.out.println("Ingrese el tipo de dispositivo");
                    leer.nextLine();
                    String tipo=(leer.nextLine());
                    Dispositivo dispositivo=new Dispositivo(marca,precio,tipo,modelo);
                    registro[turno]=dispositivo;
                    turno++;
                    System.out.println("El registro se hizo con exito");
                    break;
                case 2:
                    System.out.println("Ingrese el modelo a buscar");
                    leer.nextLine();
                    String abuscar=leer.nextLine();
                    int encontrar=30;
                    for (int i=0;i<turno;i++) {
                        if (registro[i].getModelo().equals(abuscar)){
                            encontrar=i;
                        }
                    }
                        if (encontrar<turno){
                            System.out.println("\nMarca: "+ registro[encontrar].getMarca()+
                                    "\nPrecio: $"+ registro[encontrar].getPrecio()+
                                    "\nTipo: "+ registro[encontrar].getTipo());

                            System.out.println("¿Desea modificar algun atributo? \n1-Si     2-No");
                            int modificar=leer.nextInt();
                            if (modificar==1){
                                System.out.println("Elija el parametro a modificar: \n1-Marca \n2-Precio \n3-Tipo");
                                leer.nextLine();
                                int parametro=leer.nextInt();
                                switch (parametro){
                                    case 1:
                                        System.out.println("Ingrese la nueva marca del dispositivo");
                                        String marca1=leer.nextLine();
                                        registro[encontrar].setMarca(marca1);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio del dispositivo");
                                        float precio1=(leer.nextFloat());
                                        registro[encontrar].setPrecio(precio1);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el tipo de dispositivo");
                                        leer.nextLine();
                                        String tipo1=(leer.nextLine());
                                        registro[encontrar].setTipo(tipo1);
                                        break;
                                    default:
                                        System.out.println("Opción incorrecta");
                                }
                            }
                        }
                        else {
                            System.out.println("No se encontro el modelo");
                        }
                    break;
                case 3:
                    for (int i=0;i<turno;i++) {
                        System.out.println("Modelo: "+ registro[i].getModelo()+
                                "\nMarca: "+ registro[i].getMarca()+
                                "\nPrecio: $"+ registro[i].getPrecio()+
                                "\nTipo: "+ registro[i].getTipo()+"\n \n");
                    }
                    break;
                case 4:
                    break;
                default:System.out.println("Opción incorrecta");
            }
            }
            if (turno==19){

                System.out.println("El arreglo se ha llenado");
                for (int i=0;i<turno;i++) {
                    System.out.println("Modelo: "+ registro[i].getModelo()+
                            "\nMarca: "+ registro[i].getMarca()+
                            "\nPrecio: $"+ registro[i].getPrecio()+
                            "\nTipo: "+ registro[i].getTipo()+"\n \n");
            }}
        }
    }

