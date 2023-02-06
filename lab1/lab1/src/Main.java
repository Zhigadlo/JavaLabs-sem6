import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var trains = GenerateTrains(10);

        for (var train:
             trains) {
            System.out.println(train.toString());
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of train: ");
        int number = in.nextInt();
        in.close();

        Train selectedTrain = GetTrainByNumber(number, trains);
        if(selectedTrain == null) {
            System.out.println("There is no trains with number " + number);
            return;
        }
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("check.dat")))
        {
            oos.writeObject(selectedTrain);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("check.dat")))
        {
            Train readedTrain =(Train)ois.readObject();
            System.out.println("--------------------------------");
            System.out.println("Your check");
            System.out.println(readedTrain.toCheckString());

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
    public static ArrayList<Train> GenerateTrains(int count){
        var rnd = new Random();
        ArrayList<Train> trains = new ArrayList<Train>();
        for (int i = 0; i < count; i++) {
            var train = new Train();
            train.setDate(new Date(123, rnd.nextInt(12), rnd.nextInt(30), rnd.nextInt(24), rnd.nextInt(60), rnd.nextInt(60)));
            train.setNumber(i + 1);
            train.setStartStation("station" + rnd.nextInt(count));
            train.setEndStation("station" + rnd.nextInt(count));
            train.setCost(rnd.nextInt(2000));
            trains.add(train);
        }
        return trains;
    }

    public static Train GetTrainByNumber(int number, ArrayList<Train> trains){
        for (var train:
             trains) {
            if(train.getNumber() == number){
                return train;
            }
        }
        return null;
    }
}

