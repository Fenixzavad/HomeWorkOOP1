public class Eggs extends Food {
    
    private int packagesEggs;
    protected Eggs(String name, int cost, int quantity, String measure, String date, int packagesEggs) {
        super(name, cost, quantity, measure, date);
        this.packagesEggs = packagesEggs;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Количество в уп.: %d;", super.getName(),
        super.getCost(), super.getQuantity(), super.getMeasure(), super.getDate(), this.packagesEggs);
    }

}