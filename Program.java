public class Program {

    private static void ShowProducts(Product[] all){
        for (Product product : all) {
            System.out.println(product);
            System.out.println("---->");
        }
    }
    public static void main(String[] args) {
        Product milk = new Milk("Савушкин продукт", 3, 2, "Литр", "6 месяцев", 2);
        Product limonade = new Drinks("Sprite", 2, 1, "Литр", 2);
        Product bread = new Bread("Шахтерский", 1, 1, "шт", "3 дня", "1 сорт");
        Product eggs = new Eggs("Молодецкие", 3, 10, "шт", "3 нед", 10);
        Product masks = new Mask("Чистая среда", 9, 10, "шт", 10);
        Product pappare = new ToiletPappar("Zeva", 5, 4, "шт", 4, 2);
        Product diapers = new Diapers("Good", 12, 5, "шт.", 2, "да", 12, 5, 7, "Дышаший");
        Product nipple = new Nipple("Соска", 17, 1, "шт.", 1, "да");

        Product[] all = new Product[] {milk, limonade, bread, eggs, masks, pappare, diapers, nipple};

        ShowProducts(all);
    }

}
