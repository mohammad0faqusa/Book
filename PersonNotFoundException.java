/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressBookk;

/**
 *
 * @author moham
 */
public class PersonNotFoundException extends Exception {
    
    public PersonNotFoundException (String message) { 
        super(message) ; 
    }

    PersonNotFoundException() {
        super() ; 
    }
}
