package com.services;

import com.module.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressService implements IAddress {
    ArrayList<Address> book =new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {

        Address addressService = new Address();
        System.out.println("Enter First name:");
        addressService.setFirstname(scanner.next());
        System.out.println("Enter last name:");
        addressService.setLastname(scanner.next());
        System.out.println("Enter your address:");
        addressService.setAddress(scanner.next());
        System.out.println("Enter your city:");
        addressService.setCity(scanner.next());
        System.out.println("Enter your state:");
        addressService.setState(scanner.next());
        System.out.println("Enter your ZIP code:");
        addressService.setZip(scanner.nextInt());
        System.out.println("Enter your phone number");
        addressService.setPhone(scanner.next());
        book.add(addressService);
    }
}
