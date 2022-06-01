package com.in28minutes.oops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class FileReadRunner {
      public static void main(String[] args) throws IOException {
            Path pathFileToRead = Paths.get("/Users/michaelkestler/IdeaProjects/codeup-java-exercises/resources/data.txt");
//            List<String> lines = Files.readAllLines(pathFileToRead);
//            System.out.println(lines);

            Files.lines(pathFileToRead)
                    .map(String::toLowerCase)
                    .filter(str -> str.contains("a"))
                    .forEach(System.out::println);

        }
    }

