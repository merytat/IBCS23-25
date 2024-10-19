package UnitP5;

import java.util.Date;

public class Email extends Document {
    private String subject;
    private String[] to;

    public Email(String[] authors, Date date, String subject, String[] to) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject(){
        return "";

    }

    public String[] getTo(){
        return null;

    }
}
