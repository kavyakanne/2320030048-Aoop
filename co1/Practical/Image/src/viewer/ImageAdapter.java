package viewer;

public class ImageAdapter implements ImageViewer{
	AdvImageViewer advImageViewer;
	
	public ImageAdapter(String imagetype) {
        if (imagetype.equalsIgnoreCase("png")) {
            advImageViewer = new Png();
        } else if (imagetype.equalsIgnoreCase("jpg")) {
            advImageViewer = new Jpg();
        }
    }

   
    public void show(String imagetype, String filename) {
        if (imagetype.equalsIgnoreCase("png")) {
            advImageViewer.showpng(filename);
        } else if (imagetype.equalsIgnoreCase("jpg")) {
            advImageViewer.showjpg(filename);
        }
    }

}
