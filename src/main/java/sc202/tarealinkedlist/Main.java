/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc202.tarealinkedlist;

/**
 *
 * @author pablo
 */
public class Main {
    
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        if(args.length > 0){
            for (int i = 0; i < args[0].length(); i++) {
                int num = Integer.parseInt(String.valueOf(args[0].charAt(i)));
                lista.add(num);
            }
            System.out.println(lista.get(Integer.parseInt(args[1])));
        }
        else{
            //Poner sus pruebas aqui
            
        }
    }
    
}
