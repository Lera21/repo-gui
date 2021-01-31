//1. Разобраться с имеющимся кодом (написанный во время урока)
//  2. Создать класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
//  3. Создать класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу;
//  То есть в итоге должно быть:
//
//public static void main(String[] args) {
//  Course c = new Course(...); // Создаем полосу препятствий
//  Team team = new Team(...); // Создаем команду
//  c.doIt(team); // Просим команду пройти полосу
//  team.showResults(); // Показываем результаты
//  }

import ru.geekbrains.printer.A2Printer;
import ru.geekbrains.printer.PdfPrinter;
import ru.geekbrains.printer.Printer;

public class Main {

    public static void main(String[] args) {
        Printer[] printers = {new A2Printer(), new PdfPrinter()};

        for (Printer printer : printers) {
            printer.analyze("AXS");
        }
    }
}
