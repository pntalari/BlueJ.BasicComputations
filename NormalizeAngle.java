
public class NormalizeAngle {
    final int stdAngle = 360;
    public Integer normalizeValueUsingModulo(Integer angle)
    {
        int result = angle % stdAngle;
        return result;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer)
    {
        int result = Math.floorMod(integer,stdAngle);
        return result;
    }

    public static void main(String[] args)
    {
        NormalizeAngle angleObj = new NormalizeAngle();
        angleObj.normalizeValueUsingModulo(500);
        
    }
}
