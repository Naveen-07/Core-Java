package com.opencsv.java;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class OpenCSVReader {
    public static void main(String[] args) throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("data.csv"));

        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null) {
            System.out.println("==========================");
            System.out.println("Name    : " + nextRecord[0]);
            System.out.println("Email   : " + nextRecord[1]);
            System.out.println("Phone   : " + nextRecord[2]);
            System.out.println("Country : " + nextRecord[3]);
            System.out.println("==========================");
        }
    }
}
