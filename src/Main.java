import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить задачу");
            System.out.println("2.Вывести список задач");
            System.out.println("3.Удалить задачу");
            System.out.println("0.Выход из программы");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {

                case 1:
                    System.out.println("Добавить задачу: ");
                    String deal = scanner.nextLine();
                    list.add(deal);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Список задач: ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Введите номер задачи на удаление:");
                    int clean = scanner.nextInt() - 1;
                    list.remove(clean);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Программа завершена");
                    return;

                default:
                    System.out.println("Некорректная команда");
                    System.out.println();
                    break;
            }
        }
    }
}
