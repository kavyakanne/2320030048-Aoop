package viewer;

public class Gallery implements ImageViewer{
	
	 ImageAdapter imageAdapter;
	 
	public void show(String imagetype, String filename) {
        if (imagetype.equalsIgnoreCase("png") || imagetype.equalsIgnoreCase("jpg")) {
            imageAdapter = new ImageAdapter(imagetype);
            imageAdapter.show(imagetype, filename);
        } else {
            System.out.println("Invalid " + imagetype );
        }
    }

}
