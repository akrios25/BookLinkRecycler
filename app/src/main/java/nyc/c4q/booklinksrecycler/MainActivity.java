package nyc.c4q.booklinksrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.booklinksrecycler.controller.BookAdapter;
import nyc.c4q.booklinksrecycler.model.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);

        List<Book> bookList =  new ArrayList<>();
        bookList.add(new Book(R.drawable.foundation, "Foundation", "Isaac Asimov", "<a href=\"https://en.wikipedia.org/wiki/Foundation_(Asimov_novel)\">Isaac Asimov</a>"));
        bookList.add(new Book(R.drawable.eldritch, "Necronomicon", "H.P Lovecraft", "<a href=\"https://en.wikipedia.org/wiki/Necronomicon\">H. P. Lovecraft</a>"));
        bookList.add(new Book(R.drawable.sandman, "Sandman: Overture", "Neil Gaiman", "<a href=\"http://sandman.wikia.com/wiki/Overture\">Neil Gaiman</a>"));
        bookList.add(new Book(R.drawable.shaman, "Way of the Shaman", "Michael Harner", "<a href=\"https://www.amazon.com/Way-Shaman-Michael-Harner/dp/0062503731\">Michael Harner</a>"));


        BookAdapter bookAdapter = new BookAdapter(bookList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);
    }
}
