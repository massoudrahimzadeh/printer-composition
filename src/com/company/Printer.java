package com.company;

public class Printer {
    private int tonerLevel;
    private int numberPagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public Printer(int tonerLevel, boolean duplex) {
        if(this.tonerLevel <= 100 && this.tonerLevel >= 0){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }

        this.numberPagesPrinted = 0;
        this.duplex = duplex;
    }
    public int fillUpToner(int tonerAmount){
        if(tonerAmount >0 && tonerAmount <=100){
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }else if (tonerAmount+tonerLevel >100){
            return -1;
        }else{
            return -1;
        }
    }
    public  int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pagesToPrint  /= 2) + (pages%2)  ;
            System.out.println("Printing in duplex mode");
        }
        this.numberPagesPrinted+=pagesToPrint;
        return numberPagesPrinted;
    }
}
