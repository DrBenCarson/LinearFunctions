
public class LinearFunction implements LinearFunctionMethods{
	public double s;
	public double yy;
	
	public LinearFunction(double sl, double yi)
	{
		s=sl;
		yy=yi;
	}
		public double getSlope() {
		
		return s;
	}

		public double getYintercept() {
		
		return yy;
	}

	
		public double getRoot() {
		
		return 0;
	}

	
		public double getYvalue(double x) {
		double f=(x*s)+(yy);
		return f;
	}

	
		public double getXvalue(double y) {
		double g=((y-(yy))/s);
		return g;
	}
	
}
