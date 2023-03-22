public class Mask  extends Hygiene {

    protected Mask(String name, int cost, int quantity, String measure, int sizePaking) {
        super(name, cost, quantity, measure, sizePaking);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Количество в уп.: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize());
    }

}
