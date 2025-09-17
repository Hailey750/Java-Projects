public class Car 
{
private String vin;
private String make;
private String model;
private double gps_x;
private double gps_y;
private short speed;

Car(String v, String ma, String mo)
{
vin = v;
make = ma;
model = mo;
gps_x = 31.56445;
gps_y = 45.43378;
speed = 0;
}

public String getVin()
{
	return vin;
}

public String getMake()
{
	return make;
}

public String getModel()
{
	return model;
}

public double getGPSx()
{
	return gps_x;
}

public short getSpeed()
{
	return speed;
}

public short accelerate (Short s)
{
	speed += s;
	return speed;
}

public short brake (short s)
{
	return accelerate ((short)-s);
}

@Override
public String toString()
{
	String output = String.format("\n***************\nVIN: %s\nMAKE: %s\nMODEL: %s\n***************\n", vin,make,model);
	return output;
}
}
