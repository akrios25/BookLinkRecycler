package nyc.c4q.booklinksrecycler.view;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.booklinksrecycler.R;
import nyc.c4q.booklinksrecycler.model.Book;

/**
 * Created by c4q on 11/11/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView bookImage;
    private TextView title;
    private TextView author;
    private TextView bookLink;


    public BookViewHolder(View itemView) {
        super(itemView);
        bookImage = (ImageView) itemView.findViewById(R.id.book_imageview);
        title = (TextView) itemView.findViewById(R.id.title_textview);
        author = (TextView) itemView.findViewById(R.id.author_textview);
        bookLink = (TextView) itemView.findViewById(R.id.link_textview);
    }

    public void onBind(Book book) {
        bookImage.setImageResource(book.getImage());
        title.setText("Title: " + book.getTitle());
        author.setText("Author: " + book.getAuthor());
        bookLink.setMovementMethod(LinkMovementMethod.getInstance());
        bookLink.setText(Html.fromHtml(book.getLink()));
    }
}
