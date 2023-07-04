
public class triangle {
    static double area (double base, double height) throws Exception {
        if(base < 0)
            throw new Exception("Base should be greater than 0");
        if(height < 0)
            throw new Exception("Height should be greater than 0");

        return (base/2) * height;
    }
}
