package gr.xe.java.codechallenge;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Ad {
    protected String id;
    protected String text;
    protected int customerId;
    protected Date createdAt;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Ad()
    {
        id = UUID.randomUUID().toString();
        text = "This is the ad text";

        Random rnd = new Random();

        customerId = Math.abs(rnd.nextInt(500));
        createdAt = Calendar.getInstance().getTime();
    }
}