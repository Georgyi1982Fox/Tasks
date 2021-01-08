package tasks.taskone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        for(String st: s.split(" ")){
            System.out.print(new StringBuilder(st).reverse().toString());
            System.out.print(" ");
        }

    }

}
