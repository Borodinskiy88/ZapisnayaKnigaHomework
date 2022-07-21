import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить задачу");
            System.out.println("2.Вывести список задач");
            System.out.println("3.Удалить задачу");
            System.out.println("0.Выход из программы");
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
//todo Исключить выброс программы при неверном значении номера дела
                case 3:
                    System.out.println("Введите номер задачи на удаление:");
                    int clean = Integer.parseInt(scanner.nextLine()) - 1;
                        if (!list.contains(deal)) {
                            System.out.println("Такого дела в списке нет");
                            System.out.println();
                            break;
                        } else {
                            list.remove(clean);
                            for (int i = 0; i < list.size(); i++) {
                                System.out.println((i + 1) + ". " + list.get(i));
                            }
                            System.out.println();
                            break;
                        }



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
