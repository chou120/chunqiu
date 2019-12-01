package banyuan.com.cn.io;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter  implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {

        //dir  目录中的文件被找到
        if(dir.exists()){
            return name.endsWith(".pdf")||name.endsWith(".doc");
        }

        return false;
    }
}
