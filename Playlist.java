package tubetracker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Playlist {

    private String url;
    private ArrayList<String> urls = new ArrayList<String>();

    public Playlist(String url) {

        try {
            Document video = Jsoup.connect(url).get();
            Elements links = video.getElementsByClass("playlist-videos-list yt-uix-scroller");
            Elements hyperlinks = links.select("a[href]");

            for (Element element : hyperlinks) {
                  urls.add("https://www.youtube.com" + element.attr("href"));
            }

        } catch (IOException ex) {
            System.err.println("Fucked up crawling: " + url);
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      

    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }
    
    

}
