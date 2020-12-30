package com.services;

import com.module.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressService implements IAddress {
    ArrayList<Address> book =new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void createAddressBook(){

    }

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
        book.stream().forEach( n ->{
            if (n.getFirstname().equals(addressService.getFirstname())){
                System.out.println("Duplicate");
            }
            else {
                book.add(addressService);
            }
        });
        if(book.size()==0)
            book.add(addressService);
    }

    @Override
    public void edit() {

        String temp=null;
        System.out.println("Enter the 'First Name' of the record u want to Edit");
        temp=scanner.next();
        if(book.isEmpty())
        {
            System.out.println("No records to edit");
            return;
        }

        for(int i=0;i<book.size();i++)
        {
            if(book.get(i).getFirstname().equals(temp))
            {
                Address address=new Address();
                System.out.println(temp);
                System.out.println("Enter First name:");
                address.setFirstname(scanner.next());
                System.out.println("Enter last name:");
                address.setLastname(scanner.next());
                System.out.println("Enter your address:");
                address.setAddress(scanner.next());
                System.out.println("Enter your city:");
                address.setCity(scanner.next());
                System.out.println("Enter your state:");
                address.setState(scanner.next());
                System.out.println("Enter your ZIP code:");
                address.setZip(scanner.nextInt());
                System.out.println("Enter your phone number");
                address.setPhone(scanner.next());
                book.remove(i);
                book.set(i, address);
                break;
            }

        }
    }

    @Override
    public void delete() {

        String temp=null;
        System.out.println("Enter the First name of the record you want to delete");
        temp=scanner.next();
        if(book.isEmpty())
        {
            System.out.println("No records to delete");
            return;
        }
        for(int i=0;i<book.size();i++)
        {
            if(book.get(i).getFirstname().equals(temp))
            {
                book.remove(i);
                break;
            }
        }
    }

    @Override
    public void Search() {
        System.out.println("Search Preference:1.City  2.State");
        int input = scanner.nextInt();
        if(input == 1) {
            String temp=null;
            System.out.println("Enter the City whose record u want to display");
            temp=scanner.next();
            if (book.stream().count()==0) {
                System.out.println("No records to Show");
                return;
            }
            String finalTemp = temp;
            book.stream().forEach(n->{
                if (n.getCity().equals(finalTemp))
                    System.out.println(n.getFirstname());
            });
        }
        else {
            String temp=null;
            System.out.println("Enter the State whose record u want to display");
            temp=scanner.next();
            if(book.stream().count()==0)
            {
                System.out.println("No records to Show");
                return;
            }
            String finalTemp = temp;
            book.stream().forEach(n->{
                if (n.getState().equals(finalTemp))
                    System.out.println(n.getFirstname());
            });
        }

    }
    @Override
    public void displayCityCount() {
        book.stream().forEach( n->{
            System.out.println("City is "+n.getCity()+"& Name is: "+n.getFirstname());
        });
    }

    @Override
    public void displayStateCount() {
        book.stream().forEach( n->{
            System.out.println("State is "+n.getState()+"& Name is: "+n.getFirstname());
        });
    }
    @Override
    public void sortName() {
        book.stream().sorted(ComparatorMethod.nameComparator);
    }
    @Override
    public void sortState() {
        book.stream().sorted(ComparatorMethod.stateComparator);
    }
    @Override
    public void sortCity() {
        book.stream().sorted(ComparatorMethod.cityComparator);
    }
    @Override
    public void sortZip() {
        book.stream().sorted(ComparatorMethod.zipComparator);
    }

}
