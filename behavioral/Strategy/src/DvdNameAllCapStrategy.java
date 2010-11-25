public class DvdNameAllCapStrategy extends DvdNameStrategy {
   public String formatDvdName(String dvdName, char charIn) {
       return dvdName.toUpperCase();
   }
}
