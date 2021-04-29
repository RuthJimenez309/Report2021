package Gestion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Gestion_CVS {

    public void ReadCSV () {
        try {
            BufferedReader Read = new BufferedReader(new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }

                @Override
                public void close() throws IOException {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void Gestion_Cvs() {
    }
}
