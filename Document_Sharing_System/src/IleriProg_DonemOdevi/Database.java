package IleriProg_DonemOdevi;

import java.io.*;
import java.util.*;

class Database {

    final static String LINE_SEP = System.getProperty("line.separator");
    static Map<Integer, Student> std = new LinkedHashMap<>();
    static Map<Integer, Dosya> dosyalar = new LinkedHashMap<>();
    static Collection<Dosya> dosya_data1 = new ArrayList<>();

    public Database() {
        InputStream in = getClass().getResourceAsStream("Students.txt");
        Scanner read = new Scanner(in);
        read.useDelimiter("%");

        try {

            for (String line : readLines(in)) {
                Student s = new Student(line);
                std.put(s.id, s);
                Student.ogrenciler.add(s);

            }
        } catch (IOException x) {
            System.out.println(x);
        }

    }

    static String[] readLines(InputStream in) throws IOException {
        byte[] ba = new byte[in.available()];
        in.read(ba);
        in.close();
        String str = new String(ba, "UTF-8");
        String[] sa = str.split("\n");

        System.out.printf("%s satir okundu %n", sa.length);
        return sa;
    }

    public Student findStudent(int k) {
        return std.get(k);
    }

}
