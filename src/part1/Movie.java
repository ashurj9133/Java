package part1;

import java.util.Objects;

public class Movie {
	String mname;
	double duration;
	int rating;
	Movie()
	{}
	public Movie(String mname,double duration,int rating)
	{
		this.mname=mname;
		this.duration=duration;
		this.rating=rating;
	}
	@Override
	public String toString() {
		return "Movie [mname=" + mname + ", duration=" + duration + ", rating=" + rating + "]";
	}
	@Override
	public boolean equals(Object o)
	{
	Movie m=(Movie)o;
	return this.mname.equals(m.mname)&&this.duration==m.duration&&this.rating==m.rating;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(mname,duration,rating);
	}
	
	

}
