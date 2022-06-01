package com.in28minutes.oops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

        public static void main(String[] args) throws IOException {
            Path pathFileToWrite = Paths.get("/Users/michaelkestler/IdeaProjects/codeup-java-exercises/resources" +
                    "/file-write.txt");
         List<String> list =
            List.of("Jenna Jameson", "239-456-9777", "Larry Kroeger", "765-549-3854", "Linda Lovelace", "702-867-5309");

            Files.write(pathFileToWrite, list);


        }
    }




