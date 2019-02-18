/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan33.login;

import java.util.Scanner;

public class PBO210116058Latihan33Login {

    /**
     * @param args the command line arguments
     */
    
        private static String usName;
        private static String passWord;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName =scan.next();
        
        System.out.print("Masukkan Password = ");
        passWord = scan.next();
        
        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);
    }
    
}