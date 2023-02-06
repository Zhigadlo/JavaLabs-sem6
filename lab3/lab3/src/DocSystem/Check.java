package DocSystem;

public class Check extends File{
    private int sum;

    public Check(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "check";
    }
}
