package feladat2;

public class SoundDisc {
	
	private String title;
	private String author;
	private int length;
	
	public SoundDisc(String title,String author,int length)
	{
		this.title=title;
		this.author=author;
		this.length=length;
	}
	public SoundDisc()
	{
		
	}

	@Override
	public String toString() {
		return author+": "+title+" "+length+"min";
	}
	public int comparateLength(SoundDisc x)
	{
		if(this.length>x.length)
		{
			return 1;
		}
		else if(this.length<x.length)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public boolean checkAuthor(String x)
	{
		return this.author.equals(x);
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
