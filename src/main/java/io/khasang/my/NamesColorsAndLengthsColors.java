package io.khasang.my;

/**
 * class NamesColorsAndLengthsColors v.001
 * Required for work of traffic light
 * Created by Khomov Alexander 01.06.2016
 */
public class NamesColorsAndLengthsColors {
    private String NAMEREDCOLOR = "RED";
    private String NAMEYELLOWCOLOR = "YELLOW";
    private String NAMEGREENCOLOR = "GREEN";

    public String getNAMEREDCOLOR() {
        return NAMEREDCOLOR;
    }
    public String getNAMEYELLOWCOLOR() {
        return NAMEYELLOWCOLOR;
    }
    public String getNAMEGREENCOLOR() {
        return NAMEGREENCOLOR;
    }

    private final long LENGTHREDCOLOR = 5;
    private final long LENGTHYELLOWCOLOR = 3;
    private final long LENGTHGREENCOLOR = 2;

    public long getLENGTHREDCOLOR() {
        return LENGTHREDCOLOR;
    }
    public long getLENGTHYELLOWCOLOR() {
        return LENGTHYELLOWCOLOR;
    }
    public long getLENGTHGREENCOLOR() {
        return LENGTHGREENCOLOR;
    }

    public final long sumAllColors(){
       long sum = LENGTHREDCOLOR + LENGTHYELLOWCOLOR + LENGTHGREENCOLOR;
        return sum;
    }
}