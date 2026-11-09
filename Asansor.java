/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asansor;
import java.util.Scanner;
/**
 *
 * @author emirh
 */
public class Asansor {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Katinizi ve gitmek istediginiz kati soyleyin");
   int kat=sc.nextInt();
    int katc=sc.nextInt();
        if (kat>10 || kat<1) {
            System.out.println("hata");   
        } else {
            if (kat>katc) {
                System.out.println("asagı yonde" + (kat-katc) + "kat gidiceksiniz");
                    
              
                
    
            } else { System.out.println("yukari yonde" + (katc-kat) + "kat gidiceksiniz");
            }
        }
    
    
    
    
    
    
    }
}
