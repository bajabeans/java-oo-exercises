package javagram.filters;

import javagram.Picture;

public interface Filter {
	
	public Picture getNewImage(Picture original);

}
