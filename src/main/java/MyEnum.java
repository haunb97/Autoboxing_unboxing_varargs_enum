public enum MyEnum {
    CAFE("cà phê"), TEA("trà");
    private String name;


    MyEnum(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
