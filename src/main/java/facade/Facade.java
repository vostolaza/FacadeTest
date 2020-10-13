package facade;

class Facade {
    Shipping ship;
    Order order;
    Billing bill;

    Facade(){
        ship = new Shipping();
        order = new Order();
        bill = new Billing();
    }

    void doSomething(){
        ship.doSomething();
        order.doSomething();
        bill.doSomething();
    }
}