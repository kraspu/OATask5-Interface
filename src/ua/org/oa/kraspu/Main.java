package ua.org.oa.kraspu;

/*  1. Создать интерфейс SimpleList, который определяет методы динамического массива, предназначенного для хранения строк:

        void add(String s) - добавить строку в массив
        String get() - получить последний элемент из массива
        String get(int id) - получить элемент по его индексу
        String remove() - удалить последний элемент
        String remove(int id) - удалить элемент по индексу
        boolean delete() - удалить все элементы массива.

    2. Создать класс DynamicStringList, который реализует все методы интерфейса SimpleList.
       Для хранения элементов добавленных в объект типа DynamicStringList должен использоваться обычный Java-массив.

    3. В классе DynamicStringList предусмотреть 2 конструктора: а)пустой и б) с числовым аргументом,
       определяющим начальный размер массива для хранения строк.

    4. Все поля, используемые в классе для хранения элементов массива должны быть инкапсулированы.

    5. Переопределить метод toString этого класса, для вывода всех строк, которые хранятся в объекте
       типа DynamicStringList

    6. Создать объект типа DynamicStringList. Продемонстрировать добавление, извлечение, удаление строк из объекта,
       а также вывод на экран его содержимого.

    7. На этапе составления программы должны быть использованы соглашения из java code convention.
*/
public class Main {

  public static void main(String[] args) {

    System.out.println("\n---------- добавить 6 элементов в массив из [5]:");

    SimpleList array = new DynamicStringList(5);
//    SimpleList array = new DynamicStringList();   //для конструктора без параметров! (работает!!!)
    array.add("Первая строка");
    array.add("Вторая строка");
    array.add("Третья строка");
    array.add("Четвертая строка");
    array.add("Пятая строка");
    array.add("Шестая строка");

    System.out.println(array);

    System.out.println("\n---------- получить последний элемент массива:");

    System.out.println(array.get());

    System.out.println("\n---------- получить 3-ий элемент массива:");

    System.out.println(array.get(3));

    System.out.println("\n---------- удалить последний элемент:");

    array.remove();
    System.out.println(array);

    System.out.println("\n---------- удалить 0-й элемент:");

    array.remove(0);
    System.out.println(array);

    System.out.println("\n---------- удалить все элементы массива:");

    array.delete();
    System.out.println(array);
  }
}
