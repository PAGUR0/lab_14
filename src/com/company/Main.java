package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
        Pattern pattern = Pattern.compile("(/{2}.*$)|(/\\\\*.*?\\\\*/)", Pattern.DOTALL);
        String str;
        String input = "";
        while ((str = reader.readLine()) != null) {
            input = input + "\n" + str;
        }
        Matcher matcher = pattern.matcher(input);
        str = matcher.replaceAll("");
        writer.write(str);
        reader.close();
        writer.close();
    }
}

