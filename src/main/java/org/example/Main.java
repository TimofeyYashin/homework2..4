package org.example;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "login1234!";
        String password = "password1234";
        String confirmPassword = "password1234";

       try {
           Validator.validate(login,password,confirmPassword);
           System.out.println("Валидация прошла успешно");
       } catch (WrongLoginException wrongLoginException) {
           wrongLoginException.printStackTrace();
       }
       catch (WrongPasswordException wrongPasswordException) {
          wrongPasswordException.printStackTrace();
       }
        System.out.println("Валидация завершилась");
    }
}