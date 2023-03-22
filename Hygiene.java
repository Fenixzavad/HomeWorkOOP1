public class Hygiene extends Product{
    
    private int sizePaking;

    protected Hygiene(String name, int cost, int quantity, String measure, int sizePaking) {
        super(name, cost, quantity, measure);
        this.sizePaking = sizePaking;
    }

    public int getSize() {
        return sizePaking;
    }

}