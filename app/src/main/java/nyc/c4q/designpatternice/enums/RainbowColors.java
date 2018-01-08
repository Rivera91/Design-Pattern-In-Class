package nyc.c4q.designpatternice.enums;



public enum RainbowColors {


    RED(""),
    ORANGE(""),
    YELLOW(""),
    GREEN("I am Green with Envy"),
    BLUE("I am blue, cheer me up"),
    INDIGO(""),
    VIOLET("");

    private String Color;

    private RainbowColors(String color){
        this.Color = color;
    }
    @Override
    public String toString(){ return Color;}
}
