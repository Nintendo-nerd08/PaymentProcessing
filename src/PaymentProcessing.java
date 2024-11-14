public class PaymentProcessing {
        public static void main(String[] args) {
            Payment creditCard = new CreditCardPayment();
            Payment paypal = new BankTransferPayment();
            Payment bankTransfer = new PaypalPayment();

            processPayment(creditCard, 150.0);
            processPayment(paypal, 200.50);
            processPayment(bankTransfer, 1000.0);
        }

        public static void processPayment(Payment paymentMethod, double amount){
            paymentMethod.processPayment(amount);
        }
    }



}
