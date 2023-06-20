import java.util.Scanner;

import collections.RbBinTree;

public class App {
    public static void main(String[] args) throws Exception {
        RbBinTree tree = new RbBinTree();
        System.out.println("введите число:"); 
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {

                int value = Integer.parseInt(sc.nextLine());
                tree.add(value);
                System.out.println("fin");   
            }
        }

    } 
}
