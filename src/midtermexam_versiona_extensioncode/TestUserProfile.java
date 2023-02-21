/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author atinc
 */
public class TestUserProfile {
    public static void main(String[] args){
        String name;
        int i;
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        
        System.out.println("Choose your favorite genre: 0 for Comedy, 1 for Drama, 2 for Action, 3 for Mystery : ");
        i = input.nextInt();
        
        UserProfile obj = new UserProfile(name, genres[i]);
        
        System.out.println("Your name is " + obj.getUserID() + " and your favorite genre is " + obj.getGenre());
        
        
    }
}
