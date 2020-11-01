public class testjava {
    public static void main(String[] args) {
        System.out.println(SongDecoder("WUBWUBABCWUB"));
    }

    public static String SongDecoder(String song) {
        String yo = song.replace("WUB", "");
            return yo;
    }
}