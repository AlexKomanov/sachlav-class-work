package lesson_3_operators.tasks;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String login = "Admin";
        String password = "P@ssword";

        // Создаём объект класса Scanner для обработки ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        System.out.print("Введите login: ");

        // Cоздаём строкову локальную переменную с именем usersLogin
        // и принимаем в нее ввод от пользователя

        String usersLogin = in.nextLine();

        if (login.equals(usersLogin)) {
            System.out.print("Введите password: ");
            String usersPassword = in.nextLine();

            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + login + ", Вы вошли в систему.");
            } else {
                System.out.println("Вы ввели неверный пароль!");
            }
        } else {
            System.out.println("Нет пользователя с таким именем!");
        }
    }
}
