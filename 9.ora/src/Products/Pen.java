package Products;
import java.awt.Color;
import myPackage.Colorable;
import myPackage.CustomColor;

public class Pen extends Product implements Colorable{


	private Color penColor;
	private String brandName;
	
	public Pen(String brandName, Color pencolor, int price)
	{
		super("pen",price,27);
		this.brandName=brandName;
		this.penColor = new CustomColor(pencolor);
	}

	@Override
	public Color getColor() {
		return penColor;
	}

	@Override
	public void setColor(Color inputColor) {
		this.penColor = new CustomColor(penColor);
	}
	
	@Override
	public String toString() {
		return "Pen [penColor=" + penColor + ", brandName=" + brandName + "]";
	}
}
