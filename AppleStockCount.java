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
        //check if it is a multiple of 12 and returns the amount divided by 12
        if(qty % 12 == 0){
            int dozen = qty / 12;
            message.append(dozen + " dozen");
        }
        //check if it is a multiple of 36 and returns the amount divided by 36

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