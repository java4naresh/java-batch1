package corejavaprograms;

public class BikeModels implements Comparable
{
	int bikeNum;
	String brand;
	int speed;
	double milage;
	String colour;
	long price;
	
	public BikeModels(int bikeNum, String brand, int speed, double milage, String colour, long price) 
	{
		super();
		this.bikeNum = bikeNum;
		this.brand = brand;
		this.speed = speed;
		this.milage = milage;
		this.colour = colour;
		this.price = price;
	}

	public final int getBikeNum()
	{
		return bikeNum;
	}

	public final void setBikeNum(int bikeNum)
	{
		this.bikeNum = bikeNum;
	}

	public final String getBrand()
	{
		return brand;
	}

	public final void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public final int getSpeed()
	{
		return speed;
	}

	public final void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public final double getMilage() 
	{
		return milage;
	}

	public final void setMilage(double milage) 
	{
		this.milage = milage;
	}

	public final String getColour()
	{
		return colour;
	}

	public final void setColour(String colour)
	{
		this.colour = colour;
	}

	public final long getPrice()
	{
		return price;
	}

	public final void setPrice(long price)
	{
		this.price = price;
	}
	
	
	@Override
	public String toString()
	{
		return "BikeModels [bikeNum=" + bikeNum + ", brand=" + brand + ", speed=" + speed + ", milage=" + milage
				+ ", colour=" + colour + ", price=" + price + "]";
	}

	@Override
	public int hashCode() 
	{
		/*final int prime = 31;
		int result = 1;
		result = prime * result + bikeNum;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		long temp;
		temp = Double.doubleToLongBits(milage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + speed;
		return result;*/
		return this.bikeNum;
	}

	@Override
	public boolean equals(Object obj)
	{
		BikeModels bikes=(BikeModels)obj;
		if(this.bikeNum == bikes.getBikeNum() && this.brand == bikes.getBrand() && this.speed == bikes.getSpeed() && this.milage == bikes.getMilage() && this.colour == bikes.getColour() && this.price == bikes.getPrice())
			return true;
		return false;
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BikeModels other = (BikeModels) obj;
		if (bikeNum != other.bikeNum)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (Double.doubleToLongBits(milage) != Double.doubleToLongBits(other.milage))
			return false;
		if (price != other.price)
			return false;
		if (speed != other.speed)
			return false;
		return true;*/
	}

	@Override
	public int compareTo(Object ob)
	{
		BikeModels bike=(BikeModels)ob;
		return this.brand.compareTo(bike.getBrand());
	}
	
	
	
	
}
