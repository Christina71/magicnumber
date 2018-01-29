package com.example.magicnumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class magicNumberPattern {

    @RequestMapping("/magic")

    public String magicNumber(@RequestParam("number") int num) {
        String output = " ";
        Scanner input = new Scanner(System.in);


        while (num!=1) {
            if (num % 2 == 0) {
                num = num / 2;

                output = output + " " + num  ;
            } else {
                num = num * 3 + 1;

                output =  output + " " + num ;
            }

        }
        return "Your web page prints:" + "<br>" + "Starting number: " + num +"<br>" + output;
    }
}


