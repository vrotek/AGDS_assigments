package AS08.e02;

public enum ChocolateTypes {

    BUENO("Kinder Bueno"),
    KINDER_SCHOKOLADE("Kinder Schokolade"),
    LINDT("Lindt 80% Dark Chocolate"),
    FERRERO("Ferrero Rocher");

    private String name;
    ChocolateTypes(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
