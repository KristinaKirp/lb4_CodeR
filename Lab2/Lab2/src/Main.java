import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //FIX_ME: добавлен switch для выбора задания по меню
        while (true) {
            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1 - Задание 1 (Точки)");
            System.out.println("2 - Задание 2 (Линии)");
            System.out.println("3 - Задание 3 (Студенты)");
            System.out.println("4 - Задание 4 (Конструкторы)");
            System.out.println("5 - Задание 5 (Длина линии)");
            System.out.println("0 - Выход");

            int menuChoice = Validation.inputInteger(input, "Выберите пункт: ");

            switch (menuChoice) {

                case 1:
                    System.out.println("\n===== Задание 1 =====");

                    double x1 = Validation.inputDouble(input, "Введите координату точки x_1: \n> ");
                    double y1 = Validation.inputDouble(input, "Введите координату точки y_1: \n> ");
                    double x2 = Validation.inputDouble(input, "Введите координату точки x_2: \n> ");
                    double y2 = Validation.inputDouble(input, "Введите координату точки y_2: \n> ");
                    double x3 = Validation.inputDouble(input, "Введите координату точки x_3: \n> ");
                    double y3 = Validation.inputDouble(input, "Введите координату точки y_3: \n> ");

                    Point point1 = new Point(x1, y1);
                    Point point2 = new Point(x2, y2);
                    Point point3 = new Point(x3, y3);

                    System.out.println("Точка 1: " + point1);
                    System.out.println("Точка 2: " + point2);
                    System.out.println("Точка 3: " + point3);
                    break;

                case 2:
                    System.out.println("\n===== Задание 2 =====");

                    Point startPoint1 = new Point(
                            Validation.inputDouble(input, "Введите координату начала первой линии x_1: \n> "),
                            Validation.inputDouble(input, "Введите координату начала первой линии y_1: \n> ")
                    );

                    Point endPoint1 = new Point(
                            Validation.inputDouble(input, "Введите координату конца первой линии x_1: \n> "),
                            Validation.inputDouble(input, "Введите координату конца первой линии y_1: \n> ")
                    );

                    Line line1 = new Line(startPoint1, endPoint1);

                    Point startPoint2 = new Point(
                            Validation.inputDouble(input, "Введите координату начала второй линии x_2: \n> "),
                            Validation.inputDouble(input, "Введите координату начала второй линии y_2: \n> ")
                    );

                    Point endPoint2 = new Point(
                            Validation.inputDouble(input, "Введите координату конца второй линии x_2: \n> "),
                            Validation.inputDouble(input, "Введите координату конца второй линии y_2: \n> ")
                    );

                    Line line2 = new Line(startPoint2, endPoint2);

                    Line line3 = new Line(line1.getStartPoint(), line2.getEndPoint());

                    System.out.println("Линия 1: " + line1);
                    System.out.println("Линия 2: " + line2);
                    System.out.println("Линия 3: " + line3);
                    break;

                case 3:
                    System.out.println("\n===== Задание 3 =====");

                    //FIX_ME: нет ввода данных с консоли
                    //Student student1 = new Student("Вася", new int[]{3, 4, 5});
                    //Student student2 = new Student("Петя", student1.getMarks().clone());
                    String name1 = Validation.inputString(input, "Введите имя студента 1: ");
                    int nMarks1 = Validation.inputInteger(input, "Сколько оценок у студента " + name1 + "? ");
                    int[] marks1 = new int[nMarks1];
                    for (int i = 0; i < nMarks1; i++) {
                        marks1[i] = Validation.inputMark(input, "Введите оценку " + (i + 1) + " для " + name1 + ": ");
                    }
                    Student student1 = new Student(name1, marks1);

                    String name2 = Validation.inputString(input, "Введите имя студента 2: ");
                    int nMarks2 = marks1.length;
                    int[] marks2 = marks1.clone();
                    Student student2 = new Student(name2, marks2);

                    System.out.println("Студенты до изменения:");
                    System.out.println(student1);
                    System.out.println(student2);

                    int markIndex = Validation.inputInteger(input, "Напишите номер оценки для изменения:\n> ");
                    int newMark = Validation.inputMark(input, "Напишите отметку для изменения: \n> ");

                    student2.changeMark(markIndex, newMark);

                    System.out.println("Студенты после изменения:");
                    System.out.println(student1);
                    System.out.println(student2);

                    //FIX_ME: нет ввода данных с консоли
                    //Student student3 = new Student("Андрей", student1.getMarks().clone());
                    //System.out.println("Создан Андрей (копия Васи): " + student3);
                    String name3 = Validation.inputString(input, "Введите имя студента 3: ");
                    int[] marks3 = student1.getMarks().clone(); //FIX_ME: копия оценок
                    Student student3 = new Student(name3, marks3);
                    System.out.println("Создан " + name3 + " (копия " + name1 + "): " + student3);
                    break;

                case 4:
                    System.out.println("\n===== Задание 4.1 =====");

                    //FIX_ME: добавлены переменные для изоляции кейса
                    //x1 = Validation.inputDouble(input,"Введите координату точки x_1: \n> "); и тд
                    double xPoint1 = Validation.inputDouble(input, "Введите координату точки x_1: \n> ");
                    double yPoint1 = Validation.inputDouble(input, "Введите координату точки y_1: \n> ");
                    double xPoint2 = Validation.inputDouble(input, "Введите координату точки x_2: \n> ");
                    double yPoint2 = Validation.inputDouble(input, "Введите координату точки y_2: \n> ");
                    double xPoint3 = Validation.inputDouble(input, "Введите координату точки x_3: \n> ");
                    double yPoint3 = Validation.inputDouble(input, "Введите координату точки y_3: \n> ");

                    Point pointA = new Point(xPoint1, yPoint1);
                    Point pointB = new Point(xPoint2, yPoint2);
                    Point pointC = new Point(xPoint3, yPoint3);

                    System.out.println(pointA);
                    System.out.println(pointB);
                    System.out.println(pointC);

                    System.out.println("\n===== Задание 4.2 =====");

                    //FIX_ME: добавлены переменные для изоляции кейса
                    double line1StartX = Validation.inputDouble(input, "Введите x1 линии 1: ");
                    double line1StartY = Validation.inputDouble(input, "Введите y1 линии 1: ");
                    double line1EndX = Validation.inputDouble(input, "Введите x2 линии 1: ");
                    double line1EndY = Validation.inputDouble(input, "Введите y2 линии 1: ");

                    Line taskLine1 = new Line(line1StartX, line1StartY, line1EndX, line1EndY);
                    System.out.println("Линия 1: " + taskLine1);

                    double horizontalStartX = Validation.inputDouble(input, "Начало X линии 2: ");
                    double horizontalEndX = Validation.inputDouble(input, "Конец X линии 2: ");
                    double horizontalY = Validation.inputDouble(input, "Высота Y: ");

                    Line taskLine2 = new Line(horizontalStartX, horizontalY, horizontalEndX, horizontalY);
                    System.out.println("Линия 2: " + taskLine2);

                    Line taskLine3 = new Line(taskLine1.getStartPoint(), taskLine2.getEndPoint());
                    System.out.println("Линия 3: " + taskLine3);
                    break;

                case 5:
                    System.out.println("\n===== Задание 5 =====");

                    //FIX_ME: добавлены переменные для изоляции кейса
                    double distX1 = Validation.inputDouble(input, "Введите координату x1: ");
                    double distY1 = Validation.inputDouble(input, "Введите координату y1: ");
                    double distX2 = Validation.inputDouble(input, "Введите координату x2: ");
                    double distY2 = Validation.inputDouble(input, "Введите координату y2: ");

                    Line distanceLine = new Line(distX1, distY1, distX2, distY2);
                    System.out.println(distanceLine);

                    int distanceValue = distanceLine.getDistance();
                    System.out.println("Длина линии: " + distanceValue);
                    break;

                case 0:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Ошибка выбора!");
            }
        }
    }
}