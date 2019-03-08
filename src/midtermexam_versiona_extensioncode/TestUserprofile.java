/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author wenbi
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Please enter your userId");
        
        String userId = scan.nextLine();
        System.out.println("Please enter your favourite genre");
        String genre=scan.nextLine();
    UserProfile u= new UserProfile(userId, genre);
        System.out.println("user profile was created");
    
    }
    
}
