
import Areas.*;

import java.util.Scanner;
import java.util.Arrays;
public class ClassComander {

    public static void sort(GeometrycalForms[] v){
        Arrays.sort(v);
    }
    public static double sum(GeometrycalForms[] v) {
        double tot = 0;
        for (GeometrycalForms f : v) {
            tot += f.area();
        }
        return tot;
    }
    public static GeometrycalForms choose(){
        boolean chosen = false;
        Scanner reader = new Scanner(System.in);
        GeometrycalForms Form = new Circle(0);
        while(!chosen) {
            System.out.println("\nSelect figure:\n0: Circle\n1: Ellipse\n2: Rectangle\n3: Square\n4: Triangle\n-15:exit\n-------------\n");
            int i = reader.nextInt();
            if (i==-15){
                boolean bye = false;
                reader = new Scanner(System.in);
                while(!bye) {
                    System.out.println("Are you sure? (y,n)"); // Falta try/catch aqui
                    String sure = reader.nextLine();
                    if (sure.equals("y")) {
                        bye = true;
                        System.exit(0);
                    } else if(sure.equals("n")) {
                        System.out.println("So yo will stay? Let's continue.");
                        bye = true;
                    } else {
                        System.out.println("Wrong code.");
                    }
                }

            }
            else if (i == 0) {
                System.out.println("Circle. Radius? Note: (decimals with ',' symbol)");
                double radius = reader.nextDouble();
                chosen = true;
                Form = new Circle(radius);
            } else if (i == 1) {
                System.out.println("Ellipse. Radiusa? Note: (decimals with ',' symbol)");
                double radiusa = reader.nextDouble();
                System.out.println("Ellipse. Radiusb? Note: (decimals with ',' symbol)");
                double radiusb = reader.nextDouble();
                chosen = true;
                Form = new Ellipse(radiusa, radiusb);
            } else if (i == 2) {
                System.out.println("Rectangle. Base? Note: (decimals with ',' symbol)");
                double base = reader.nextDouble();
                System.out.println("Rectangle. Height? Note: (decimals with ',' symbol)");
                double height = reader.nextDouble();
                chosen = true;
                Form = new Rectangle(base, height);
            } else if (i == 3) {
                System.out.println("Square. Side? Note: (decimals with ',' symbol)");
                double side = reader.nextDouble();
                chosen = true;
                Form = new Square(side);
            } else if (i == 4) {
                System.out.println("Triangle. Base? Note: (decimals with ',' symbol)");
                double base = reader.nextDouble();
                System.out.println("Triangle. Height? Note: (decimals with ',' symbol)");
                double height = reader.nextDouble();
                chosen = true;
                Form = new Triangle(base, height);
            } else {
                System.out.println("\nWrong number, input another time.");
            }
        }
        System.out.println("\nDone");
        return Form;
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Boolean auto = false;
        Boolean chosen = false;
        GeometrycalForms[] v;
        while(!chosen) {
            System.out.println("Do you want an example(y) or manual input?(n)");
            String s = reader.nextLine();
            if (s.equals("y")) {
                auto = true;
                chosen = true;
            } else if (s.equals("n")) {
                chosen = true;
            } else {
                System.out.println("Wrong character.");
            }
        }
        if (auto) {
            v = new GeometrycalForms[5];
            v[0] = new Rectangle(2, 3);
            v[1] = new Circle(1);
            v[2] = new Ellipse(1, 0.5);
            v[3] = new Square(2);
            v[4] = new Triangle(2, 3);


        } else {
            int num = 1;
            int correct = 0;
            while (correct == 0) {
                reader = new Scanner(System.in);
                correct = 1;
                try {
                    System.out.println("Specify the integer number of figures you want\n");
                    num = reader.nextInt();

                } catch(Exception e) {
                    System.out.println("Incorrect format. Try again.");
                    correct = 0;
                }
            }
            v = new GeometrycalForms[num];
            for (int i = 0; i < num; i++) {
                v[i] = ClassComander.choose();
            }
        }
        reader.close();
        double totarea = ClassComander.sum(v);
        System.out.println("Total area = "+totarea);
        System.out.println("\nActual list:\n"+Arrays.asList(v));
        ClassComander.sort(v);
        System.out.println("\nSorted list:\n"+Arrays.asList(v));
    }
}