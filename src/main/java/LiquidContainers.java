
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MoveContainers containers = new MoveContainers();
        while (true) {
            System.out.println(containers.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts [0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                containers.addAmount(amount);
                System.out.println("");
            } else if(command.equals("move")){
                containers.moveAmount(amount);
                System.out.println("");
            } else if(command.equals("remove")){
                containers.removeAmount(amount);
                System.out.println("");
            }

        }
    }

}
