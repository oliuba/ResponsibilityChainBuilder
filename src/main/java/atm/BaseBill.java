package atm;

import lombok.Getter;

public class BaseBill implements Bill {
    private Bill toProcess;
    @Getter
    private int numBanknotes;
    private final int nominal;

    public BaseBill(int nominal) {
        this.nominal = nominal;
    }

    public void setNext(Bill next) {
        this.toProcess = next;
    }

    @Override
    public void process(int amount) {
        if (toProcess != null) {
            toProcess.process(amount % nominal);
        }
        else if (amount % nominal != 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Please receive " + amount / nominal + " of " + nominal);
    }
}
