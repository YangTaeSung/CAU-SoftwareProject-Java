package lab04;

class Km2Mile extends Converter
{
	public Km2Mile(double km)
	{
		convert(km);
	}
	
	public static void main(String args[]) {
		Km2Mile toMile = new Km2Mile(1.6); // 1∏∂¿œ¿∫ 1.6Km
		toMile.run();
	}
}