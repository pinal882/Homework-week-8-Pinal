package methodoverriding24;
//Creating child classes
public class SBI extends  Bank {
    @Override
    public int getRateOfInterest() {
        return 8;

    }
}
