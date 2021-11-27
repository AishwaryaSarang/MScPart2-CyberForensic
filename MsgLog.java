/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mscpart2cyberpracs27;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Aishwarya Sarang
 * 27
 */
public class MsgLog {

    protected static String defaultLogFile = "d:\\msglog.txt";

    public static void write(String s) throws IOException {
        write(defaultLogFile, s);
    }

    public static void write(String f, String s) throws IOException {
        TimeZone tz = TimeZone.getTimeZone("EST");//or PST,MID,etc..
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        df.setTimeZone(tz);
        String currentTime = df.format(now);
        FileWriter awriter = new FileWriter(f, true);
        awriter.write(currentTime + " " + s + "\n");
        awriter.flush();
        awriter.close();
    }

    public static void main(String args[]) throws Exception {
        write(args[0]);
    }
}
