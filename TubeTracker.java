package tubetracker;

import java.util.ArrayList;

public class TubeTracker {

    public static void main(String[] args) {
        init();
    }

    public static void init() {
  


        ArrayList<Video> videos = new ArrayList<Video>();
        Playlist playlist1 = new Playlist("https://www.youtube.com/watch?v=i9AbPqybBPc&list=PL1bauNEiHIgyHtNfI-eIZDUfkNlz_TL2Z");
        
             Window window = new Window(videos);
        
        for(int i=0;i<playlist1.getUrls().size();i++){
            videos.add(new Video(playlist1.getUrls().get(i)));
            
            String current = window.getTextArea();
            window.setTextArea(current + videos.get(i).getName() 
                    + "\n" + videos.get(i).getUrl()
                    + "\n" + videos.get(i).getViews()
                    + "\n" + i
                    + "\n\n" );
                    
            
        }
                
                
       

    }
}
