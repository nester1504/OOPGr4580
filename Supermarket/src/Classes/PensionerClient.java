package Classes;

public class PensionerClient extends Actor {
    private int pensID;

    public PensionerClient(String name, int pensID) {
        super(name+" - пенсионер");
        this.pensID = pensID;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

    @Override
    public boolean processReturn(String orderName) {
        return false;
    }

    @Override
    public boolean canReturn(String orderName) {
        return false;
    }

    @Override
    public String getReturnStatus(String orderName) {
        return null;
    }
}
