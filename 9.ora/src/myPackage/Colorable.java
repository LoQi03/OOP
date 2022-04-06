package myPackage;

import java.awt.Color;

public interface Colorable {
	
	Color defaultColor = Color.RED;
	
	public Color getColor();
	
	public void setColor(Color inputColor);
	
	public static void setDefaultColor(Colorable colorable)
	{
		colorable.setColor(Color.RED);
	}
	
	
}
