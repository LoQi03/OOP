package myPackage;

import java.awt.Color;

public class CustomColor extends Color {
	public CustomColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	@Override
	public String toString() {
		if (this.equals(WHITE)) return "fehér";
		if (this.equals(LIGHT_GRAY)) return "világos szürke";
		if (this.equals(GRAY)) return "szürke";
		if (this.equals(DARK_GRAY)) return "sötét szürke";
		if (this.equals(BLACK)) return "fekete";
		if (this.equals(PINK)) return "pink";
		if (this.equals(ORANGE)) return "narancs";
		if (this.equals(YELLOW)) return "sárga";
		if (this.equals(GREEN)) return "zöld";
		if (this.equals(MAGENTA)) return "magenta";
		if (this.equals(CYAN)) return "cyan";
		if (this.equals(BLUE)) return "kék";
		return "?";
	}
}