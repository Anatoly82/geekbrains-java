package Lesson3;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

public class Password {
    public static void main (String[] args) throws java.lang.Exception
    {
        String s = "#2abcA@@";
        String pat = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,}";
        if (s.matches(pat)) {
            System.out.println("Пароль действителен");
        }
        else {
            System.out.println("Пароль недействителен");
        }
    }
}
