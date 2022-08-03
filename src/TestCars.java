import java.util.Objects;

public class TestCars {

    private String name;
    private int weigh;
    private int power;
    private boolean tuned;

    public TestCars(String name, int weigh, int power, boolean tuned) {

        this.name = name;
        this.weigh = weigh;
        this.power = power;
        this.tuned = tuned;

    }

    public String getName() {
        return name;
    }

    public int getWeigh() {
        return weigh;
    }

    public int getPower() {
        return power;
    }

    public boolean isTuned() {
        return tuned;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTuned(boolean tuned) {
        this.tuned = tuned;
    }


    @Override
    public String toString() {
        return "TestCars{" +
                "name='" + name + '\'' +
                ", weigh=" + weigh +
                ", power=" + power +
                ", tuned=" + tuned +
                '}';
    }


}
