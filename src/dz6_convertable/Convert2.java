package dz6_convertable;

public class Convert2 implements Convertable
{ @Override
public float convert(float c)
{
    float k = (float) (c + 273.15);
    return k;
}
}
