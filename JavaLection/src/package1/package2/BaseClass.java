package package1.package2;

public  class BaseClass {
    public Object calculate;
    private int size;

      public  int calculate(){
            return size * 2;
        }
    @Override
    public String toString() {
        return "BaseClass{" + "size=" + size + '}';
    }

    public Object getSize() {
        return this.size * 2;
    }

    public void setSize(int i) {
    }


    //   private int size;

}

