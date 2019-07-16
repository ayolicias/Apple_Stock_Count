public class AppleStockCount{
    
public static void main(String[] args){
    if(args.length == 0){
        System.out.println("please give me qty!");
        return;
    }
        int qty = Integer.parseInt(args[0]);
        double cost = Double.parseDouble(args[1]);
        double total = qty * cost;
        if(qty < 1){
        System.out.println(" Out of Stock");
    }
    else{
        StringBuilder message = new StringBuilder();
        message.append("You have bought ");
        message.append(qty);
        //check if it is a multiple of dozens and returns the amount

        if(qty % 12 == 0){
        int dozen = qty / 12;
        message.append(dozen + " dozens");
        }
        message.append(" of apple");
        if (qty > 1) {
        message.append("s");
      }
        message.append(" for a total cost of ");
        message.append(total);
        message.append(".");

        System.out.println(message.toString());

    }


  }
}