package banyuan.itcom;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SonExceptionImpl implements  FuException {
    @Override
    public void add()  throws RuntimeException {

    }

    @Override
    public void del() throws NullPointerException, ArithmeticException {

    }

    @Override
    public void update()  {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        String str="2019/01/01";
        try {
            sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
