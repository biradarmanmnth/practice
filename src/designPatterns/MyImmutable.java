package designPatterns;






public final class MyImmutable{

    private final String name;
    private final String address;

    private MyImmutable(String n, String a){
        this.name=n;
        this.address=a;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public MyImmutable getInstance(String name,String address){
        return new MyImmutable(name,address);
    }

}




























