package nyc.c4q.designpatternice.enums;



public enum MoonPhases {


    NEW_MOON("1st phase"),
    WAXING_CRESCENT("2nd phase"),
    FIRST_QUARTER("3rd phase"),
    WAXING_GIBBOUS("4th phase"),
    FULL_MOON("5th phase"),
    WANNING_GIBBOUS("6th phase"),
    LAST_QUARTER("7th phase"),
    WANNING_CRESCENT("Last phase");

    private String WhichPhase;

    private MoonPhases (String whichPhase){
        this.WhichPhase = whichPhase;

    }


    @Override
    public String toString(){
        return WhichPhase;
    }

}
