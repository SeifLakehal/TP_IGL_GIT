/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL XPS
 */
/**
 * Une exception qui ce declenche seulement si la taille des deux tableaux à sommer est differente
 */
public class Tai_Dif_Exception extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tai_Dif_Exception(){
        System.out.println("ERREUR !!!!!!! Tableaux pas de même taille !");
    }
}
