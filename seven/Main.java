package seven;
import java.util.*;public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Тарас Бульба", "Гоголь", 1852));
        library.addBook(new Book("Война и мир", "Толстой", 1863));
        library.addBook(new Book("Капитанская дочка", "Пушкин", 1821));
        library.printAllBooks();

        for (int i = 0; i < 1; i+=0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Что Вы хотите сделать");
            System.out.println("1. Вывести все книги");
            System.out.println("2. Добавить книгу");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Найти книгу");
            System.out.println("5. Закончить");
            int a = sc.nextInt();
            sc.nextLine();

            if (a==1) {
                library.printAllBooks();
            }

            if (a==2){
                System.out.println("Введите название книги:");
                String name = sc.nextLine();
                System.out.println("Введите Автора:");
                String author = sc.nextLine();
                System.out.println("Введите год:");
                int year = sc.nextInt();
                sc.nextLine();
                library.addBook(new Book(name, author, year));
                System.out.println("Обновленная библиотека");
                library.printAllBooks();
            }

            if (a==3) {
                System.out.println("Введите название книги:");
                String name = sc.nextLine();
                library.removeBook(name);
                System.out.println("Обновленная библиотека");
                library.printAllBooks();
            }

            if (a==4) {
                System.out.println("Введите Автора:");
                String author = sc.nextLine();
                library.findBookByAuthor(author);
            }

            if (a==5){
                break;
            }
        }
    }
}