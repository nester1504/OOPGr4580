import Classes.*;
import Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident",1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviuor tax = new TaxService();

        iActorBehaviuor promo = new PromotionalClient("Vova","10%",777);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(promo);

        magnit.update();
    }
}
