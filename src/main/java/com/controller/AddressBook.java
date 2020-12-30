package com.controller;

import com.services.AddressService;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        int  input;
        int ans;
        AddressService object = new AddressService();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add a contact");
            System.out.println("2.Edit a contact");
            System.out.println("3.Delete a contact");
            System.out.println("4.Search City/State wise");
            System.out.println("5.Display City wise");
            System.out.println("6.Display State wise");
            System.out.println("7.Sort by First Name");
//            System.out.println("8.Sort by City");
//            System.out.println("9.Sort by State");
//            System.out.println("10.Sort by Zip");
            input = scanner.nextInt();
            switch(input)
            {
                case 1:
                    object.add();
                    break;
                case 2:
                    object.edit();
                    break;
                case 3:
                    object.delete();
                    break;
                case 4:
                    object.Search();
                    break;
                case 5:
                    object.displayCityCount();
                    break;
                case 6:
                    object.displayStateCount();
                    break;
                case 7:
                    object.sortName();
                    break;
//                case 8:
//                    object.sortCity();
//                    break;
//                case 9:
//                    object.sortState();
//                    break;
//                case 10:
//                    object.sortZip();
//                    break;
                default:System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue?(0/1)");
            ans=scanner.nextInt();
        }while(ans==1);
    }
}
