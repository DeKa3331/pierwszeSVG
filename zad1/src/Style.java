public class Style {
    private String fill;
    private String straw;
    private double StrokeWidth;
    public String getFill() {
        return fill;
    }
    public void setFill(String fill) {
        this.fill = fill;
    }
    public String getStraw() {
        return straw;
    }
    public void setStraw(String straw) {
        this.straw = straw;
    }
    public double getStrokeWidth() {
        return StrokeWidth;
    }
    public void setStrokeWidth(double strokeWidth) {
        StrokeWidth = strokeWidth;
    }
    public Style(String fill, String straw, double strokeWidth) {
        this.fill = fill;
        this.straw = straw;
        StrokeWidth = strokeWidth;
    }
    String toSvg()
    {
        /* return zamiast string_code */
        String code=" style=\"fill:" + fill + ";" + "stroke:" + straw + ";" + "stroke_width:" + StrokeWidth + "\"";

         return code;
    }






}
