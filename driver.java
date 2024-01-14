import java.util.Random;
import java.util.ArrayList;

public class driver {

    public static void main(String[] args) {
        tree t1 = new tree(0);
        driver d1 = new driver();

        ArrayList<Double> rainfall = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            System.out.println("\nYear: " + i);

            double inchRain = d1.inchesRain(rainfall);
            double mmRain = d1.inchesToMM(inchRain);

            System.out.println("Rain this year: " + inchRain + " inches or "
                    + mmRain + " mm") ;
            t1.grow(mmRain);
            t1.drawMe();
            d1.fire(t1,rainfall);
        }

    }

    public double inchesToMM(double inches){
        double mm = inches * 25.4;
        return mm;
    }

    public double last3YearInInches(ArrayList<Double> rainfall){
        if (rainfall.size() < 3){
            return 100;
        }
        else{
            double l1 = rainfall.get(rainfall.size() - 1);
            double l2 = rainfall.get(rainfall.size() - 2);
            double l3 = rainfall.get(rainfall.size() - 3);

            double lavg = (l1 + l2 + l3) / 3;

            return lavg;
        }

    }

    public void fire(tree t1, ArrayList<Double> rainfall){
        double lavg2 =  last3YearInInches(rainfall);

        if (lavg2 < 0.5){
            t1.setMyChar('|');
            System.out.println("Oh no, Fire!!!");
        }
        else{
            t1.setMyChar('V');
        }
    }

    public double inchesRain(ArrayList<Double> rainfall){
        Random random = new Random();
        float inches = random.nextFloat(2);

        rainfall.add((double) inches);

        return inches;
    }
}
