package part2;
import part2.Marker;
import java.util.Arrays;
public class Markers {
public static void main(String[]args)
{
	Marker m[]={new Marker("blue",20),
			new Marker("black",18),
			new Marker("green",19)};
	Arrays.sort(m);
	for( int i=0;i<m.length;i++)
	{
		System.out.println(m[i]);
	}
	}
}
