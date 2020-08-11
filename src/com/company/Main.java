package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count: " + printer.getNumberPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted + " and new total print count for printer is: " + printer.getNumberPagesPrinted()) ;
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was: " + pagesPrinted + " and new total print count for printer is: " + printer.getNumberPagesPrinted());
        System.out.println("");
	// write your code here
    }
}
