package banyuan.itcom;

import java.text.ParseException;

public interface FuException {
    void  add() throws  RuntimeException;

    void  del() throws  NullPointerException,ArrayIndexOutOfBoundsException,ArithmeticException;

    void   update() ;

}
