package Classes;

public class SpecialClient extends Actor{
    private int idVip;
    public SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
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

    // @Override
    // public String getName() {
    //     return name;
    // }

    // public int getIdVip() {
    //     return idVip;
    // }
}
