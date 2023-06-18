package org.example;

import net.thauvin.erik.crypto.CryptoPrice;
import java.util.Scanner;

public class Main {
    /* public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        //System.out.println("What is BTC price today?");
        //var rate = scanner.nextDouble();
        var rate = CryptoPrice.spotPrice("BTC");
        System.out.println("BTC price is " + rate.getAmount());

        while (true) {
            System.out.println("How much dol u have?");
            var dollars = scanner.nextDouble();

            if (dollars == 0)
                break;

            var result = dollars / rate.getAmount().doubleValue();
            System.out.println("Result = " + result);
        }
    } */
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);

            System.out.print("Vehicle speed km/h: ");
            var speed = scanner.nextDouble();

            System.out.print("Travel time – hours: ");
            var time = scanner.nextDouble();

            var distance = speed * time;
            System.out.println("Distance traveled: " + distance + " kms");

            scanner.close();
        }
    }