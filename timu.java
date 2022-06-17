import java.util.*;
import java.time.format.*;
import java.text.*;

public class Main
{
	public static void main(String[] args) {
	    Date d =new Date("13/13/22");
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    System.out.print(sdf.format(d));

	}
}
