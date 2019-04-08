package gr.xe.java.codechallenge;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Search {
    protected String searchId;
    protected Ad[] results;
    protected String searchText;
    protected Date createdAt;

    public String getSearchId() {
        return searchId;
    }

    public Ad[] getSearchResults() {
        return results;
    }

    public String getSearchText() {
        return searchText;
    }

    public Search()
    {
        Random rnd = new Random();

        int numberOfResults =  Math.max(50, rnd.nextInt(500));
        results = new Ad[numberOfResults];

        for (int i = 0; i < numberOfResults; i++)
        {
            results[i] = new Ad();
        }

        searchId = UUID.randomUUID().toString();
        createdAt = Calendar.getInstance().getTime();
    }
}