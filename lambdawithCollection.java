package placement;
import java.util.*;
interface BillCalculator{
	double calculate(double amount);
}
public class lambdawithCollection {
	public static void main(String[] args) {
		List<Double> orders = Arrays.asList(120.0, 250.0, 80.0);
        BillCalculator gst = amount -> amount + (amount*0.05);
        BillCalculator discount = amount -> amount + (amount*0.10);
	BillCalculator delivery = amount ->{
		if(amount < 500) {
			return amount + 50;
		}else {
			return amount;
		}
	};
	BillCalculator service = amount -> amount+(amount*0.02);
	orders.forEach(order->{
		double afterGST = gst.calculate(order);
		double afterDiscount = discount.calculate(afterGST);
		double afterDelivery = delivery.calculate(afterDiscount);
		double finalAmount = service.calculate(afterDelivery);
		
		 System.out.println("Original Amount  : " + order);
        System.out.println("After GST (5%)   : " + afterGST);
        System.out.println("After Discount   : " + afterDiscount);
        System.out.println("After Delivery   : " + afterDelivery);
        System.out.println("Final Bill       : " + finalAmount);
        System.out.println("-----------------------------");
    });
	}
}

