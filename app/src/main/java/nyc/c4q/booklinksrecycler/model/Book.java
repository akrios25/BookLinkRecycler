package nyc.c4q.booklinksrecycler.model;

import android.support.annotation.DrawableRes;
import android.widget.ImageView;

/**
 * Created by c4q on 11/11/17.
 */

public class Book {
    private int bookImage;
    private String title;
    private String author;
    private String link;

    public Book(int bookImage, String title, String author, String link){
        this.bookImage = bookImage;
        this.title = title;
        this.author = author;
        this.link = link;
    }
    public int getImage(){
        return bookImage;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getLink(){
        return link;
    }
}



