import java.text.DecimalFormat;

public class Formatter
{   
    private static DecimalFormat fmt = new DecimalFormat("#,##0.00");
    
    public static String format(double value)
    {
        return fmt.format(value);
    }
}