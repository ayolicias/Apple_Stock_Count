public class AppleStockCount{
    
public static void main(String[] args){
    if(args.length == 0){
        System.out.println("please give me qty!");
        return;
    }
        int qty = Integer.parseInt(args[0]);
        if (args.length ==1){
            System.out.println("Please give me the Price");
            return;
        }
        double cost = Double.parseDouble(args[1]);
        double total = qty * cost;
        if(qty < 1){
        System.out.println(" Out of Stock");
    }
    else{
        StringBuilder message = new StringBuilder();
        message.append("You have bought ");
        //check if it is a multiple of dozens and returns the amount

        if(qty % 12 == 0){
            int dozen = qty / 12;
            message.append(dozen + " dozen");

        // how many dozens I have if more than one add an s
            if(dozen > 1){
            message.append("s");
            }
         message.append(" of apples");

            }
         else {
            message.append(qty);
            message.append(" apple");
            if (qty > 1) {
                message.append("s");
            }
        }

        

        message.append(" for a total cost of ");
        message.append(total);
        message.append(".");

        System.out.println(message.toString());

    }


  }
}