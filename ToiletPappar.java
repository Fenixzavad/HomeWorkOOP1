public class ToiletPappar extends Hygiene {

    private int layers;
    protected ToiletPappar(String name, int cost, int quantity, String measure, int sizePaking, int layers) {
        super(name, cost, quantity, measure, sizePaking);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Количество в уп.: %d; Кол. слоев: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getMeasure(), super.getSize(), this.layers);
    }

}