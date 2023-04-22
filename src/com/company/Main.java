package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
        Pattern pattern = Pattern.compile("(/{2}[^\n]*\n)|(/\\\\*.*?\\\\*/)", Pattern.DOTALL);
        int c;
        StringBuilder input = new StringBuilder();
        while ((c = reader.read()) != -1) {
            input.append((char) c);
        }
        Matcher matcher = pattern.matcher(input.toString());
        input = new StringBuilder(matcher.replaceAll(""));
        writer.write(input.toString());
        reader.close();
        writer.close();
    }
}

