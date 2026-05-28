/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.clientes;

/**
 *
 * @author Ambar Santos 
 *
 */
public class cliente {
    int id;
    String nombre;
    String categoria;
    String direccion; 

        //Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }


        public void setId(int id){
            this.id = id;
        }


        public int getId(){
            return id;
        }
    

        //constructor vacio
        public cliente(){}

        //Constructor
        public cliente(int id, String nombre, String categoria, String direccion) {
            this.id = id;
            this.nombre = nombre;
            this.categoria = categoria;
            this.direccion = direccion; 
    }
    
}
