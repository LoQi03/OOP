package Points;

import java.awt.Color;

import myPackage.Colorable;

public class ColoredPoint extends Point implements Colorable{

		private Color color;
		
		public ColoredPoint()
		{
			super(0,0);
			this.color=defaultColor;
		}
		
		public ColoredPoint(Color color) 
		{
			super(0, 0);
			this.color=color;
		}

		public ColoredPoint(int x, int y, Color color)
		{
			super(x,y);
			this.color=color;
		}
		
		@Override
		public String toString() {
			return "ColoredPoint [getColor()=" + getColor() + ", getX()=" + getX() + ", getY()=" + getY() + "]";
		}
		
		@Override
		public Color getColor() {
			return color;
		}
		@Override
		public void setColor(Color inputColor) {
			color = inputColor;	
		}
			
}
