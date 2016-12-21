package tubetracker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

public class Video {

    private int id;
    private String name;
    private String desc;
    private String views;
    private String url;
    private String pub;
    private String com;
    private double length;
    private String descFormated;

    public Video(String url) {
        this.url = url;
        try {
            Document video = Jsoup.connect(url).get();
            name = video.getElementsByTag("title").text();
            desc = video.getElementById("eow-description").text();
            views = video.getElementsByClass("watch-view-count").text();
            pub = video.getElementsByClass("watch-time-text").text();
            com = video.getElementById("watch-description-clip").html();
                    
        } catch (IOException ex) {
            System.err.println("Fucked up crawling: " + url);
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
       
          Whitelist whitelist = new Whitelist();
  whitelist.addTags("br");
  
        
        String clean = Jsoup.clean(com, whitelist);
        clean = clean.replaceAll("<br><br>", "\n");
        clean = clean.replaceAll("<br>", "\n");
        
        
       
        System.out.println(name);
        System.out.println(views);
        System.out.println(pub);
        System.out.println(clean);
        System.out.println(url + "\n\n");
        
                            

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getDescFormated() {
        return descFormated;
    }

    public void setDescFormated(String descFormated) {
        this.descFormated = descFormated;
    }
    
}
