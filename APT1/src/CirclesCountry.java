
public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
    		int sum = 0;
    		for (int i = 0; i < x.length; i++) {
    			if (inCircle(x[i], y[i], r[i], x1, y1) && !(inCircle(x[i], y[i], r[i], x2, y2))) {
    				sum += 1;
    			}
    			if (inCircle(x[i], y[i], r[i], x2, y2) && !(inCircle(x[i], y[i], r[i], x1, y1))) {
    				sum += 1;
    			}
    			
    		}
    		return sum;
    }
    public boolean inCircle(int circleX, int circleY, int radius, int pointX, int pointY) {
    		if (Math.sqrt(Math.pow(Math.abs(pointX - circleX), 2) + Math.pow(Math.abs(pointY - circleY), 2)) < radius) {
    			return true;
    		}
    		return false;
    }
}
