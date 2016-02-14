import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by daejin on 2016-02-14.
 */
public class S1 {

    public static String randomID ( int id_size ){

        String possible = "abcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder id = new StringBuilder("");

        for(int i=0; i < id_size; i++){
            int idx = (int)(Math.floor(Math.random() * possible.length()));
            id.append(possible.charAt((idx)));
        }

        return id.toString();

    }

    public static long betweenDays( String a, String b) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date ad = formatter.parse(a);
        Date bd = formatter.parse(b);

        long lc = bd.getTime() - ad.getTime();

        long _MS_PER_DAY = 1000 * 60 * 60 * 24;

        return lc / _MS_PER_DAY;

    }

}
