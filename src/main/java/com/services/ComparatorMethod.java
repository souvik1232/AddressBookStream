package com.services;

import com.module.Address;

import java.util.Comparator;

public class ComparatorMethod {
    public static Comparator<Address> nameComparator = new Comparator<Address>() {

        public int compare(Address a1, Address a2) {
            String Name1 = a1.getFirstname().toUpperCase();
            String Name2 = a2.getFirstname().toUpperCase();


            return Name1.compareTo(Name2);
        }
    };
    public static Comparator<Address> stateComparator = new Comparator<Address>() {


        public int compare(Address a1, Address a2) {
            String Name1 = a1.getState().toUpperCase();
            String Name2 = a2.getState().toUpperCase();


            return Name1.compareTo(Name2);
        }
    };
    public static Comparator<Address> cityComparator = new Comparator<Address>() {

        public int compare(Address a1, Address a2) {
            String Name1 = a1.getCity().toUpperCase();
            String Name2 = a2.getCity().toUpperCase();


            return Name1.compareTo(Name2);
        }
    };
    public static Comparator<Address> zipComparator = new Comparator<Address>() {

        public int compare(Address a1, Address a2) {
            int Zip1 = a1.getZip();
            int Zip2 = a2.getZip();

            return Zip1-Zip2;
        }
    };
}
