/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bolso
 */
public class Mesa {
    private int numero;
    private UsuarioMozo mozo;
    private boolean estaAbierta;


    public Mesa(int numero, UsuarioMozo mozo, boolean estaAbierta)
    {
        this.numero         = numero;
        this.mozo           = mozo;
        this.estaAbierta    = estaAbierta;
    }
}
