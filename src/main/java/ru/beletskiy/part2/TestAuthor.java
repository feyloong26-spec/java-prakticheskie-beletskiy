package ru.beletskiy.part2;
public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("=== ПР1 ч.2: Author ===");
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        System.out.println(author);
        author.setEmail("new@somewhere.com");
        System.out.println("Обновлённый адрес: " + author.getEmail());
        System.out.println("Имя: " + author.getName() + ", пол: " + author.getGender());
    }
}
