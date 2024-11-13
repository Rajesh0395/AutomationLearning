package Nov8;

public class Payment implements Upi{


    public  static void main(String [] args)
    {
        Payment p1=new Payment();
        p1.debitcard(-1);
        p1.gpay(2);
        p1.phonepe();
        p1.paypal();
    }
    @Override
    public void gpay(int validamount) {
        if(validamount>0)
        {
            System.out.println("upi payment debited successfully");
        }
        else {
            System.out.println("invalid amount");
        }
    }

    @Override
    public void phonepe() {
        System.out.println("payment in phonepe is successful");
    }

   @Override
    public void debitcard(int amount)
   {
       if(amount>0)
       {
           System.out.println("payment is valid");
       }
       else
       {
           System.out.println("invalid payment");
       }
   }

   @Override
    public void paypal()
   {

   }

}
