package com.opencsv.java;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    public static void main(String[] args) {

        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter("data.csv"));
            OpenCSVUser openCSVUser = new OpenCSVUser("Naveen", "naveennani0711@gmail.com", "9502884323", "India");
            String[] record = openCSVUser.toString().split(",");

            csvWriter.writeNext(record);
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
