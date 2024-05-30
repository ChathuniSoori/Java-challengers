public class Module{
	private String code;
    	private String marksCW;
   	 private String marksTest;
	
    public Module(String code, String marksCW, String marksTest) {
        this.code = code;
        this.marksCW = marksCW;
        this.marksTest = marksTest;
    }

    public String getCode() {
        return this.code;
    }

    public String getMarksCW() {
        return this.marksCW;
    }

    public String getMarksTest() {
        return this.marksTest;
    }

    private double getFinalMark() {
        double cwMarks = Double.parseDouble(this.marksCW);
        double testMarks = Double.parseDouble(this.marksTest);
        return (cwMarks + testMarks) / 2.0; // Average of CW and test marks
    }

    public boolean pass() {
        double finalMark = getFinalMark();
        return finalMark >= 40; // If final mark is 40 or above, student passes
    }
}