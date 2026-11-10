/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad2.listas;

/**
 * Nodo de una lista ligada simple.
 * Guarda un dato entero y una referencia al siguiente nodo.
 */
public class Nodo {

    int dato;          // valor almacenado en el nodo
    Nodo siguiente;     // referencia al siguiente nodo (null si es el último)

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}