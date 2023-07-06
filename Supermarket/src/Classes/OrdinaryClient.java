package Classes;

public class OrdinaryClient extends Actor {
    // private boolean setTakeOrder;
    // private boolean setMakeOrder;

    public OrdinaryClient(String name) {
        super(name);
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

    // public boolean isSetTakeOrder() {
    //     return setTakeOrder;
    // }

    // public void setSetTakeOrder(boolean setTakeOrder) {
    //     this.setTakeOrder = setTakeOrder;
    // }

    // public boolean isSetMakeOrder() {
    //     return setMakeOrder;
    // }

    // public void setSetMakeOrder(boolean setMakeOrder) {
    //     this.setMakeOrder = setMakeOrder;
    // }

    // @Override
    // public String getName() {
    //     return name;
    // }
}
