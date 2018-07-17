package sg.edu.rp.c346.customlistview;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //declaring variable
    ListView lvMovie;

    //create array
    ArrayList<MovieItem> alMovieList;

    //create array adapter
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking variable to UI element
        lvMovie=findViewById(R.id.listViewMovie);

        //initialize array lsit
        alMovieList=new ArrayList<>();

        //create object
        MovieItem movie1=new MovieItem("Avengers Infinity War","Release Date:2018.04");
        MovieItem movie2=new MovieItem("Justice League","Realease Date:2017.11");

        //put object into arraylist
        alMovieList.add(movie1);
        alMovieList.add(movie2);

        caMovie=new CustomAdapter(this,R.layout.movie_item, alMovieList);
        lvMovie.setAdapter(caMovie);

    }
}
