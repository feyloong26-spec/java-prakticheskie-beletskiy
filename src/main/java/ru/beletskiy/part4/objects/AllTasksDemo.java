package ru.beletskiy.part4.objects;
import ru.beletskiy.part3.shapes.Shape;
import ru.beletskiy.part3.shapes.Circle;
import ru.beletskiy.part3.shapes.Rectangle;
import ru.beletskiy.part3.shapes.Square;

/** ПР4.1: задачи 1–10 (восьмая повторяет абстрактную Shape из ПР3). */
public class AllTasksDemo {
    public static void main(String[] args) {
        System.out.println("=== Задание 1: полиморфизм фигур ===");
        Shape[] shapes = {new Circle(2), new Rectangle(3, 4), new Square(5)};
        for (Shape s : shapes) System.out.printf("%s: площадь %.2f, периметр %.2f%n", s.getType(), s.getArea(), s.getPerimeter());
        System.out.println("=== Задание 2: телефоны ===");
        Phone[] phones = {new Phone("+79990000001", "Samsung", 180), new Phone("+79990000002", "Xiaomi"), new Phone()};
        for (Phone p : phones) { System.out.println(p); p.receiveCall("Иван"); System.out.println("Номер: " + p.getNumber()); }
        phones[0].receiveCall("Анна", "+79993334455");
        phones[0].sendMessage("+79990000002", "+79990000003");
        System.out.println("=== Задание 3: Person ===");
        Person[] people = {new Person(), new Person("Алексей Белецкий", 20)};
        for (Person person : people) { System.out.println(person); person.talk(); person.move(); }
        System.out.println("=== Задание 4: матрицы ===");
        Matrix a = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix b = new Matrix(new double[][]{{5, 6}, {7, 8}});
        System.out.println("A+B:"); a.add(b).print();
        System.out.println("A*2:"); a.multiply(2).print();
        System.out.println("A*B:"); a.multiply(b).print();
        System.out.println("=== Задание 5: читатели библиотеки ===");
        Reader[] readers = {new Reader("Петров В. В.", "001", "УИБ", "01.01.2004", "89000000000"),
                            new Reader("Иванов И. И.", "002", "УИБ", "02.02.2004", "89000000001")};
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        Book[] books = {new Book("Приключения", "Автор 1"), new Book("Словарь", "Автор 2"), new Book("Энциклопедия", "Автор 3")};
        readers[0].takeBook(books); readers[0].returnBook(books);
        readers[1].returnBook(1);
        System.out.println("=== Задание 6: Employer / Manager ===");
        Employer[] employers = {new Employer("Иван", "Петров", 50000), new Manager("Мария", "Иванова", 65000, 150000)};
        for (Employer employer : employers) System.out.printf("%s: годовой доход %.2f ₽%n", employer, employer.getIncome());
        System.out.println("=== Задание 7: учащиеся ===");
        Learner[] learners = {new Schoolchild("Павел"), new Student("Мария"), new Schoolchild("Олег"), new Student("Антон")};
        for (Learner learner : learners) if (learner instanceof Schoolchild) System.out.println("Школьник: " + learner);
        for (Learner learner : learners) if (learner instanceof Student) System.out.println("Студент: " + learner);
        System.out.println("=== Задание 8: абстрактный Shape (из ПР3) ===");
        ru.beletskiy.part3.shapes.TestShape.main(args);
        System.out.println("=== Задание 9: мебельный магазин ===");
        FurnitureShop shop = new FurnitureShop(); shop.add(new Chair("дерево", 2500)); shop.add(new TableFurniture("металл", 6100));
        shop.display(); System.out.println("Стоимость всей мебели: " + shop.totalCost() + " ₽");
        System.out.println("=== Задание 10: транспорт ===");
        Transport[] vehicles = {new Car(), new Airplane(), new Train(), new Ship()};
        double distance = 600;
        for (Transport t : vehicles)
            System.out.printf("%s: 600 км за %.2f ч, 3 пассажира %.2f ₽, груз 2 т %.2f ₽%n",
                t.getName(), t.travelHours(distance), t.passengerCost(distance, 3), t.freightCost(distance, 2));
        System.out.println("Примечание: тарифы/скорости в задаче 10 — демонстрационные, поскольку в методичке они не заданы.");
    }
}
