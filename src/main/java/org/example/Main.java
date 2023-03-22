package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RunLengthEncoding nom = new RunLengthEncoding();
        System.out.println(nom.encode("MelisSa"));
        System.out.println(nom.decode("MELI2SA"));
    }
}